package helloworld

object MathOperations {
  def main(args:Array[String]){
    println("Hello World");
  }
  
  def addInt(a:Int, b:Int){
    var sum:Int = 0;
    sum = a + b;
    println(sum);
  }
}