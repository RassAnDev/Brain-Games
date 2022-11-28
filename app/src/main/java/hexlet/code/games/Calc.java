package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Calc {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
    private static final char[] OPERATORS = {'+', '-', '*'};
    private static final String RULES = "What is the result of the expression?";

    private static int calculate(char operator, int firstNumber, int secondNumber) {
        switch (operator) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            default:
                throw new RuntimeException("Unknown operator: " + operator);
        }
    }

    public static void game() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int firstNumber = Utils.generateNumber(MIN_VALUE, MAX_VALUE);
            int secondNumber = Utils.generateNumber(MIN_VALUE, MAX_VALUE);
            int randomOperator = Utils.generateNumber(0, OPERATORS.length - 1);
            char operator = OPERATORS[randomOperator];
            String expression = firstNumber + " " + operator + " " + secondNumber;
            int result = calculate(operator, firstNumber, secondNumber);
            roundsData[i][0] = expression;
            roundsData[i][1] = String.valueOf(result);
        }

        Engine.runGame(RULES, roundsData);
    }
}
