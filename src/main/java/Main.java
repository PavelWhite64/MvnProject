public class Main {
    public static void main(String[] args) {
        BonusService servise = new BonusService();
        long bonus = servise.calculate(5_000, true);

    }
}
