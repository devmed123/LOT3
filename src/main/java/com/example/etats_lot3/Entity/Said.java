package com.example.etats_lot3.Entity;

import org.apache.tomcat.util.buf.StringUtils;

import java.awt.*;

public class Said<T> {
    T a;
   public void display(){
       System.out.println(this.toString());
       if (a instanceof Integer ){
           System.out.println("i am an integer");
       }
    }
    public static void main(String[] args) {
        Said<Integer>a =new Said<Integer>();
        a.a=new Integer(2);
        a.display();
    }
}
