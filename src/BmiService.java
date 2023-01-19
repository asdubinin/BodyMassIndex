public class BmiService {
    public float calculate(float mass, float height) {
        float result = mass / (height * height);
        return result;
    }
}
