name := "Pool-Day-Scala"
version := "1.0"
scalaVersion := "2.11.7"


libraryDependencies ++= List(
  "org.apache.logging.log4j" % "log4j-api" % "2.3",
  "org.apache.logging.log4j" % "log4j-core" % "2.3",
  "org.apache.commons" % "commons-lang3" % "3.1",
  "org.scalatest" %% "scalatest" % "2.2.5" % "test"
)

initialCommands := """|import de.kempkensebastian.poolday.methoden._""".stripMargin
