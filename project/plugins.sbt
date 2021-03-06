libraryDependencies ++= Seq(
  "com.spotify" % "missinglink-core" % "0.2.1"
)

unmanagedSourceDirectories in Compile +=
  baseDirectory.value.getParentFile / "src/main/scala"

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.0.6")
