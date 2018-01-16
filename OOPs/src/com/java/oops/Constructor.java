package com.java.oops;

public class Constructor {
    int id = 12;
    String name = "manas";
    boolean x = true;
/*    Constructor() {
        int i = 1;
        String n = "manas";
    }*/
    void display(){
        System.out.println(id+" "+name+" "+x);
    }

    public static void main(String[] args){
        Constructor c=new Constructor();
        c.display();

    }

}
