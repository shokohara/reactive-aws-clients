// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class ConsumerBuilderOps(val self: Consumer.Builder) extends AnyVal {

  final def consumerNameAsScala(value: Option[String]): Consumer.Builder = {
    value.fold(self) { v =>
      self.consumerName(v)
    }
  }

  final def consumerARNAsScala(value: Option[String]): Consumer.Builder = {
    value.fold(self) { v =>
      self.consumerARN(v)
    }
  }

  final def consumerStatusAsScala(value: Option[ConsumerStatus]): Consumer.Builder = {
    value.fold(self) { v =>
      self.consumerStatus(v)
    }
  }

  final def consumerCreationTimestampAsScala(value: Option[java.time.Instant]): Consumer.Builder = {
    value.fold(self) { v =>
      self.consumerCreationTimestamp(v)
    }
  }

}

final class ConsumerOps(val self: Consumer) extends AnyVal {

  final def consumerNameAsScala: Option[String] = Option(self.consumerName)

  final def consumerARNAsScala: Option[String] = Option(self.consumerARN)

  final def consumerStatusAsScala: Option[ConsumerStatus] = Option(self.consumerStatus)

  final def consumerCreationTimestampAsScala: Option[java.time.Instant] = Option(self.consumerCreationTimestamp)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToConsumerOps {

  implicit def toConsumerBuilderOps(v: Consumer.Builder): ConsumerBuilderOps = new ConsumerBuilderOps(v)

  implicit def toConsumerOps(v: Consumer): ConsumerOps = new ConsumerOps(v)

}
