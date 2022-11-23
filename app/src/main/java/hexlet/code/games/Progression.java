package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Progression {
    private static final String RULES = "What number is missing in the progression?";

    public static void game() {
        Random random = new Random();

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var startProgression = random.nextInt(100) + 1;
            var stepProgression = random.nextInt(10);
            var sizeProgression = random.nextInt(5 + 1) + 5;
            var randomElement = random.nextInt(sizeProgression);
            var hiddenElement = "";
            String[] progression = new String[sizeProgression];

            for (var j = 0; j < sizeProgression; j++) {
                progression[j] = String.valueOf(startProgression + ((j - 1) * stepProgression));
                if (j == randomElement) {
                    hiddenElement = progression[j];
                    progression[j] = "..";
                }
            }

            roundsData[i][0] = String.join(" ", progression);
            roundsData[i][1] = hiddenElement;
        }

        Engine.runGame(RULES, roundsData);
    }
}
