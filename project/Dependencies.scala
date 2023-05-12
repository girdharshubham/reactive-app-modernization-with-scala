import sbt._

object Dependencies {
  lazy val JWTCoreVersion = "9.2.0"

  lazy val `jwt-core` = "com.github.jwt-scala" %% "jwt-core" % JWTCoreVersion
}