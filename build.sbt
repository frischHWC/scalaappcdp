name := "ScalaAppCDP"

version := "0.1"

scalaVersion := "2.12.8"

mainClass in Compile := Some("com.cloudera.frisch.scalaappcdp.App")

// For assembly only
mainClass in assembly := Some("com.cloudera.frisch.scalaappcdp.App")
assemblyJarName in assembly := "scalaappcdp.jar"

libraryDependencies ++= Seq(
  "org.apache.logging.log4j" %% "log4j-api-scala" % "11.0",
  "org.apache.logging.log4j" % "log4j-api" % "2.11.0",
  "org.apache.logging.log4j" % "log4j-core" % "2.11.0" % Runtime
)
