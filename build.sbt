import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

enablePlugins(ScalaJSPlugin)
enablePlugins(ScalaJSBundlerPlugin)

version := "0.0.1"

scalaVersion := "2.11.8"

scalaJSModuleKind := ModuleKind.CommonJSModule


val assetsDir = "."

// copy fastOptJS/fullOptJS  fiels to assets directory
crossTarget in(Compile, fullOptJS) := file(assetsDir)
crossTarget in(Compile, fastOptJS) := file(assetsDir)
crossTarget in(Compile, packageScalaJSLauncher) := file(assetsDir)
artifactPath in(Compile, fastOptJS) := ((crossTarget in(Compile, fastOptJS)).value /
  ((moduleName in fastOptJS).value + "-opt.js"))

