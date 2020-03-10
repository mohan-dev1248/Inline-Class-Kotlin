fun main(){
    val password = Password("Current Password")
    val password2 = Password("Next Password")

    //Note that printing just this doesn't make much difference from the normal class
    println(password)
    println(password2)
    println(password.password)

    println(password.length)

    password.sayThePasswordLength()
    password2.sayThePasswordLength()
}

inline class Password(val password: String){
    val length: Int
    get() = password.length// This is compiled to static method

    //A static method
    fun sayThePasswordLength(){
        println("The password length is $length")
    }
}

