val scala3Version = "3.3.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "munit-scalacheck-error-repro",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalameta" %% "munit" % "1.0.0-M10" % Test,
    libraryDependencies += "org.scalacheck" %% "scalacheck" % "1.17.0" % Test,
    Test / testOptions += Tests.Argument(TestFrameworks.ScalaCheck, "-minSuccessfulTests", "2"),
    Test / parallelExecution := false
  )
