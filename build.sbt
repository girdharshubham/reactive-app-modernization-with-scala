import Dependencies._

ThisBuild / scalaVersion := "2.13.10"
ThisBuild / organization := "extremeprogramming"
ThisBuild / version      := "1.0.0-M1"
ThisBuild / licenses += ("GPL", url("https://www.gnu.org/licenses/gpl-3.0.en.html"))
ThisBuild / developers += Developer(
  "girdharshubham",
  "Shubham Girdhar",
  "girdharshubham@hotmail.com",
  url("https://github.com/girdharshubham"),
)

ThisBuild / javacOptions ++= Seq(
  "-source",
  "1.19",
  "-target",
  "1.19",
  "-Xlint:unchecked",
  "-Xlint:deprecation",
)

ThisBuild / scalacOptions ++= Seq(
  "-deprecation",
  "-encoding",
  "UTF-8",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-unchecked",
  "-Xlint",
  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
)

lazy val rams = (project in file("."))
  .aggregate(manager, ingestor, processor, carrier)

lazy val manager = (project in file("manager"))
  .enablePlugins(KalixPlugin)
  .settings(
    libraryDependencies ++= Seq(scalatest),
  )

lazy val ingestor = project in file("ingestor")
//  .enablePlugins(KalixPlugin)

lazy val processor = project in file("processor")
//  .enablePlugins(KalixPlugin)

lazy val carrier = project in file("carrier")
//  .enablePlugins(KalixPlugin)
