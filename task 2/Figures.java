package com.company;
/** Создание класса Figures  */
public class Figures {
    /** Поле имя */
    String name;
    /** Поле координаты фигур */
    int x,y;
    /**
     * Конструктор - создание нового объекта с определенными значениями
     * @param name - производитель
     * @param x - координата х
     * @param y - координата y
     */
    public  Figures(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
    }
}
