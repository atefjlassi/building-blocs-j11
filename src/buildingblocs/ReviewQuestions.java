/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buildingblocs;

/**
 *
 * @author Atef Jlassi
 */

class PoliceBox  {

    String color;
    long age;

    public void PoliceBox () { // BE CAREFUL THIS IS NOT A CONSTRUCTOR
        color = "blue";
        age = 1200;
    }

    public static void main(String[] time) {
        var p = new PoliceBox ();
        var q = new PoliceBox ();
        p.color = "green";
        p.age = 1400;
        p = q;
        System.out.println("Q1=" + q.color);
        System.out.println("Q2=" + q.age);
        System.out.println("P1=" + p.color);
        System.out.println("P2=" + p.age);
    }
}
