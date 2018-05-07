
object Main extends App {

  /**
    * executable app code
    */
  val ages = Seq(42, 75, 29, 64)
  println(s"The oldest person is ${ages.max}")

  val list = List(
    Set(1,2,3,4,5),
    Set(1,2,3,6,7)
  )

  //with duplicates (list)
  println(s"Flatten set list is ${list.flatten.sorted}")

  val set = Set(
    Set(1,2,3,4,5),
    Set(1,2,3,6,7)
  )

  //without duplicates (set)
  println(s"Flatten set with sets is ${set.flatten}")

  def cube(x: Int) = {
    x * x * x
  }

  /**
    * Higher-order functions
    *
    * @param func function to apply with a & b arguments
    * @param a    first argument
    * @param b    second argument
    * @return
    */
  def sum(func: Int => Int, a: Int, b: Int): Int = func(a) + func(b)

  def cubeSum(a: Int, b: Int) = {
    sum(cube, a, b)
  }
}
