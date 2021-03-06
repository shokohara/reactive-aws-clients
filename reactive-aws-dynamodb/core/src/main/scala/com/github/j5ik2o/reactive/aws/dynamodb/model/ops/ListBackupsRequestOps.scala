// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class ListBackupsRequestBuilderOps(val self: ListBackupsRequest.Builder) extends AnyVal {

  final def tableNameAsScala(value: Option[String]): ListBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.tableName(v)
    }
  }

  final def limitAsScala(value: Option[Int]): ListBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.limit(v)
    }
  }

  final def timeRangeLowerBoundAsScala(value: Option[java.time.Instant]): ListBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.timeRangeLowerBound(v)
    }
  }

  final def timeRangeUpperBoundAsScala(value: Option[java.time.Instant]): ListBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.timeRangeUpperBound(v)
    }
  }

  final def exclusiveStartBackupArnAsScala(value: Option[String]): ListBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.exclusiveStartBackupArn(v)
    }
  }

  final def backupTypeAsScala(value: Option[BackupTypeFilter]): ListBackupsRequest.Builder = {
    value.fold(self) { v =>
      self.backupType(v)
    }
  }

}

final class ListBackupsRequestOps(val self: ListBackupsRequest) extends AnyVal {

  final def tableNameAsScala: Option[String] = Option(self.tableName)

  final def limitAsScala: Option[Int] = Option(self.limit)

  final def timeRangeLowerBoundAsScala: Option[java.time.Instant] = Option(self.timeRangeLowerBound)

  final def timeRangeUpperBoundAsScala: Option[java.time.Instant] = Option(self.timeRangeUpperBound)

  final def exclusiveStartBackupArnAsScala: Option[String] = Option(self.exclusiveStartBackupArn)

  final def backupTypeAsScala: Option[BackupTypeFilter] = Option(self.backupType)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListBackupsRequestOps {

  implicit def toListBackupsRequestBuilderOps(v: ListBackupsRequest.Builder): ListBackupsRequestBuilderOps =
    new ListBackupsRequestBuilderOps(v)

  implicit def toListBackupsRequestOps(v: ListBackupsRequest): ListBackupsRequestOps = new ListBackupsRequestOps(v)

}
