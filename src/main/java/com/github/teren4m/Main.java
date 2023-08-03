package com.github.teren4m;

import org.apache.tvm.*;
import org.apache.tvm.Module;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Function func = Function.convertFunc(args1 -> {
            StringBuilder res = new StringBuilder();
            for (TVMValue arg : args1) {
                res.append(arg.asString());
            }
            return res.toString();
        });
        TVMValue res = func.pushArg("Hello").pushArg(" ").pushArg("World!").invoke();
        System.out.println(res.asString());
        res.release();
        func.release();
    }
}