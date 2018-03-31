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


def res = new URL("http://example.org/").text
println(res)


def baseUrl = new URL('https://api.duckduckgo.com/')
def queryString = 'q=groovy&format=json&pretty=1'
def connection = baseUrl.openConnection()
connection.with {
    doOutput = true
    requestMethod = 'POST'
    outputStream.withWriter { writer ->
        writer << queryString
    }
    println content.text
}
