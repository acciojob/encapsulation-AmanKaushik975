package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly ob = new RWOnly();
        ob.name = "Aman"; // Error  : Cannot access private varialbe outside its class

        System.out.println(ob.name); // Error  : Cannot access private varialbe outside its class

        // after getter and setter
        ob.setName("Aman");
        System.out.println(ob.getName());
    }
  
}