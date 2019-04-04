// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class GetShardIteratorRequestBuilderOps(val self: GetShardIteratorRequest.Builder) extends AnyVal {

  final def withStreamArnAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.streamArn(v)
    }
  } // String

  final def withShardIdAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.shardId(v)
    }
  } // String

  final def withShardIteratorTypeAsScala(value: Option[ShardIteratorType]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.shardIteratorType(v)
    }
  } // String

  final def withSequenceNumberAsScala(value: Option[String]): GetShardIteratorRequest.Builder = {
    value.fold(self) { v =>
      self.sequenceNumber(v)
    }
  } // String

}

final class GetShardIteratorRequestOps(val self: GetShardIteratorRequest) extends AnyVal {

  final def streamArnAsScala: Option[String] = Option(self.streamArn) // String

  final def shardIdAsScala: Option[String] = Option(self.shardId) // String

  final def shardIteratorTypeAsScala: Option[ShardIteratorType] = Option(self.shardIteratorType) // String

  final def sequenceNumberAsScala: Option[String] = Option(self.sequenceNumber) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGetShardIteratorRequestOps {

  implicit def toGetShardIteratorRequestBuilderOps(
      v: GetShardIteratorRequest.Builder
  ): GetShardIteratorRequestBuilderOps = new GetShardIteratorRequestBuilderOps(v)

  implicit def toGetShardIteratorRequestOps(v: GetShardIteratorRequest): GetShardIteratorRequestOps =
    new GetShardIteratorRequestOps(v)

}