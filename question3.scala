object question3 {
  def main(args:Array[String]){
    var sum = addNumbers(5);
    println("Sum is " + sum);
  }
  
  def addNumbers(n:Int):Int={
    if(n==1){
      return 1;
    }
    else{
      return n+addNumbers(n-1);
    }
  }
}