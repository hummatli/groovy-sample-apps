package com.hummatli

int a = 1
//this will not work, type of a is int
//a = "sds"

def b = 1
println b.getClass()

b = "sds"
println b.getClass()


def c = null

println c.getClass().getName() //Null Object


def d

println d.getClass().getName() //Null Object