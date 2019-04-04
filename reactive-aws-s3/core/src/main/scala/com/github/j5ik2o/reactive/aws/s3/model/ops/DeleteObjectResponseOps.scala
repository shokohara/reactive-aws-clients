// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteObjectResponseBuilderOps(val self: DeleteObjectResponse.Builder) extends AnyVal {

  final def withDeleteMarkerAsScala(value: Option[Boolean]): DeleteObjectResponse.Builder = {
    value.fold(self) { v =>
      self.deleteMarker(v)
    }
  } // Boolean

  final def withVersionIdAsScala(value: Option[String]): DeleteObjectResponse.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withRequestChargedAsScala(value: Option[RequestCharged]): DeleteObjectResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // String

}

final class DeleteObjectResponseOps(val self: DeleteObjectResponse) extends AnyVal {

  final def deleteMarkerAsScala: Option[Boolean] = Option(self.deleteMarker) // Boolean

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteObjectResponseOps {

  implicit def toDeleteObjectResponseBuilderOps(v: DeleteObjectResponse.Builder): DeleteObjectResponseBuilderOps =
    new DeleteObjectResponseBuilderOps(v)

  implicit def toDeleteObjectResponseOps(v: DeleteObjectResponse): DeleteObjectResponseOps =
    new DeleteObjectResponseOps(v)

}