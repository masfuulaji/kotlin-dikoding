//kotlin foundation
var name: String ="hell"
fun main(){
    yourPlace("hell")
    for(char in name){
        print("$char ")
    }
}


fun yourPlace(place: String){
    println("Your place is $place")
}