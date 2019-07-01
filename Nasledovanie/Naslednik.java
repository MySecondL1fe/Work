package com.company;

public class Naslednik extends Figure  {
 private int p;
 public Naslednik(int x, int y, int s,String name, int p){
 super(x,y,s,name);
 this.p = p;
 }
 @Override
 public void display(){
     System.out.printf(" Coordinats: x = %d y =%d, Square = %d , name: %s, perimetr: %d", x, y, s, name, p);
 }
}
