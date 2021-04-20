fun main() {
    println(isEven(9))
    println(isEven(8))
    var x=house("ghorofa")
    print(x[0])
    print(x[2])
    println(x[4])
    var y=Product("sorghum",24,350,"grocery")
    println(y.option("grocery"))


}
fun isEven(num:Int):Boolean{
    if (num%2==0){
        return true
    }
    else{
        return false
    }

}
data class Product (val name: String,val weight:Int,val price:Int,val category:String){
    fun option(category:String){
        when(category){
            "groceries"->println("I need sorghum")
            "hygiene"->println("I love clean environment")
            else->println("I am eating")
        }
    }
}
fun house(name:String):String{
    var x=name
    return x
}
fun sortWords(wordsArray:ArrayList<String>):ArrayList<String> {


}