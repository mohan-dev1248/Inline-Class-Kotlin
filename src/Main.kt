fun main(){
    val password = Password("Current Password")

    //Note that printing just this doesn't make much difference from the normal class
    println(password)
    println(password.password)
}

inline class Password(val password: String)

