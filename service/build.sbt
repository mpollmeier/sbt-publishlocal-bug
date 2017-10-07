organization := "sbttest"
name := "service"
version := "0.1-SNAPSHOT"

scalaVersion := "2.12.3"

resolvers += Resolver.mavenLocal
libraryDependencies += "sbttest" %% "library" % "0.1-SNAPSHOT"
