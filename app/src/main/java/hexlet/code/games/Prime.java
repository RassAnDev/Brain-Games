package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Prime {
    private static final String RULES = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    private static boolean isPrime(int number) {
        for (var i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void game() {
        Random random = new Random();

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var generatedNumber = random.nextInt(100) + 2;
            roundsData[i][0] = String.valueOf(generatedNumber);

            if (isPrime(generatedNumber)) {
                roundsData[i][1] = "yes";
            } else {
                roundsData[i][1] = "no";
            }
        }

        Engine.runGame(RULES, roundsData);
    }
}
