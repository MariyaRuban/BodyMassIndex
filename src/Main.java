public class Main {
    public static void main(String[] args) {
        BMI service = new BMI();
        double heightMetr = 1.62;
        int weightKg = 52;
        int index = service.calculate(weightKg, heightMetr);
        System.out.println(index);
    }
}