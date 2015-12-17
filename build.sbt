import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

enablePlugins(ScalaJSPlugin)

version := "0.0.1"

scalaVersion := "2.11.6"

val scalatestVersion = "3.0.0-M3"
val scalaAsyncVersion = "0.9.2"
val scalajsReactVersion = "0.9.1"
val utestVersion = "0.3.0"

scalaJSStage in Global := FastOptStage
jsDependencies += RuntimeDOM
jsEnv in Test := new PhantomJS2Env(scalaJSPhantomJSClassLoader.value, addArgs = Seq("--web-security=no"))


//libraryDependencies += "org.scalatest" %%% "scalatest" % scalatestVersion % Test
//
//libraryDependencies += "org.scala-lang.modules" %% "scala-async" % scalaAsyncVersion
//
//libraryDependencies += "com.github.japgolly.scalajs-react" %%% "core" % scalajsReactVersion

//utest

//libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.0" % Test
//testFrameworks += new TestFramework("utest.runner.Framework")
