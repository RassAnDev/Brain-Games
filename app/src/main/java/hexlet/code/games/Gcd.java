package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Gcd {
    private static final String RULES = "Find the greatest common divisor of given numbers.";

    private static int calculateGcd(int firstNumber, int secondNumber) {
        if (secondNumber == 0) {
            return firstNumber;
        }
        return calculateGcd(secondNumber, firstNumber % secondNumber);
    }

    public static void game() {
        Random random = new Random();

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var firstGameNumber = random.nextInt(100);
            var secondGameNumber = random.nextInt(100);
            var expression = firstGameNumber + " " + secondGameNumber;
            roundsData[i][0] = expression;
            roundsData[i][1] = String.valueOf(calculateGcd(firstGameNumber, secondGameNumber));
        }

        Engine.runGame(RULES, roundsData);
    }
}
