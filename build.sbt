name := """scalaTests"""

version := "1.0"

scalaVersion := "2.11.7"

lazy val commonSettings = Seq(
	organization := "com.github.uryyyyyyy",
	scalaVersion := "2.11.7",
	libraryDependencies ++= Seq(
		"org.scalatest" %% "scalatest" % "3.0.0-M15" % "test",
		"org.specs2" %% "specs2-core" % "3.7.2" % "test"
	)
)

lazy val specs2 = (project in file("specs2")).
		settings(commonSettings: _*)

lazy val scalaTest = (project in file("scalaTest")).
		settings(commonSettings: _*)