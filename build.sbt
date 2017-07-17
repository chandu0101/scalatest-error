

enablePlugins(ScalaJSPlugin)

version := "0.0.1"

scalaVersion := "2.11.11"

//deps

libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value % Provided,
  "org.scalameta" %% "scalameta" % "1.8.0" % Provided)

addCompilerPlugin(
  "org.scalameta" % "paradise" % "3.0.0-M9" cross CrossVersion.full)



/** Custom tasks to generate launcher file in  CommonJSModule mode   */
val SJS_OUTPUT_PATH = "assets/scalajs-output.js"

val fastOptWeb = Def.taskKey[Unit]("Generate web output file for fastOptJS")

artifactPath in Compile in fastOptJS :=
  baseDirectory.value / SJS_OUTPUT_PATH

artifactPath in Compile in fullOptJS :=
  baseDirectory.value / SJS_OUTPUT_PATH
