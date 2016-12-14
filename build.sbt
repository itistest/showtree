name:="hello"
version:="0.1"
scalaVersion:="2.12.1"
mainClass in (Compile,run) :=Some("com.test.App")
libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"
