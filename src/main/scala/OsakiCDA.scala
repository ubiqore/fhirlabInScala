import org.openhealthtools.mdht.uml.cda._

import scala.xml.{XML, _}

class OsakiCDA {

}

object myTest extends App {

  val data = XML.loadFile("/Users/roky/Documents/C3cloud/osakidetza-examples/CDA/samples/cleaned/123456.xml")
  println (data)
}
