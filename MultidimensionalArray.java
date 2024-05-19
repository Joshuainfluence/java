public class MultidimensionalArray {
    public static void main(String[] args) {
        // 2D array = an array of arrays

        String[][] cars = new String[3][3];
        cars[0][0] = "Camero";
        cars[0][1] = "Benz";
        cars[0][2] = "Lexus";
        cars[1][0] = "Venza";
        cars[1][1] = "Camry";
        cars[1][2] = "Corolla";
        cars[2][0] = "BMW";
        cars[2][1] = "Bentley";
        cars[2][2] = "Roseroyce";
       
        for (int i = 0; i < cars.length; i++) {
            System.out.println();
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + " ");
            }
        }

        


        String[][] bigCar = {
            {"camero", "corvette", "silverado"},
            {"mustang", "ranger", "f-150"},
            {"Ferrari", "Lambo", "tesla"}
        };

        for (int i = 0; i < bigCar.length; i++) {
            System.out.println();
            for (int j = 0; j < bigCar[i].length; j++) {
                System.out.print(bigCar[i][j] + " ");
            }
        }
    }
}
