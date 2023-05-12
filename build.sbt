import Dependencies._

ThisBuild / scalaVersion := "2.13.10"

lazy val auth = (project in file("auth"))
  .enablePlugins(KalixPlugin)
  .settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "3.2.15" % Test
    )
  )
