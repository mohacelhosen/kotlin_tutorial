fun main(){
    val searchNumber = 10
    var  result = searchNumber in 1..10     // upper bound(last item) included also
    println("Search number present in beteen 1 to 10 :: $result")
    var nextResult = searchNumber in 1 until  10    // upper bound(last item not allow) not included
    println("Search number present in beteen 1 to 10 :: $nextResult")
}