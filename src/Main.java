public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87; // рост
        int weight = 98; // вес
        double BMI = service.calculate (height,weight);
        
        System.out.println();
        System.out.println( "Индекс массы тела " + (int) BMI);
    }
}