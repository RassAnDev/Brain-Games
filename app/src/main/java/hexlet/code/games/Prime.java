package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;


public class Prime {
    private static final int MIN_VALUE = -10;
    private static final int MAX_VALUE = 100;
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static boolean isPrime(int number) {
        if (number < 1) {
            return false;
        }
        for (var i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void game() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var generatedNumber = Utils.generateNumber(MIN_VALUE, MAX_VALUE);
            roundsData[i][0] = String.valueOf(generatedNumber);
            roundsData[i][1] = isPrime(generatedNumber) ? "yes" : "no";
        }

        Engine.runGame(RULES, roundsData);
    }
}
