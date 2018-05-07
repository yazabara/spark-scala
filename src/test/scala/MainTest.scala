class MainTest extends org.scalatest.FunSuite {

  test("Simple scala test") {
    assert(Main.cube(3) === 27)
  }

  test("Higher-order functions test 1") {
    assert(Main.sum(x => x + x, 3, 3) === 6 + 6)
  }

  test("Higher-order functions test 2") {
    assert(Main.cubeSum(3, 3) === 27 + 27)
  }
}
