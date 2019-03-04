package com.github.j5ik2o.reactive.dynamodb.monix

import com.github.j5ik2o.reactive.dynamodb.model._
import com.github.j5ik2o.reactive.dynamodb.DynamoDBAsyncClientV2
import monix.reactive.Observable

object DynamoDBTaskClientV2 {

  def apply(underlying: DynamoDBAsyncClientV2): DynamoDBTaskClientV2 = new DynamoDBTaskClientV2Impl(underlying)

}

trait DynamoDBTaskClientV2 extends DynamoDBTaskClient {

  def batchGetItemPaginator(request: BatchGetItemRequest): Observable[BatchGetItemResponse]

  def listTablesPaginator: Observable[ListTablesResponse]

  def listTablesPaginator(request: ListTablesRequest): Observable[ListTablesResponse]

  def queryPaginator(request: QueryRequest): Observable[QueryResponse]

  def scanPaginator(request: ScanRequest): Observable[ScanResponse]

}
