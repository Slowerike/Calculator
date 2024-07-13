public class Interest implements Numerator {

    @Override
    public Number calculate(Number firstNumber, Number secondNumber) {
        return (firstNumber.doubleValue()*secondNumber.doubleValue())/100;
    }
}
