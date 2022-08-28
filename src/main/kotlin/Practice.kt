fun main(){
    var ZakZak = Warlock()
    ZakZak.makeAWalk()
}

open class Character(){
    open fun makeAWalk(){
        println("The character hit the road")
    }
}

open class Orc: Character(){
    final override fun makeAWalk() { //final keyword wtops from overriding
        println("The orc is walking")
    }
}

class Warlock: Orc(){

}