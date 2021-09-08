name := "ScalaAppCDP"

version := "0.1"

scalaVersion := "2.12.8"

mainClass in Compile := Some("com.cloudera.frisch.scalaappcdp.App")

// For assembly only
mainClass in assembly := Some("com.cloudera.frisch.scalaappcdp.App")
assemblyJarName in assembly := "scalaappcdp.jar"

// TODO: Change it to your matching version of CDP
val cdpVersion = "7.1.7.0-551"

libraryDependencies ++= Seq(
  "org.apache.logging.log4j" %% "log4j-api-scala" % "11.0",
  "org.apache.logging.log4j" % "log4j-api" % "2.14.1",
  "org.apache.logging.log4j" % "log4j-core" % "2.14.1",

  
  "org.apache.hadoop" % "hadoop-client" % ("3.1.1." + cdpVersion),
  "org.apache.hbase" % "hbase-client" % ("2.2.3." + cdpVersion),
  "org.apache.hive" % "hive-jdbc" % ("3.1.3000." + cdpVersion),
  "org.apache.hadoop" % "hadoop-ozone-client" % ("1.1.0." + cdpVersion),
  "com.google.guava" % "guava" % "28.2-jre",
  "org.apache.solr" % "solr-solrj" % ("8.4.1." + cdpVersion),
  "org.apache.kafka" % "kafka-clients" % ("2.5.0." + cdpVersion),
  "org.apache.kudu" % "kudu-client" % ("1.15.0." + cdpVersion)

)

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case PathList("META-INF", "MANIFEST.MF") => MergeStrategy.discard
  case x => MergeStrategy.first
}

