package helloworld

object Add {
  def addInt(a:Int, b:Int){
    var sum:Int = 0;
    sum = a + b;
  }
  
  def main(args:Array[String]){
    println("Sum is " + addInt(1,2));
  }
}