// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class ListPlatformVersionsRequestBuilderOps(val self: ListPlatformVersionsRequest.Builder) extends AnyVal {

  final def filtersAsScala(value: Option[Seq[PlatformFilter]]): ListPlatformVersionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.filters(v.asJava)
    }
  }

  final def maxRecordsAsScala(value: Option[Int]): ListPlatformVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.maxRecords(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListPlatformVersionsRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListPlatformVersionsRequestOps(val self: ListPlatformVersionsRequest) extends AnyVal {

  final def filtersAsScala: Option[Seq[PlatformFilter]] = Option(self.filters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def maxRecordsAsScala: Option[Int] = Option(self.maxRecords)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListPlatformVersionsRequestOps {

  implicit def toListPlatformVersionsRequestBuilderOps(
      v: ListPlatformVersionsRequest.Builder
  ): ListPlatformVersionsRequestBuilderOps = new ListPlatformVersionsRequestBuilderOps(v)

  implicit def toListPlatformVersionsRequestOps(v: ListPlatformVersionsRequest): ListPlatformVersionsRequestOps =
    new ListPlatformVersionsRequestOps(v)

}
