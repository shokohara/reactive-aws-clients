// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class PutObjectResponseBuilderOps(val self: PutObjectResponse.Builder) extends AnyVal {

  final def withExpirationAsScala(value: Option[String]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.expiration(v)
    }
  } // String

  final def withETagAsScala(value: Option[String]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.eTag(v)
    }
  } // String

  final def withServerSideEncryptionAsScala(value: Option[ServerSideEncryption]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.serverSideEncryption(v)
    }
  } // String

  final def withVersionIdAsScala(value: Option[String]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.versionId(v)
    }
  } // String

  final def withSseCustomerAlgorithmAsScala(value: Option[String]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerAlgorithm(v)
    }
  } // String

  final def withSseCustomerKeyMD5AsScala(value: Option[String]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.sseCustomerKeyMD5(v)
    }
  } // String

  final def withSsekmsKeyIdAsScala(value: Option[String]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.ssekmsKeyId(v)
    }
  } // String

  final def withRequestChargedAsScala(value: Option[RequestCharged]): PutObjectResponse.Builder = {
    value.fold(self) { v =>
      self.requestCharged(v)
    }
  } // String

}

final class PutObjectResponseOps(val self: PutObjectResponse) extends AnyVal {

  final def expirationAsScala: Option[String] = Option(self.expiration) // String

  final def eTagAsScala: Option[String] = Option(self.eTag) // String

  final def serverSideEncryptionAsScala: Option[ServerSideEncryption] = Option(self.serverSideEncryption) // String

  final def versionIdAsScala: Option[String] = Option(self.versionId) // String

  final def sseCustomerAlgorithmAsScala: Option[String] = Option(self.sseCustomerAlgorithm) // String

  final def sseCustomerKeyMD5AsScala: Option[String] = Option(self.sseCustomerKeyMD5) // String

  final def ssekmsKeyIdAsScala: Option[String] = Option(self.ssekmsKeyId) // String

  final def requestChargedAsScala: Option[RequestCharged] = Option(self.requestCharged) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutObjectResponseOps {

  implicit def toPutObjectResponseBuilderOps(v: PutObjectResponse.Builder): PutObjectResponseBuilderOps =
    new PutObjectResponseBuilderOps(v)

  implicit def toPutObjectResponseOps(v: PutObjectResponse): PutObjectResponseOps = new PutObjectResponseOps(v)

}
