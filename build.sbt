
scalaVersion := "2.13.12"
name := "FP"
organization := "KVexcavator"
version := "1.0"
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "2.3.0"

// To learn more about multi-project builds, head over to the official sbt
// documentation at http://www.scala-sbt.org/documentation.html

Global / onChangedBuildSource := ReloadOnSourceChanges

addCommandAlias("javaHello", "runMain main.java.Hello") ++
addCommandAlias("scalaMain", "runMain Main")
