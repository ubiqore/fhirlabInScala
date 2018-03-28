name := "fhirlabInScala"

version := "0.1"

scalaVersion := "2.12.5"
libraryDependencies ++= Seq("org.scala-lang.modules" % "scala-xml_2.12" % "1.0.6")
// https://mvnrepository.com/artifact/org.openehealth.ipf.modules/ipf-modules-cda-mdht
libraryDependencies += "org.openehealth.ipf.modules" % "ipf-modules-cda-mdht" % "3.1.1"

