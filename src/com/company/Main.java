package com.company;

import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        System.out.println(sqrt().apply(34.0));
    }

    public static UnaryOperator<Double> sqrt() {
        UnaryOperator<Double> unaryOperator = x -> Math.sqrt(x);
        return unaryOperator;

    }

}


