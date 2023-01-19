public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float mass = 80;  //килограмм
        float height = 1.92F; //метр
        float index = service.calculate(mass, height);
        System.out.println("Индекс массы тела равен: " + index);
    }
}

