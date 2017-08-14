name := """fkHomies"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayScala)

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  javaJdbc,
  ehcache,
  javaWs
)
