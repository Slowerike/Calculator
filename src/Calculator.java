public class Calculator {
    private long resultInLong;
    private double resultInDouble;
    private Numerator numerator;
    private Number number1;
    private Number number2;
    private String operator;
    private final Memory memory=new Memory();

    public Calculator(Number number1, String operator, Number number2) {
        this.number1 = number1;
        this.operator = operator.trim().toLowerCase();
        choseOperator(this.operator);
        this.number2 = number2;
    }
    private void choseOperator(String operator){
        switch (operator) {
            case "+" -> numerator = new Addition();
            case "-" -> numerator = new Subtraction();
            case "*" -> numerator = new Multiplication();
            case "/" -> numerator = new Division();
            case "%" -> numerator = new Interest();
        }
    }

    public String getMemory() {
        return  memory.getResult().toString();
    }

    public void calculate() {
        double localResult = (double) numerator.calculate(number1, number2);
        if (localResult % 1 == 0) {
            resultInLong = (long) localResult;
            memory.setMemory(resultInLong);
        } else {
            resultInDouble = localResult;
            memory.setMemory(resultInDouble);
        }
    }
    public void calculate(String operator, Number number2) {
        this.number1 = memory.getResult();
        this.operator = operator.trim().toLowerCase();
        choseOperator(this.operator);
        this.number2 = number2;
        double localResult = (double) numerator.calculate(number1, number2);
        if (localResult % 1 == 0) {
            resultInLong = (long) localResult;
            memory.setMemory(resultInLong);
        } else {
            resultInDouble = localResult;
            memory.setMemory(resultInDouble);
        }
    }


    public String getResult() {
        String result;
        long numberNew1= 0;
        long numberNew2= 0;
        if (resultInDouble % 1 != 0) {
            result = String.valueOf(resultInDouble);
        } else {
            result = String.valueOf(resultInLong);
        }
        if ((Double)number1 % 1 == 0) {
            numberNew1=  number1.longValue();
        }
        if ((Double)number2 % 1 == 0){
            numberNew2= number2.longValue();
        }
        String formattedNumber1 = (numberNew1 == 0) ? number1.toString() : String.valueOf(numberNew1);
        String formattedNumber2 = (numberNew2 == 0) ? number2.toString() : String.valueOf(numberNew2);
        return "Резутат вычисления %s %s %s = %s\n".formatted(formattedNumber1, operator, formattedNumber2, result);
    }

}
