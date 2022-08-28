//class hierarchy
// open keyword for any class/properties/function that you want to override

open class Animal(){ //it is possible to skip adding the primary constructor
    open val image = ""
    open val food = ""
    open val habitat = ""
    var hunger = 10

    /* open var changeName = name
    set(value){
        if (changeName != null && changeName == String()) field = value
    } */

    /* open var weightInKgs = weight
    get() = (this.weightInKgs / 2.2).toInt() */

    open fun makeNoise(){
        println("The animal is making a noise")
    }
    open fun eat (){
        println ("The animal is eating")
    }

    open fun roam(){
        println("The animal is roaming")
    }

    fun sleep(){
        println("The animal is sleeping")
    }
}

class Hippo(name_param: String, breed_param: String,weight_param: Int): Animal(){
    override val image = "hippo.jpg"
    override var food = "grass" //it's possible to override val with var in the subclass
    override val habitat = "water" //you must override properties if you used val in superclass

    override fun makeNoise() {
        println("Grunt! Grunt!")
    }

    override fun eat() {
        println("The Hippo is eating $food")
    }
}

open class Canine (name_param: String,breed_param: String, weight_param: Int): Animal(){
    override fun roam() {
        println ("The canine is roaming")
    }
}

class Wolf (wolfName: String, wolfBreed: String, wolfWeight: Int): Canine(wolfName,wolfBreed,wolfWeight){
    override val image = "wolf.jpg"
    override val food = "meat"
    override val habitat = "forests"

    override fun makeNoise(){
        println("Auuuf!")
    }

    override fun eat(){
        println("The wolf is eating $food")
    }
}

class Vet {
    fun giveShot (x: Animal){ //has any Animal as parameter
        x.makeNoise()
    }
}

fun main(){
    var Alpha = Wolf ("Zizi", "Gray", 30)
    Alpha.makeNoise()

        val bigHippo: Animal = Hippo("Big Boy", "Red", 300)
    // you can use any subclass in place of the superclass it inherits from

    val vet = Vet()
    vet.giveShot(Alpha)
    vet.giveShot(bigHippo)
    //polymorphism is an ability to use oe type of object in a place that explicitly expects different type


    }