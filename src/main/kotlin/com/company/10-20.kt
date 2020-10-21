package com.company

import java.util.*

fun main() {
//    println("hello world");
//    var a:Int = 5;
//    var b:Boolean = true
//    println(a == 4)
    var a = 1
// 模板中的简单名称：
    val s1 = "a is $a"

    a = 2
// 模板中的任意表达式：
    val s2 = "${s1.replace("is", "was")}, but now is $a"

    println(s2)

    val parseInt = parseInt("ddd")

    print(parseInt)

//    var a:List<Int> = Arrays.asList(1,2,3)
}

fun parseInt(str: String): Int? {
    // ……
    return Integer.parseInt(str)
}