import org.scalajs.core.tools.io.{AtomicWritableFileVirtualJSFile, FileVirtualJSFile, VirtualJSFile}
import org.scalajs.sbtplugin.ScalaJSPlugin
import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import sbt.Keys._
import sbt._

enablePlugins(ScalaJSPlugin)

version := "0.0.1"

scalaVersion := "2.11.8"

scalaJSModuleKind := ModuleKind.CommonJSModule

val assetsDir = "."

// copy fastOptJS/fullOptJS  fiels to assets directory
crossTarget in(Compile, fullOptJS) := file(assetsDir)
crossTarget in(Compile, fastOptJS) := file(assetsDir)
//packageScalaJSLauncher in Compile := {
//  val launcher = (scalaJSLauncher in Compile).value.data.content
//  IO.write(baseDirectory.value / "scalajs-launcher.js", launcher)
//   println(s"Launcher :  $launcher")
//  file(assetsDir)
////  null
//}
artifactPath in(Compile, fastOptJS) := ((crossTarget in(Compile, fastOptJS)).value /
  ((moduleName in fastOptJS).value + "-opt.js"))

libraryDependencies += "org.scalatest" %%% "scalatest" % "3.0.0" % Test

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.0"

//libraryDependencies += "com.github.chandu0101" %%% "sri-enzyme" % "2017.1.0-SNAPSHOT"

scalaJSStage in Global := FastOptStage

jsDependencies += RuntimeDOM

//jsDependencies += ProvidedJS / "mainpage-bundle.js" % Test


//jsEnv in Test := new PhantomJS2Env(scalaJSPhantomJSClassLoader.value, addArgs = Seq("--web-security=no"))


//scalaJSLauncher in Compile := {
//    val launcher = (scalaJSLauncher in Compile).value.data.content
//    IO.write(baseDirectory.value / "scalajs-launcher.js", launcher)
//     println(s"Launcher :  $launcher")
//  Attributed[VirtualJSFile](FileVirtualJSFile(null))(
//    AttributeMap.empty.put(name.key, "")
//  )
//}

libraryDependencies ++= Seq(
  "com.dispalt" %%% "sri-vdom" % "0.3.0"
)

/** Custom tasks to generate launcher file in  CommonJSModule mode   */
val SJS_OUTPUT_PATH = "assets/scalajs-output.js"


val fastOptWeb = Def.taskKey[Unit]("Generate web output file for fastOptJS")


artifactPath in Compile in fastOptJS :=
  baseDirectory.value / SJS_OUTPUT_PATH
fastOptWeb in Compile := {
  val launcher = (scalaJSLauncher in Compile).value.data.content
  IO.write(baseDirectory.value / "assets/scalajs-output-launcher.js", launcher)
}


val fullOptWeb = Def.taskKey[Unit]("Generate web output file for fullOptJS")


    artifactPath in Compile in fullOptJS :=
      baseDirectory.value / SJS_OUTPUT_PATH
    fullOptWeb in Compile := {
      (fullOptJS in Compile).value
      val launcher = (scalaJSLauncher in Compile).value.data.content
      IO.write(baseDirectory.value / "assets/scalajs-output-launcher.js", launcher)
    }

