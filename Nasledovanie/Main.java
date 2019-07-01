package com.company;

public class Main {

    public static void main(String[] args) {
	Figure one = new Figure(15, 19, 28, "Triangle");
    one.display();

    Naslednik two = new Naslednik(15, 23, 211, "Rectangle", 23);
    two.display();
    }
}
