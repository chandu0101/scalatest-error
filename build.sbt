import org.scalajs.core.tools.io.{
  AtomicWritableFileVirtualJSFile,
  FileVirtualJSFile,
  VirtualJSFile
}
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

enablePlugins(ScalaJSPlugin)

version := "0.0.1"

scalaVersion := "2.11.8"

scalaJSModuleKind := ModuleKind.CommonJSModule

/** Custom tasks to generate launcher file in  CommonJSModule mode   */
val SJS_OUTPUT_PATH = "assets/scalajs-output.js"

val fastOptWeb = Def.taskKey[Unit]("Generate web output file for fastOptJS")

artifactPath in Compile in fastOptJS :=
  baseDirectory.value / SJS_OUTPUT_PATH

artifactPath in Compile in fullOptJS :=
  baseDirectory.value / SJS_OUTPUT_PATH
