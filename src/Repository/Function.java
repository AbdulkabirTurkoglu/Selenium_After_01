package Repository;

public class Function {
    public static void wait(int saniye) {
        try {
            Thread.sleep(saniye * 1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
