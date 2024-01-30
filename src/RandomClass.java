import java.util.Random;

public class RandomClass {
    public static void main(String[] args) {

        Random random = new Random();

        String name = "Hakan";

        int x = random.nextInt(name.length());

        System.out.println(x);

    }
}
