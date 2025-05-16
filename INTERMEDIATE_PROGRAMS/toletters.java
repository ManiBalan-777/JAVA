


import java.util.Scanner;

public class toletters {

    String[] digitsArray = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    String[] operationsArray = {"add", "sub", "mul", "div", "rem", "pow"};

    int getNumberFromString(String token) {
        String[] parts = token.split("c");
        int number = 0;

        for (String part : parts) {
            boolean isValid = false;
            for (int j = 0; j < digitsArray.length; j++) {
                if (part.equals(digitsArray[j])) {
                    number = number * 10 + j;
                    isValid = true;
                    break;
                }
            }
            if (!isValid) {
                return -1;
            }
        }
        return number;
    }

    int evaluateOperation(String operation, int operand1, int operand2) {
        switch (operation) {
            case "add":
                return operand1 + operand2;
            case "sub":
                return operand1 - operand2;
            case "mul":
                return operand1 * operand2;
            case "div":
                return operand1 / operand2;
            case "rem":
                return operand1 % operand2;
            case "pow":
                return (int) Math.pow(operand1, operand2);
            default:
                return -1;
        }
    }

    void lettertodigit(String str) {
        String[] split = str.split(" ");

        if (split.length < 6) {
            System.out.println("expression is not complete or invalid");
            return;
        }

        int operand1 = getNumberFromString(split[3]);
        int operand2 = getNumberFromString(split[4]);
        if (operand1 == -1 || operand2 == -1) {
            System.out.println("expression evaluation stopped invalid words present");
            return;
        }

        int subResult = evaluateOperation(split[2], operand1, operand2);
        if (subResult == -1) {
            System.out.println("expression evaluation stopped invalid words present");
            return;
        }

        operand1 = subResult;
        operand2 = getNumberFromString(split[5]);
        if (operand2 == -1) {
            System.out.println("expression evaluation stopped invalid words present");
            return;
        }

        int addResult = evaluateOperation(split[0], operand1, operand2);
        if (addResult == -1) {
            System.out.println("expression evaluation stopped invalid words present");
            return;
        }

        operand1 = addResult;
        operand2 = getNumberFromString(split[6]);
        if (operand2 == -1) {
            System.out.println("expression evaluation stopped invalid words present");
            return;
        }

        int finalResult = evaluateOperation("mul", operand1, operand2);
        if (finalResult == -1) {
            System.out.println("expression evaluation stopped invalid words present");
        } else {
            System.out.println("Result: " + finalResult);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sentences:");
        String s = scanner.nextLine();
        System.out.println("The Given String is: " + s);

        toletters obj1 = new toletters();
        obj1.lettertodigit(s);
    }
}





