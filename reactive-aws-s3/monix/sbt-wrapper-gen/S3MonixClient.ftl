<#include "common.ftl"/>
<#assign baseName=simpleTypeName?replace("AsyncClient", "")/>
// Auto-Generated
package ${packageName?replace("software.amazon.awssdk.services", "com.github.j5ik2o.reactive.aws")}.monix

import software.amazon.awssdk.services.${baseName?lower_case}.model._
import com.github.j5ik2o.reactive.aws.${baseName?lower_case}.{ ${baseName}AsyncClient, ${baseName}Client }
import monix.eval.Task
import monix.reactive.Observable

object ${baseName}MonixClient {

def apply(asyncClient: ${baseName}AsyncClient): ${baseName}MonixClient = new ${baseName}MonixClient {
override val underlying: ${baseName}AsyncClient = asyncClient
}

}

trait ${baseName}MonixClient extends ${baseName}Client[Task] with ${baseName}MonixClientSupport {

val underlying: ${baseName}AsyncClient

<#list methods as method>
    <#if targetMethod(method)>
        <@defMonixMethod method/>

    </#if>
</#list>
}

<#function targetMethod methodDesc>
    <#if methodDesc.static >
        <#return false>
    </#if>
    <#if methodDesc.name == "getObject" || methodDesc.name == "getObjectAsBytes"  || methodDesc.name == "getObjectTorrent" || methodDesc.name == "getObjectTorrentAsBytes"> <#return false>
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
