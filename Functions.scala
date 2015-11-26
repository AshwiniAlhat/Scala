package helloworld

object Functions {
  
  // function that returns value
  def isEvenNumber(number:Int):Boolean = {
    return number%2==0;
  }
  def main(args:Array[String]){
    println(isEvenNumber(10));
    println(isEvenNumber(11));
    println(print());
  }
  
  //function which does not return any value 
  def print():Unit={
    println("For print purpose only !");
  }
}