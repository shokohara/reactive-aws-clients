// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeClustersResponseBuilderOps(val self: DescribeClustersResponse.Builder) extends AnyVal {

  final def nextTokenAsScala(value: Option[String]): DescribeClustersResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def clustersAsScala(value: Option[Seq[Cluster]]): DescribeClustersResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.clusters(v.asJava)
    }
  }

}

final class DescribeClustersResponseOps(val self: DescribeClustersResponse) extends AnyVal {

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def clustersAsScala: Option[Seq[Cluster]] = Option(self.clusters).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeClustersResponseOps {

  implicit def toDescribeClustersResponseBuilderOps(
      v: DescribeClustersResponse.Builder
  ): DescribeClustersResponseBuilderOps = new DescribeClustersResponseBuilderOps(v)

  implicit def toDescribeClustersResponseOps(v: DescribeClustersResponse): DescribeClustersResponseOps =
    new DescribeClustersResponseOps(v)

}
