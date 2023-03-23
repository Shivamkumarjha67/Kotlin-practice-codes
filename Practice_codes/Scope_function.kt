fun main() {

    // obj.apply{} -> scope is used to initialize.
    // Returns : Context Object.
    // Scope Context object reference is passed by 'this'.
    val user = User().apply {
        name = "Shivam"
        age = 21
    }

    println("The name is : " + user.name)
    println("Age is : " + user.age)

    // obj.also{} -> scope is used to change values.
    // Returns : Context Object.
    // Context reference is : 'it'.

    user.also {
        it.name = "Harry"
    }

    println("The name is : " + user.name)
    
    // with(obj) -> scope also used to initialize.
    // Returns : lambda expressions.
    // Scope context reference is 'this'.

    val age = with(user) {
        name = "Golu"
        println("The name is " + name)
        age = 17
        age // last statement is return value.
    }

    println("The age is : " + age)

    // val/var?.let{} -> scope is user to avoid null pointer exceptions.
    // Returns : Lambda Expressions.
    // Context Referenece is : 'it'.
    // if variable is null then let scope is not executed or avoided.

    var string : String? = "Sanjana"

    string?.let {
        println("The length of string is : " + it.length)
    }

    // obj.run{} -> scope also used to avoid null pointer exception as well as return lambdas expression.
    // Return : Lambda Expression.
    // Context Reference is : 'this'.

    val msg = user?.run{
        name = "Pankaj"
        println("Name is : " + name)

        "run scope return statement is last line"
    }

    println("Msg is : " + msg)

    println("Done !!")
}

class User {
    var name : String = ""
    var age = 20
}