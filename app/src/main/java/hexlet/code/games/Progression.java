package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {
    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 100;
    private static final String RULES = "What number is missing in the progression?";

    private static String[] makeProgression(int start, int step, int length) {
        String[] progression = new String[length];

        for (int i = 0; i < length; i++) {
            progression[i] = Integer.toString(start + i * step);
        }

        return progression;
    }

    public static void game() {
        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var startProgression = Utils.generateNumber(MIN_VALUE, MAX_VALUE);
            var stepProgression = Utils.generateNumber(1, 10);
            var lengthProgression = Utils.generateNumber(5, 10);
            var randomElement = Utils.generateNumber(MIN_VALUE, lengthProgression - 1);
            var hiddenElement = "";
            String[] progression = makeProgression(startProgression, stepProgression, lengthProgression);

            for (var j = 0; j < progression.length; j++) {
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
