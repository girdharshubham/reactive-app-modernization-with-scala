import sbt._

object Dependencies {
  lazy val JWTCoreVersion   = "9.2.0"
  lazy val ScalaTestVersion = "3.2.15"

  lazy val `jwt-core` = "com.github.jwt-scala" %% "jwt-core"  % JWTCoreVersion
  lazy val scalatest  = "org.scalatest"        %% "scalatest" % ScalaTestVersion % Test
}
