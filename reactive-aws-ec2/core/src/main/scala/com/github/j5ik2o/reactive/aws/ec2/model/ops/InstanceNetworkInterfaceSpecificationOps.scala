// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class InstanceNetworkInterfaceSpecificationBuilderOps(val self: InstanceNetworkInterfaceSpecification.Builder)
    extends AnyVal {

  final def associatePublicIpAddressAsScala(value: Option[Boolean]): InstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.associatePublicIpAddress(v)
    }
  }

  final def deleteOnTerminationAsScala(value: Option[Boolean]): InstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.deleteOnTermination(v)
    }
  }

  final def descriptionAsScala(value: Option[String]): InstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.description(v)
    }
  }

  final def deviceIndexAsScala(value: Option[Int]): InstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.deviceIndex(v)
    }
  }

  final def groupsAsScala(value: Option[Seq[String]]): InstanceNetworkInterfaceSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.groups(v.asJava)
    }
  }

  final def ipv6AddressCountAsScala(value: Option[Int]): InstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.ipv6AddressCount(v)
    }
  }

  final def ipv6AddressesAsScala(
      value: Option[Seq[InstanceIpv6Address]]
  ): InstanceNetworkInterfaceSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.ipv6Addresses(v.asJava)
    }
  }

  final def networkInterfaceIdAsScala(value: Option[String]): InstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.networkInterfaceId(v)
    }
  }

  final def privateIpAddressAsScala(value: Option[String]): InstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.privateIpAddress(v)
    }
  }

  final def privateIpAddressesAsScala(
      value: Option[Seq[PrivateIpAddressSpecification]]
  ): InstanceNetworkInterfaceSpecification.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.privateIpAddresses(v.asJava)
    }
  }

  final def secondaryPrivateIpAddressCountAsScala(value: Option[Int]): InstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.secondaryPrivateIpAddressCount(v)
    }
  }

  final def subnetIdAsScala(value: Option[String]): InstanceNetworkInterfaceSpecification.Builder = {
    value.fold(self) { v =>
      self.subnetId(v)
    }
  }

}

final class InstanceNetworkInterfaceSpecificationOps(val self: InstanceNetworkInterfaceSpecification) extends AnyVal {

  final def associatePublicIpAddressAsScala: Option[Boolean] = Option(self.associatePublicIpAddress)

  final def deleteOnTerminationAsScala: Option[Boolean] = Option(self.deleteOnTermination)

  final def descriptionAsScala: Option[String] = Option(self.description)

  final def deviceIndexAsScala: Option[Int] = Option(self.deviceIndex)

  final def groupsAsScala: Option[Seq[String]] = Option(self.groups).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def ipv6AddressCountAsScala: Option[Int] = Option(self.ipv6AddressCount)

  final def ipv6AddressesAsScala: Option[Seq[InstanceIpv6Address]] = Option(self.ipv6Addresses).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def networkInterfaceIdAsScala: Option[String] = Option(self.networkInterfaceId)

  final def privateIpAddressAsScala: Option[String] = Option(self.privateIpAddress)

  final def privateIpAddressesAsScala: Option[Seq[PrivateIpAddressSpecification]] =
    Option(self.privateIpAddresses).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def secondaryPrivateIpAddressCountAsScala: Option[Int] = Option(self.secondaryPrivateIpAddressCount)

  final def subnetIdAsScala: Option[String] = Option(self.subnetId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToInstanceNetworkInterfaceSpecificationOps {

  implicit def toInstanceNetworkInterfaceSpecificationBuilderOps(
      v: InstanceNetworkInterfaceSpecification.Builder
  ): InstanceNetworkInterfaceSpecificationBuilderOps = new InstanceNetworkInterfaceSpecificationBuilderOps(v)

  implicit def toInstanceNetworkInterfaceSpecificationOps(
      v: InstanceNetworkInterfaceSpecification
  ): InstanceNetworkInterfaceSpecificationOps = new InstanceNetworkInterfaceSpecificationOps(v)

}
