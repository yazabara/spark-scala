import org.apache.spark.{SparkConf, SparkContext}
import org.scalatest.BeforeAndAfter

class MainTest extends org.scalatest.FunSuite with BeforeAndAfter {

  var sparkContext: SparkContext = _

  before {
    sparkContext = new SparkContext(
      new SparkConf()
        .setAppName("test")
        .set("spark.driver.allowMultipleContexts", "true")
        .set("spark.test", "true")
        .setMaster("local")
    )
  }

  after {
    sparkContext.cancelAllJobs()
    sparkContext.stop()
  }

  test("Simple spark test") {
    val data = Array(1, 2, 3, 4, 5)
    val distData = sparkContext.parallelize(data)

    assert(distData.count() == 5)
  }

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
