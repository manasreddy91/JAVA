package com.java.oops;

public class ConstructorOL {
    int id;
    String name;
    int age;

    ConstructorOL(int i, String n){
        id = i;
        name = n;
    }
    ConstructorOL(int i, String n,int a){
        id = i;
        name = n;
        age = a;
    }
    void display(){System.out.println(id+" "+name+" "+age);}

    public static void main(String[] args){
        ConstructorOL s1 = new ConstructorOL(111,"manas");
        ConstructorOL s2 = new ConstructorOL(121,"Reddy",26);
        s1.display();
        s2.display();
    }
}
