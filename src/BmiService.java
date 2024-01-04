public class BmiService {
    public double calculate (double height, int weight) {
        double BMI = weight / (height*height);
        return BMI;

    }
}
