import Dependencies._

ThisBuild / scalaVersion     := "3.3.3"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.scala.interview"
ThisBuild / organizationName := "scala.interview"

Compile / mainClass   := Some("app.Main")
Compile / scalaSource := baseDirectory.value / "src" / "main" / "scala"
Test / scalaSource    := baseDirectory.value / "src" / "test" / "scala"

lazy val root = (project in file("."))
  .settings(
    name := "chemist-flow",
    libraryDependencies ++= Seq(
      scalaTest,
    ),
    scalacOptions ++= Seq(
      "-deprecation",            // Emit warning and location for usages of deprecated APIs
      "-feature",                // Emit warning and location for usages of features that should be imported explicitly
      "-unchecked",              // Enable additional warnings where generated code depends on assumptions
      "-Xfatal-warnings",        // Fail the compilation if there are any warnings
    )
  )
