<#include "common.ftl"/>
<#assign baseName=simpleTypeName?replace("AsyncClient", "")/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}

import software.amazon.awssdk.services.${baseName?lower_case}.model._
import software.amazon.awssdk.services.${baseName?lower_case}.paginators._
import software.amazon.awssdk.services.${baseName?lower_case}.{ ${baseName}AsyncClient => Java${baseName}AsyncClient }

import scala.compat.java8.FutureConverters._
import scala.concurrent.Future

object ${baseName}AsyncClient {

def apply(asyncClient: Java${baseName}AsyncClient): ${baseName}AsyncClient = new ${baseName}AsyncClient {
override val underlying: Java${baseName}AsyncClient = asyncClient
}

}

/**
* @see https://sdk.amazonaws.com/java/api/latest/software/amazon/awssdk/services/${baseName?lower_case}/${simpleTypeName}.html
*/
trait ${baseName}AsyncClient extends ${baseName}Client[Future] with ${baseName}AsyncClientSupport {
val underlying: Java${baseName}AsyncClient

<#list methods as method>
    <#if targetAsyncMethod(method)>
        <@defScalaFutureMethod method/>

    </#if>
</#list>
}

<#function targetAsyncMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name == "getObject" || methodDesc.name == "getObjectAsBytes"  || methodDesc.name == "getObjectTorrent" || methodDesc.name == "getObjectTorrentAsBytes">
        <#return false>
    </#if>
    <#if methodDesc.parameterTypeDescs?size gte 2>
        <#return false>
    </#if>
    <#local target=true>
    <#list methodDesc.parameterTypeDescs as p>
        <#if p.parameterTypeDesc.fullTypeName == "Consumer[Builder]">
            <#local target = false>
            <#break >
        </#if>
    </#list>
    <#return target>
</#function>
