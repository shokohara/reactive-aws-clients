// Auto-Generated
package com.github.j5ik2o.reactive.aws.sqs.model.ops

import software.amazon.awssdk.services.sqs.model._

final class SendMessageResponseBuilderOps(val self: SendMessageResponse.Builder) extends AnyVal {

  final def md5OfMessageBodyAsScala(value: Option[String]): SendMessageResponse.Builder = {
    value.fold(self) { v =>
      self.md5OfMessageBody(v)
    }
  }

  final def md5OfMessageAttributesAsScala(value: Option[String]): SendMessageResponse.Builder = {
    value.fold(self) { v =>
      self.md5OfMessageAttributes(v)
    }
  }

  final def messageIdAsScala(value: Option[String]): SendMessageResponse.Builder = {
    value.fold(self) { v =>
      self.messageId(v)
    }
  }

  final def sequenceNumberAsScala(value: Option[String]): SendMessageResponse.Builder = {
    value.fold(self) { v =>
      self.sequenceNumber(v)
    }
  }

}

final class SendMessageResponseOps(val self: SendMessageResponse) extends AnyVal {

  final def md5OfMessageBodyAsScala: Option[String] = Option(self.md5OfMessageBody)

  final def md5OfMessageAttributesAsScala: Option[String] = Option(self.md5OfMessageAttributes)

  final def messageIdAsScala: Option[String] = Option(self.messageId)

  final def sequenceNumberAsScala: Option[String] = Option(self.sequenceNumber)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSendMessageResponseOps {

  implicit def toSendMessageResponseBuilderOps(v: SendMessageResponse.Builder): SendMessageResponseBuilderOps =
    new SendMessageResponseBuilderOps(v)

  implicit def toSendMessageResponseOps(v: SendMessageResponse): SendMessageResponseOps = new SendMessageResponseOps(v)

}
