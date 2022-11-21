package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public class Calc {
    private static final String RULES = "What is the result of the expression?";

    public static void game() {
        Random random = new Random();

        String[][] roundsData = new String[Engine.ROUNDS_COUNT][2];

        for (var i = 0; i < Engine.ROUNDS_COUNT; i++) {
            var firstNumber = random.nextInt(100);
            var secondNumber = random.nextInt(100);
            var operator = random.nextInt(3);
            var operatorSwitch = "";
            var result = 0;

            switch(operator) {
                case 0: operatorSwitch = "+";
                    result = firstNumber + secondNumber;
                    break;
                case 1: operatorSwitch = "-";
                    result = firstNumber - secondNumber;
                    break;
                case 2: operatorSwitch = "*";
                    result = firstNumber * secondNumber;
                    break;
                default: operatorSwitch = "";
            }

            var expression = firstNumber + " " + operatorSwitch + " " + secondNumber;
            roundsData[i][0] = expression;
            roundsData[i][1] = String.valueOf(result);
        }

        Engine.runGame(RULES, roundsData);
    }
}
