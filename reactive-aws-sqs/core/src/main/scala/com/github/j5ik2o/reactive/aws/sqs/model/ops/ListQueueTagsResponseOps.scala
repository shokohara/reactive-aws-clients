// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class ListQueueTagsResponseBuilderOps(val self: ListQueueTagsResponse.Builder) extends AnyVal {

  final def tagsAsScala(value: Option[Map[String, String]]): ListQueueTagsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.tags(v.asJava)
    }
  }

}

final class ListQueueTagsResponseOps(val self: ListQueueTagsResponse) extends AnyVal {

  final def tagsAsScala: Option[Map[String, String]] = Option(self.tags).map { v =>
    import scala.collection.JavaConverters._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListQueueTagsResponseOps {

  implicit def toListQueueTagsResponseBuilderOps(v: ListQueueTagsResponse.Builder): ListQueueTagsResponseBuilderOps =
    new ListQueueTagsResponseBuilderOps(v)

  implicit def toListQueueTagsResponseOps(v: ListQueueTagsResponse): ListQueueTagsResponseOps =
    new ListQueueTagsResponseOps(v)

}
