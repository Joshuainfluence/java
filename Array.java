public class Array {
    public static void main(String[] args) {
        //  Array = store multiple values in a single variable

        // String[] cars = {"Camero", "corvette", "Tesla", "BMW"};

        // cars[0] = "Lexus";

        // System.out.println(cars[3]);

        // Another way to assign values to an array

        String[] cars = new String[3];
        cars[0] = "Venza";
        cars[1] = "Lexus";
        cars[2] = "BMW";

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
