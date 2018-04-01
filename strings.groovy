def name = 'Derek'

println('I am ${name}\n')     // I am ${name}
println("I am ${name}\n")     // I am Derek
println("I am $name\n")       // I am Derek

def multiString = '''I am
a very good
developer
'''
println(multiString)
/*
I am
a very good
developer
 */

println("3rd index of string $name is: " + name[3])  // e
println("Index of r is:" + name.indexOf('r '))       // 2
println("0 to 3 characters $name is: " + name[0..2]) // Der
println("Every other char: " + name[0,2,4])          // Drk

println("Substring at 1 to 4: " + name.substring(1))   // erek   Removes symbol
println("Substring at 1 to 4: " + name.substring(1,4))          // ere     Removes symbols

println("My name is " + name)             // My name is Derek
println("My name is ".concat(name))       // My name is Derek

println("this text " * 3)                 // this text this text this text

println("Derek.equals(name): " + "Derek".equals(name))  // true
println("derek.equals(name): " + "derek".equals(name))  // false
println("derek.equals(name): " + "Derek".equalsIgnoreCase(name))  // true

println("Length: " + "Length".length())  // 6

def myString = "My String"
println(myString - "My ")             // String
println(myString.split(" "))    // [My, String]
println(myString.toList())            // [M, y,  , S, t, r, i, n, g]

def myString1 = "Moloko"
println(myString1.replaceFirst("o", "a"))    // Maloko
println(myString1.replaceAll("o", "a"))      // Malaka

println(myString1.toUpperCase())      // MOLOKO
println(myString1.toLowerCase())      // moloko

println("Ant <=> Banana" + ("Ant" <=> "Banana"))  // -1    Sorting by alphabyte
println("Banana <=> Ant" + ("Banana" <=> "Ant"))  //  1
println("Ant <=> Ant" + ("Ant" <=> "Ant"))        //  0

def myString2 = 'Random'
println("A $myString2 string")              // A Random string
printf("A %s string \n", myString2)  // A Random string   !!! printf
printf("%-10s %d %.2f %10s \n", ['Stuff'], 10, 1.234, 'Random')
// [Stuff]    10 1.23     Random    // 10 -number of spaces in the string, .2 - accuracy


////   INPUTS
print("Enter your name: ")
def your_name = System.console().readLine()
println("Hello, " + your_name)

printf("Enter first number: ")
def numb1 = System.console().readLine().toDouble()
printf("Enter second number: ")
def numb2 = System.console().readLine().toDouble()
printf("%f + %f = %.2f", numb1, numb2, numb1 + numb2)





















