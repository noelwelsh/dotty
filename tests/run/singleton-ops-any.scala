import scala.compiletime.ops.any._

object Test {
  val t1: 1 == 1 = true
  val t2: 0 == false = false

  val t3: 1 != 1 = false
  val t4: 0 != 1 = true

  val t5: "dotty" == "dotty" = true
  val t6: "dotty" == "scala" = false

  val t7: "dotty" != "dotty" = false
  val t8: "dotty" != "scala" = true

  val t9: "dotty" == false = false
  val t10: false == "dotty" = false
  val t11: 1 == "dotty"     = false
  val t12: "dotty" == 42    = false

  val t13: "dotty" != false = true
  val t14: false != "dotty" = true
  val t15: 1 != "dotty"     = true
  val t16: "dotty" != 42    = true

  def main(args: Array[String]) = {}
}
