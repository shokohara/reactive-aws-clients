// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class FilterRuleBuilderOps(val self: FilterRule.Builder) extends AnyVal {

  final def withNameAsScala(value: Option[FilterRuleName]): FilterRule.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  } // String

  final def withValueAsScala(value: Option[String]): FilterRule.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  } // String

}

final class FilterRuleOps(val self: FilterRule) extends AnyVal {

  final def nameAsScala: Option[FilterRuleName] = Option(self.name) // String

  final def valueAsScala: Option[String] = Option(self.value) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFilterRuleOps {

  implicit def toFilterRuleBuilderOps(v: FilterRule.Builder): FilterRuleBuilderOps = new FilterRuleBuilderOps(v)

  implicit def toFilterRuleOps(v: FilterRule): FilterRuleOps = new FilterRuleOps(v)

}