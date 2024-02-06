package buildingblocs;

import java.util.Random;

/**
 *
 * @author Atef Jlassi
 */
class ImportExample {

    public static void main(String[] args) {

        //  int _; as of release 9, '_' is a keyword, and may not be used as an identifier
        // var i; cf :   (cannot use 'var' on variable without initializer)
        // cf without import java.util.Random
        Random r = new Random();
        System.out.println(r.nextInt(10)); // 0-9

    }

}

class NonePublic {

}
