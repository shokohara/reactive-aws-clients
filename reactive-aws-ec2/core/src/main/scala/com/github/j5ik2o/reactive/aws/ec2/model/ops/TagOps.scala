// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class TagBuilderOps(val self: Tag.Builder) extends AnyVal {

  final def keyAsScala(value: Option[String]): Tag.Builder = {
    value.fold(self) { v =>
      self.key(v)
    }
  }

  final def valueAsScala(value: Option[String]): Tag.Builder = {
    value.fold(self) { v =>
      self.value(v)
    }
  }

}

final class TagOps(val self: Tag) extends AnyVal {

  final def keyAsScala: Option[String] = Option(self.key)

  final def valueAsScala: Option[String] = Option(self.value)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToTagOps {

  implicit def toTagBuilderOps(v: Tag.Builder): TagBuilderOps = new TagBuilderOps(v)

  implicit def toTagOps(v: Tag): TagOps = new TagOps(v)

}