public class Arithmetic {

    int number1;
    int number2;

    public Arithmetic(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public int sum() {
        return number1 + number2;
    }

    public int productOfNumbers() {
        return number1 * number2;
    }

    public int max() {
        if (number1 >= number2) {
            return number1;
        }
        return number2;
    }

    public int min() {
        if (number1 <= number2) {
            return number1;
        }
        return number2;
    }
}
