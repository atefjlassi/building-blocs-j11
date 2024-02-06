/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buildingblocs;

/**
 *
 * @author Atef Jlassi
 */
final class Cook {

    static class Vegetable {

        float vitamins() {
            return 8f;
        }
    }

    final class Carrot extends Vegetable {

        final float vitamins() {
            return 4;
        }
    }

    public final static void main(String[] unused) {
//        final Carrot c = new Cook().new Carrot() { // cannot inherit from final Cook.Carrot
//        };
//        System.out.println(c.vitamins());.

    }
}

interface WaterFowl {
}

class Bird {
}

class Duck extends Bird implements WaterFowl {

    public void quack() {
        System.out.println("quack!");
    }

    public static void main(String[] args) {
        Object object = (Object) new Bird();
        ////Exception in thread "main" java.lang.ClassCastException: class buildingblocs.Bird cannot be cast to class buildingblocs.Duck 
        Duck duck = (Duck) object; // Compile Success BUT RuntimeException will be throwed
        
        
        duck.quack(); 
        // -----
        var squirrel = new Object();
        int capybara = 2, mouse, beaver = -1;
        //char chipmunk = -1; // CF: Since char is an unsigned data type, it cannot be assigned a negative value
        squirrel = "";
        beaver = capybara;
        System.out.println(capybara);
        //System.out.println(mouse);
        System.out.println(beaver);
        //System.out.println(chipmunk);
        //-----------------------------------------
        
        
    }
    
    void print(Boolean b = null) {
        
    }
}
