public class Division implements Numerator {
    @Override
    public double calculate(long firstNumber, long secondNumber) {
        return (double) firstNumber / secondNumber;
    }

    @Override
    public double calculate(double firstNumber, long secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public double calculate(long firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    @Override
    public double calculate(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }
}
