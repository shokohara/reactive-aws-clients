// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class RetrieveEnvironmentInfoRequestBuilderOps(val self: RetrieveEnvironmentInfoRequest.Builder) extends AnyVal {

  final def environmentIdAsScala(value: Option[String]): RetrieveEnvironmentInfoRequest.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  }

  final def environmentNameAsScala(value: Option[String]): RetrieveEnvironmentInfoRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  final def infoTypeAsScala(value: Option[EnvironmentInfoType]): RetrieveEnvironmentInfoRequest.Builder = {
    value.fold(self) { v =>
      self.infoType(v)
    }
  }

}

final class RetrieveEnvironmentInfoRequestOps(val self: RetrieveEnvironmentInfoRequest) extends AnyVal {

  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  final def infoTypeAsScala: Option[EnvironmentInfoType] = Option(self.infoType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToRetrieveEnvironmentInfoRequestOps {

  implicit def toRetrieveEnvironmentInfoRequestBuilderOps(
      v: RetrieveEnvironmentInfoRequest.Builder
  ): RetrieveEnvironmentInfoRequestBuilderOps = new RetrieveEnvironmentInfoRequestBuilderOps(v)

  implicit def toRetrieveEnvironmentInfoRequestOps(
      v: RetrieveEnvironmentInfoRequest
  ): RetrieveEnvironmentInfoRequestOps = new RetrieveEnvironmentInfoRequestOps(v)

}
