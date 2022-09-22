package com.pedrohlimadev.application;

import com.pedrohlimadev.entities.AbstractShape;
import com.pedrohlimadev.entities.Circle;
import com.pedrohlimadev.entities.Rectangle;
import com.pedrohlimadev.enums.Color;

public class Program {
    public static void main(String[] args) {
        AbstractShape s1 = new Circle(Color.RED, 2.0);
        AbstractShape s2 = new Rectangle(Color.GREEN, 3.0, 4.0);

        System.out.println(s1.area());
        System.out.println(s2.area());
    }
}
