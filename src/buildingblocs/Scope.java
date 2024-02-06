package buildingblocs;

/**
 *
 * @author Atef Jlassi
 */
public class Scope {

    public static void main(String[] args) {
        // eatIfHungry(true);
    }

    public void eatIfHungry(boolean hungry) {
        if (hungry) {
            int cheese = 1;
        } // cheese goes out of scope here

        System.out.println(cheese); // CF
    }

    public void food(boolean hungry) {
        if (hungry) {
            int cheese = 1;
            {
                var teenyBit = true;
                System.out.println(cheese);
            }
            System.out.println(teenyBit); // CF
        } // cheese goes out of scope here
    }

    public void eatMore(boolean hungry, int amountOfFood) {
        int roomInBelly = 5;
        if (hungry) {
            var timeToEat = true;
            while (amountOfFood > 0) {

                int amountEaten = 2;
                roomInBelly = roomInBelly - amountEaten;
                amountOfFood = amountOfFood - amountEaten;
            }
        }
        System.out.println(amountOfFood);
    }

}
