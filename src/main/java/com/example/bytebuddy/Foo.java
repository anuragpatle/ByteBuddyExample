package com.example.bytebuddy;

import net.bytebuddy.asm.Advice;

import java.lang.reflect.Method;

public class Foo {

    public String sayHelloFoo() {
        return "Hello in Foo!";
    }

    @Advice.OnMethodEnter(skipOn = Advice.OnDefaultValue.class)
    public void myIntercept(final @Advice.Origin Method method) {
        System.out.println("mYIntercept....");
    }

}