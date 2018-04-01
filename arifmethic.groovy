// Celochislennie operacii
println("5+4=" + (5+4))  // 5+4=9
println("5-4=" + (5-4))  // 5-4=1
println("5*4=" + (5*4))  // 5*4=20
println("5/4=" + (5/4))  // 5/4=1.25     // float division
println("5.intdiv(4)=" + (5.intdiv(4)))  // 5.intdiv(4)=1   celochislennoe delenie

// float operations
// Celochislennie operacii
println("5.2+4.4=" + (5.2.plus(4.4)))     // 5.2+4.4=9.6
println("5.2-4.4=" + (5.2.minus(4.4)))    // 5.2-4.4=0.8
println("5.2*4.4=" + (5.2.multiply(4.4)))   // 5.2*4.4=22.88
println("5.2/4.4=" + (5/4))  // 5.2/4.4=1.25

println("3 + 2 * 5 =" + (3 + 2 * 5))       // 3 + 2 * 5 =13
println("(3 + 2) * 5 =" + ((3 + 2) * 5))  // (3 + 2) * 5 =25

println("5%4=" + (5%4))  // 5%4=1
println("5++=" + (5++))  // 5++=5  postfix increment
println("5--=" + (5--))  // 5--=5

println("++5=" + (++5))  // ++5=6  prefix increment
println("--5=" + (--5))  // --5=4


println("Biggest Int: " + Integer.MAX_VALUE)     // Biggest Int: 2147483647
println("Smallest Int: " + Integer.MIN_VALUE)    // Smallest Int: -2147483648

println("Biggest Float: " + Float.MAX_VALUE)     // Biggest Float: 3.4028235E38
println("Smallest Float: " + Float.MIN_VALUE)    // Smallest Float: 1.4E-45

println("Biggest Double: " + Double.MAX_VALUE)   // Biggest Double: 1.7976931348623157E308
println("Smallest Double: " + Double.MIN_VALUE)  // Smallest Double: 4.9E-324

println("Math.abs(-1.45): " + (Math.abs(-1.45))) // 1.45
println("Math.round(1.45): " + (Math.round(1.45))) // 1
def var3 = 2.0
println("var3.pow(3): " + (var3.pow(3))) // 8.000
println("3.0.equals(2.0): " + (3.0.equals(2.0))) // false
println("3.0.equals(Float.NaN): " + (var3.equals(Float.NaN))) // false  (Check if datatype var3=float)
println("Math.sqrt(9): " + (Math.sqrt(9))) // 3.0     Kvadratniy koren
println("Math.cbrt(27): " + (Math.cbrt(27))) // 3.0   Kubicheskiy koren
println("Math.ceil(2.45): " + (Math.ceil(2.45))) // 3.0   Shows next integer higher the value
println("Math.floor(2.45): " + (Math.floor(2.45))) // 2.0   Shows next integer lower the value
println("Math.min(2,5): " + (Math.min(2,5))) // 2
println("Math.max(2,5): " + (Math.max(2,5))) // 5
println("Math.log(2): " + (Math.log(2))) // 0.6931471805599453

println("Math.abs(new Random().nextInt() % 600) + 1: " + (Math.abs(new Random().nextInt() % 600) + 1)) // 550  Random 0 .. 600


println(5 == 6)  // false
println(5 != 6)  // true
println(5 >= 6)  // false
println(5 <= 6)  // true


boolean x = true
boolean y = false
boolean z = true

println(x&&y)   // false. This is the logical “and” operator
println(x&&z)   // true. This is the logical “and” operator

println(x||z)  // true. This is the logical “or” operator
println(x||y)  // true. This is the logical “or” operator
println(!x)    // false. This is the logical “not” operator

def var4=5
println(var4+=2)  // 7
println(var4-=2)  // 5
println(var4*=2)  // 10
println(var4/=2)  // 5




