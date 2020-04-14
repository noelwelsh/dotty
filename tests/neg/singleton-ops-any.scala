import scala.compiletime.ops.any._

object Test {
  val t1: 10 == "5" = true // error
  val t2: 10 == 10 = false // error

  val t3: false != 5 = false // error
  val t4: 10 != 10 = true // error

  val t5: "dotty" == "scala" = true // error
  val t6: "dotty" == "dotty" = false // error

  val t7: "dotty" != "scala" = false // error
  val t8: "dotty" != "dotty" = true // error

  // Non-singleton types don't compile
  val t9: List[Int] == List[Int] = true // error
  val t10: Int == Int = false // error
}
