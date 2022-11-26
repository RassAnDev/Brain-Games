package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Gcd {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
    private static final String RULES = "Find the greatest common divisor of given numbers.";

    private static int calculateGcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return calculateGcd(secondNumber, firstNumber % secondNumber);
    }

    public static void game() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var firstGameNumber = Utils.generateNumber(MIN_VALUE, MAX_VALUE);
            var secondGameNumber = Utils.generateNumber(MIN_VALUE, MAX_VALUE);
            var expression = firstGameNumber + " " + secondGameNumber;
            roundsData[i][0] = expression;
            roundsData[i][1] = String.valueOf(calculateGcd(firstGameNumber, secondGameNumber));
        }

        Engine.runGame(RULES, roundsData);
    }
}
