import Array._
object Q2 extends App{
//  val inputList = List(1, 2, 3, 4, 5)
//  val outputList = calculateSquare(inputList)
//  println(outputList)
//
////  def calculateSquare(array: Array[Int]): Array[Int] = {
////    if (array.length > 1) {
////      val temp = Array(array(0) * array(0))
////      concat(temp, array.tail)
////    }
////    else {
////      Array(array(0) * array(0))
////    }
////  }
//def calculateSquare(inputList: List[Int]): List[Int] = {
//  inputList.map(number => number * number)
//}

  def calculateSquare(arr: Array[Int]): Array[Int] = {
    arr.map(arr => arr * arr);
  }

  val numbers = calculateSquare(Array(1, 2, 3, 4, 5));
  println(numbers.mkString(", "));


}


