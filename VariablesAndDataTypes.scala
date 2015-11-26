package helloworld

object VariablesAndDataTypes {
  def main(args:Array[String]){
    var myVar:String = "Foo";
    val finalVar:String ="CONSTANT VALUE";
    var noTypeGivenNumber=10;
    var noTypeGivenString="STRING";
    
    val (firstName,lastName) = Tuple2("Ashwini","Alhat");
    println(myVar);
    println(finalVar);
    println(noTypeGivenNumber);
    println(noTypeGivenString);
    
  }
}