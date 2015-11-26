package helloworld

object FunctionsWithVariableArguments {
  def printArgumentValues(args:String*)={
   var index : Int = 0;
      for( arg <- args ){
         println("Arg value[" + index + "] = " + arg );
         index = index + 1;
      }
  }
  
  def main(args:Array[String]){
   printArgumentValues("Ashwini","Alhat","IDeaS"); 
  }
}