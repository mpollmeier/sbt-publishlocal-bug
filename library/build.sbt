organization := "sbttest"
name := "library"
version := "0.1-SNAPSHOT"

scalaVersion := "2.12.0-SNAPSHOT"

resolvers += Resolver.mavenLocal

sources in (Compile,doc) := Seq.empty
publishArtifact in (Compile, packageDoc) := false
