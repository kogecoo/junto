name := "junto"

version := "2.0-SNAPSHOT"

organization := "org.scalanlp"

scalaVersion := scalaVersion_2_11

licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0"))

crossScalaVersions := Seq(scalaVersion_2_10, scalaVersion_2_11, scalaVersion_2_12)

libraryDependencies ++= Seq(
  "org.rogach" %% "scallop" % "2.0.6",
  "org.scalatest" %% "scalatest" % "3.0.3" % "test"
)

libraryDependencies += scalaVersion {
  // Versions of graph-core higher than 1.10.0 are not published for scala-2.10.
  case `scalaVersion_2_10` => "com.assembla.scala-incubator" %% "graph-core" % "1.10.0"
  case _                   => "org.scala-graph" %% "graph-core" % "1.11.4"
}.value


enablePlugins(JavaAppPackaging)

mainClass in Compile := Some("junto.Junto")

lazy val scalaVersion_2_10 = "2.10.6"

lazy val scalaVersion_2_11 = "2.11.11"

lazy val scalaVersion_2_12 = "2.12.2"

