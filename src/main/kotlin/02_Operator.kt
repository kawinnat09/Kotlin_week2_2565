fun kMessage(){
    println("==========")
}

fun kDataType() {
    println("Signed Integral Type")
    val kByte:UByte  = 255u
    val kShort:UShort = 65_535u
    println("val kByte = $kByte")
    println("val UShort = $kShort")
}

fun kOperator(){
    val a:Byte = 4 + 2
    var b:Byte = 4 - 2
    var c:Byte = 4 / 2
    var d:Byte = 4 * 2
    var e:Byte = 10 % 3

    println("Operator in java");
    println("val a = $a")
    println("var b = $b")
    println("var c = $c")
    println("var d = $d")
    println("var e = $e")
}