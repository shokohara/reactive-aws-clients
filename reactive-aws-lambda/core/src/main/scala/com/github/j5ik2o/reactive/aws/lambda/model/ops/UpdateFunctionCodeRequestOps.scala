// Auto-Generated
package com.github.j5ik2o.reactive.aws.lambda.model.ops

import software.amazon.awssdk.services.lambda.model._

final class UpdateFunctionCodeRequestBuilderOps(val self: UpdateFunctionCodeRequest.Builder) extends AnyVal {

  final def functionNameAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.functionName(v)
    }
  }

  final def zipFileAsScala(value: Option[software.amazon.awssdk.core.SdkBytes]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.zipFile(v)
    }
  }

  final def s3BucketAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.s3Bucket(v)
    }
  }

  final def s3KeyAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.s3Key(v)
    }
  }

  final def s3ObjectVersionAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.s3ObjectVersion(v)
    }
  }

  final def publishAsScala(value: Option[Boolean]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.publish(v)
    }
  }

  final def dryRunAsScala(value: Option[Boolean]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.dryRun(v)
    }
  }

  final def revisionIdAsScala(value: Option[String]): UpdateFunctionCodeRequest.Builder = {
    value.fold(self) { v =>
      self.revisionId(v)
    }
  }

}

final class UpdateFunctionCodeRequestOps(val self: UpdateFunctionCodeRequest) extends AnyVal {

  final def functionNameAsScala: Option[String] = Option(self.functionName)

  final def zipFileAsScala: Option[software.amazon.awssdk.core.SdkBytes] = Option(self.zipFile)

  final def s3BucketAsScala: Option[String] = Option(self.s3Bucket)

  final def s3KeyAsScala: Option[String] = Option(self.s3Key)

  final def s3ObjectVersionAsScala: Option[String] = Option(self.s3ObjectVersion)

  final def publishAsScala: Option[Boolean] = Option(self.publish)

  final def dryRunAsScala: Option[Boolean] = Option(self.dryRun)

  final def revisionIdAsScala: Option[String] = Option(self.revisionId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateFunctionCodeRequestOps {

  implicit def toUpdateFunctionCodeRequestBuilderOps(
      v: UpdateFunctionCodeRequest.Builder
  ): UpdateFunctionCodeRequestBuilderOps = new UpdateFunctionCodeRequestBuilderOps(v)

  implicit def toUpdateFunctionCodeRequestOps(v: UpdateFunctionCodeRequest): UpdateFunctionCodeRequestOps =
    new UpdateFunctionCodeRequestOps(v)

}
