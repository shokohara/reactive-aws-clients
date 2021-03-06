// Auto-Generated
package com.github.j5ik2o.reactive.aws.kinesis.model.ops

import software.amazon.awssdk.services.kinesis.model._

final class SubscribeToShardRequestBuilderOps(val self: SubscribeToShardRequest.Builder) extends AnyVal {

  final def consumerARNAsScala(value: Option[String]): SubscribeToShardRequest.Builder = {
    value.fold(self) { v =>
      self.consumerARN(v)
    }
  }

  final def shardIdAsScala(value: Option[String]): SubscribeToShardRequest.Builder = {
    value.fold(self) { v =>
      self.shardId(v)
    }
  }

  final def startingPositionAsScala(value: Option[StartingPosition]): SubscribeToShardRequest.Builder = {
    value.fold(self) { v =>
      self.startingPosition(v)
    }
  }

}

final class SubscribeToShardRequestOps(val self: SubscribeToShardRequest) extends AnyVal {

  final def consumerARNAsScala: Option[String] = Option(self.consumerARN)

  final def shardIdAsScala: Option[String] = Option(self.shardId)

  final def startingPositionAsScala: Option[StartingPosition] = Option(self.startingPosition)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubscribeToShardRequestOps {

  implicit def toSubscribeToShardRequestBuilderOps(
      v: SubscribeToShardRequest.Builder
  ): SubscribeToShardRequestBuilderOps = new SubscribeToShardRequestBuilderOps(v)

  implicit def toSubscribeToShardRequestOps(v: SubscribeToShardRequest): SubscribeToShardRequestOps =
    new SubscribeToShardRequestOps(v)

}
