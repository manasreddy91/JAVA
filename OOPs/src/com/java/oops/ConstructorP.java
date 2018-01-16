package com.java.oops;

public class ConstructorP {
    int id;
    String name;

    ConstructorP(int i, String n){
        id = i;
        name = n;
    }
    void display(){
        System.out.println(id+" "+name);
    }

    public static void main(String[] args) {
        ConstructorP s1 = new ConstructorP(111, "manas");
        ConstructorP s2 = new ConstructorP(121, "Reddy");
        s1.display();
        s2.display();
    }
}
