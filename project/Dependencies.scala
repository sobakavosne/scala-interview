import sbt._

object Dependencies {
  lazy val scalaTestVersion = "3.2.16"

  lazy val scalaTest = "org.scalatest" %% "scalatest" % scalaTestVersion % Test
}
