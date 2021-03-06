import Settings._

scalaWrapperGenBaseSettings("Akka", "akka")

sdkBaseName := "Ec2"

name := s"reactive-aws-${sdkBaseName.value.toLowerCase}-akka"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-testkit"        % akkaVersion % Test,
  "com.typesafe.akka" %% "akka-stream-testkit" % akkaVersion % Test
)

compile in Compile := ((compile in Compile) dependsOn (generateAll in scalaWrapperGen)).value
