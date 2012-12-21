import AssemblyKeys._

assemblySettings

mainClass in assembly := Some("logtest.JavaTest")

name := "Logging Test"

version := "0.0"

scalaVersion := "2.9.2"

libraryDependencies ++= Seq(
	"org.apache.logging.log4j" % "log4j-api" % "2.0-beta3",
	"org.apache.logging.log4j" % "log4j-core" % "2.0-beta3"
)

