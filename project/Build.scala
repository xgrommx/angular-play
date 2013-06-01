import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "angular-play"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    "org.webjars"   % 	"angularjs"     % "1.1.5-1"	,
    "org.webjars"   % 	"bootstrap"     % "2.3.2"	,
    "org.webjars"   %% 	"webjars-play"  % "2.1.0-2" 
  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
  )

}
