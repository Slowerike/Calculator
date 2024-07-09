public class Calculator {
    private long resultInLong;
    private double resultInDouble;
    private Numerator numerator;
    private boolean previousResult = false;

    public void choosingOperation(String result) {
        result = result.trim().toLowerCase();
        switch (result) {
            case "+" -> {
                numerator = new Addition();
            }
            case "-" -> {
                numerator = new Subtraction();
            }
            case "*" -> {
                numerator = new Multiplication();
            }
            case "/" -> {
                numerator = new Division();
            }
            case "%" -> {
                numerator = new Interest();
            }

        }
    }

    public void calculate(long fistNum, long secondNum) {
        double localResult = numerator.calculate(fistNum, secondNum);
        if (localResult % 1 == 0) {
            resultInLong = (long) localResult;
            previousResult = true;
        } else {
            resultInDouble = localResult;
            previousResult = false;
        }
    }

    public void calculate(double fistNum, double secondNum) {
        double localResult = numerator.calculate(fistNum, secondNum);
        if (localResult % 1 == 0) {
            resultInLong = (long) localResult;
            previousResult = true;
        } else {
            resultInDouble = localResult;
            previousResult = false;
        }
    }

    public void calculate(double fistNum, long secondNum) {
        double localResult = numerator.calculate(fistNum, secondNum);
        if (localResult % 1 == 0) {
            resultInLong = (long) localResult;
            previousResult = true;
        } else {
            resultInDouble = localResult;
            previousResult = false;
        }
    }

    public void calculate(long fistNum, double secondNum) {
        double localResult = numerator.calculate(fistNum, secondNum);
        if (localResult % 1 == 0) {
            resultInLong = (long) localResult;
            previousResult = true;
        } else {
            resultInDouble = localResult;
            previousResult = false;
        }
    }

    public String getResult() {
        String result;
        if (resultInDouble % 1 != 0 & !previousResult) {
            result = String.valueOf(resultInDouble);
        } else {
            result = String.valueOf(resultInLong);
        }
        return result;
    }

}
