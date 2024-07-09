
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.choosingOperation("-");
        calculator.calculate(9, 2);
        System.out.printf("Резутат вычисления %d %s %d = %s\n", 9, "-", 2, calculator.getResult());

        calculator.choosingOperation("+");
        calculator.calculate(6, 2);
        System.out.printf("Резутат вычисления %d %s %d = %s\n", 6, "+", 2, calculator.getResult());

        calculator.choosingOperation("/");
        calculator.calculate(2, 33);
        System.out.printf("Резутат вычисления %d %s %d = %s\n", 2, "/", 33, calculator.getResult());

        calculator.choosingOperation("*");
        calculator.calculate(2, 10);
        System.out.printf("Резутат вычисления %d %s %d = %s\n", 2, "*", 10, calculator.getResult());

        calculator.choosingOperation("%");
        calculator.calculate(100, 10);
        System.out.printf("Резутат вычисления %d %s %d = %s\n", 100, "%", 10, calculator.getResult());

        calculator.choosingOperation("/");
        calculator.calculate(44.4, 11.1);
        System.out.printf("Резутат вычисления %.1f %s %.1f = %s\n", 44.4, "/", 11.1, calculator.getResult());


    }
}

