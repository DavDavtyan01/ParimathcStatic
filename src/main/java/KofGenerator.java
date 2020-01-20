import java.util.Random;

public class KofGenerator {
    public static double generate() {
        Random random = new Random();
        double pice = (random.nextInt(22) * 5) / 100d;
        return 1.5 + pice;
    }
}
