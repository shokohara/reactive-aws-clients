package com.github.j5ik2o.reactive.dynamodb.model

final case class GlobalSecondaryIndexDescription(indexName: Option[String] = None,
                                                 keySchema: Option[Seq[KeySchemaElement]] = None,
                                                 projection: Option[Projection] = None,
                                                 indexStatus: Option[IndexStatus] = None,
                                                 backFilling: Option[Boolean] = Some(false),
                                                 provisionedThroughput: Option[ProvisionedThroughputDescription] = None,
                                                 indexSizeBytes: Option[Long] = Some(0L),
                                                 itemCount: Option[Long] = Some(0L),
                                                 indexArn: Option[String] = None) {
  def withIndexName(value: Option[String]): GlobalSecondaryIndexDescription                = copy(indexName = value)
  def withKeySchema(value: Option[Seq[KeySchemaElement]]): GlobalSecondaryIndexDescription = copy(keySchema = value)
  def withProjection(value: Option[Projection]): GlobalSecondaryIndexDescription           = copy(projection = value)
  def withIndexStatus(value: Option[IndexStatus]): GlobalSecondaryIndexDescription         = copy(indexStatus = value)
  def withBackFilling(value: Option[Boolean]): GlobalSecondaryIndexDescription             = copy(backFilling = value)
  def withProvisionedThroughput(value: Option[ProvisionedThroughputDescription]): GlobalSecondaryIndexDescription =
    copy(provisionedThroughput = value)
  def withIndexSizeBytes(value: Option[Long]): GlobalSecondaryIndexDescription = copy(indexSizeBytes = value)
  def withItemCount(value: Option[Long]): GlobalSecondaryIndexDescription      = copy(itemCount = value)
  def withIndexArn(value: Option[String]): GlobalSecondaryIndexDescription     = copy(indexArn = value)
}
