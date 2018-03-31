package com.hummatli

def f() {
   's'
}

println f()


def f2() {
    return 's'
}

println f2()


def f3(text) {
    println text
}

f3("Call with parantheses")
f3 "call without paranthes"

def f4(text1, text2) {
    println text1
}

f4("Call with parantheses", "txt2")
f4 "call without paranthes", "txt2"


def f5(arg1, arg2, arg3) {
    
}

f5 "", "", {}