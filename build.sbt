enablePlugins(ScalaJSPlugin)

name := "Scala.js Tutorial"
scalaVersion := "2.13.5" // or any other Scala version >= 2.11.12

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "1.1.0"
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()

// This is an application with a main method
scalaJSUseMainModuleInitializer := true
