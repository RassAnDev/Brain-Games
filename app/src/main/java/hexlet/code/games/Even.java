package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Even {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void game() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var generatedNumber = Utils.generateNumber(MIN_VALUE, MAX_VALUE);

            roundsData[i][0] = String.valueOf(generatedNumber);
            roundsData[i][1] = isEven(generatedNumber) ? "yes" : "no";
        }

        Engine.runGame(RULES, roundsData);
    }
}
