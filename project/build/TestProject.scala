import sbt._
import eu.henkelmann.sbt.JUnitXmlTestsListener
 
class TestProject(info: ProjectInfo) extends DefaultProject(info) {
   val scalatest = "org.scalatest" %% "scalatest" % "1.6.1" % "test"
 
   //create a listener that writes to the normal output directory
   def junitXmlListener: TestReportListener = new JUnitXmlTestsListener(outputPath.toString)
   //add the new listener to the already configured ones
   override def testListeners: Seq[TestReportListener] = super.testListeners ++ Seq(junitXmlListener)
}
