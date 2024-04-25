import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int x;
        double y;
        boolean z;
        x = random.nextInt(6)+1;
        y = random.nextDouble();
        z = random.nextBoolean();

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
