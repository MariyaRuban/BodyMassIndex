public class BMI {
    public int calculate(int weightKg, double heightMetr) {

        return (int) (weightKg / (heightMetr * heightMetr));
    }
}
