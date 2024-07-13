import java.util.Scanner;

public class RunCalculator {
    private  boolean isValidOperator(String operator) {
        return !operator.equals("+")&& !operator.equals("*") && !operator.equals("-") && !operator.equals("/") && !operator.equals("%") && !operator.equalsIgnoreCase("exit");
    }

    void runCalculator() {
        Scanner scanner = new Scanner(System.in);
        double firstNumber;
        String operator;
        double secondNumber;
        String result;
        a:
        while (true) {
            try {
                System.out.print("Введите первое число: ");
                firstNumber = Double.parseDouble(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                continue;
            }

            System.out.print("Введите оператор(+,-,/,%) либо exit для выхода из программы: ");
            operator = scanner.nextLine().trim();
            while (isValidOperator(operator)) {
                System.out.print("Введите оператор(+,-,/,%) либо exit для выхода из программы: ");
                operator = scanner.nextLine().trim();
            }
            if (operator.equalsIgnoreCase("exit")) {
                break;
            }
            while (true) {
                try {
                    System.out.print("Введите второе число: ");
                    secondNumber = Double.parseDouble(scanner.nextLine().trim());
                    break;
                } catch (NumberFormatException ignored) {
                }
            }
            Calculator calculator = new Calculator(firstNumber, operator, secondNumber);
            calculator.calculate();
            while (true) {
                System.out.print("Ввывести результат напиши да/нет: ");
                result = scanner.nextLine().trim();
                if (result.equalsIgnoreCase("да")) {
                    System.out.println(calculator.getResult());
                    break;
                } else if (result.equalsIgnoreCase("нет")) {
                    System.out.printf("Первое число: %s\n", calculator.getMemory());

                    System.out.print("Введите оператор(+,-,/,%) либо exit для выхода из программы: ");
                    operator = scanner.nextLine().trim();
                    while (isValidOperator(operator)) {
                        System.out.print("Введите оператор(+,-,/,%) либо exit для выхода из программы: ");
                        operator = scanner.nextLine().trim();
                    }
                    if (operator.equalsIgnoreCase("exit")) {
                        break a;
                    }
                    while (true) {
                        try {
                            System.out.print("Введите второе число: ");
                            secondNumber = Double.parseDouble(scanner.nextLine().trim());
                            break;
                        } catch (NumberFormatException ignored) {
                        }
                    }
                    calculator.calculate(operator, secondNumber);
                }
            }
        }
    }
}
