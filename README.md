# Inline-Class-Kotlin
Playing around with Inline classes in Kotlin

This is to try the experimental feature in Kotlin, "inline classes". Adding some of my thoughts here

1. When they say `inline classes` are just wrappers or similar to `typedAlias`, we need to notice that an Inline class with a string object is not stored as a String object in memory. It is stored as any other regular class in the memory
2. Thus we can say `inline class` is entirely different from a `typedAlias` 
3. All the methods created inside an `inline classes` are static by default. One advantage here is that when we have multiple instances of an inline class, memory is created only for the member variables of the class. Remaining everything is in the common pool,
4. They say inline classes cannot be extended from other classes and only implement an interface. Will they inherit an `abstract class`?. I tried this but it cannot inehrit `abstact classes` too
5. Also note that we cannot call a function that takes Inline classes as parameters from Java

Note: If anyone want's to add notes to this feel free to add it. And you can add examples to this project.
