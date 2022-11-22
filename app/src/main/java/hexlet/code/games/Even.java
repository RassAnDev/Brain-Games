package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Even {
    private static final String RULES = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    public static void game() {
        Random random = new Random();

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var generatedNumber = random.nextInt(100);

            roundsData[i][0] = String.valueOf(generatedNumber);

            if (generatedNumber % 2 == 0) {
                roundsData[i][1] = "yes";
            } else {
                roundsData[i][1] = "no";
            }
        }

        Engine.runGame(RULES, roundsData);
    }
}
