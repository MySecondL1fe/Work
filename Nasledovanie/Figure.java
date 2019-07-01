package com.company;

public class Figure {
    public int x, y, s;
    public String name;

    public Figure(int x , int y, int s, String name){
        this.x = x;      // координаты
        this.y = y;
        this.s = s;     // площадь
        this.name = name;  //тип фигуры
    }
    public void display(){
        System.out.printf(" Coordinats: x = %d y =%d, Square = %d , name: %s", x, y, s, name);
    }
}
