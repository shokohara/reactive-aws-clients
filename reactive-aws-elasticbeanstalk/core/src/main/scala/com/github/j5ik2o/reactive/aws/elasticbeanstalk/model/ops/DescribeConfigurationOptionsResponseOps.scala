// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeConfigurationOptionsResponseBuilderOps(val self: DescribeConfigurationOptionsResponse.Builder)
    extends AnyVal {

  final def solutionStackNameAsScala(value: Option[String]): DescribeConfigurationOptionsResponse.Builder = {
    value.fold(self) { v =>
      self.solutionStackName(v)
    }
  }

  final def platformArnAsScala(value: Option[String]): DescribeConfigurationOptionsResponse.Builder = {
    value.fold(self) { v =>
      self.platformArn(v)
    }
  }

  final def optionsAsScala(
      value: Option[Seq[ConfigurationOptionDescription]]
  ): DescribeConfigurationOptionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.options(v.asJava)
    }
  }

}

final class DescribeConfigurationOptionsResponseOps(val self: DescribeConfigurationOptionsResponse) extends AnyVal {

  final def solutionStackNameAsScala: Option[String] = Option(self.solutionStackName)

  final def platformArnAsScala: Option[String] = Option(self.platformArn)

  final def optionsAsScala: Option[Seq[ConfigurationOptionDescription]] = Option(self.options).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeConfigurationOptionsResponseOps {

  implicit def toDescribeConfigurationOptionsResponseBuilderOps(
      v: DescribeConfigurationOptionsResponse.Builder
  ): DescribeConfigurationOptionsResponseBuilderOps = new DescribeConfigurationOptionsResponseBuilderOps(v)

  implicit def toDescribeConfigurationOptionsResponseOps(
      v: DescribeConfigurationOptionsResponse
  ): DescribeConfigurationOptionsResponseOps = new DescribeConfigurationOptionsResponseOps(v)

}
