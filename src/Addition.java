public class Addition implements Numerator {
    @Override
    public Number calculate(Number firstNumber, Number secondNumber) {
        return  firstNumber.doubleValue()+secondNumber.doubleValue();
    }
}
