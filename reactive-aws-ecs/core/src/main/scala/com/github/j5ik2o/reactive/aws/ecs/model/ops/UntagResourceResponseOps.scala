// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class UntagResourceResponseBuilderOps(val self: UntagResourceResponse.Builder) extends AnyVal {}

final class UntagResourceResponseOps(val self: UntagResourceResponse) extends AnyVal {}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUntagResourceResponseOps {

  implicit def toUntagResourceResponseBuilderOps(v: UntagResourceResponse.Builder): UntagResourceResponseBuilderOps =
    new UntagResourceResponseBuilderOps(v)

  implicit def toUntagResourceResponseOps(v: UntagResourceResponse): UntagResourceResponseOps =
    new UntagResourceResponseOps(v)

}
