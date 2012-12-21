## Introduction
While following a tutorial on [log4j2 configuration](http://logging.apache.org/log4j/2.x/manual/configuration.html) in a sbt 0.12.1 project.
I noticed that under sbt, running a main() from a Scala class behaved differntly that a main() class from a Java class.
This project demonstraits this behavior.

## Usage
From inside SBT run `run-main logtest.ScalaTest` and `run-main logtest.JavaTest` and enjoy the mysterious differences!
