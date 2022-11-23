package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final int ROUNDS_COUNT = 3;

    public static void runGame(String rules, String[][] gameData) {
        Scanner scanner = new Scanner(System.in);

        var userName = "";

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);
        System.out.println("To win, you need to give three correct answers in a row.");
        System.out.println();

        var answersCount = 0;

        for (var i = 0; i < ROUNDS_COUNT; i++) {
            var userAnswer = "";

            System.out.println("Question: " + gameData[i][0]);
            userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);

            if (userAnswer.equalsIgnoreCase(gameData[i][1])) {
                System.out.println("Correct!");
                answersCount++;
                System.out.println("Correct answers: " + answersCount);
                System.out.println();
                if (answersCount == 3) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + gameData[i][1] + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        scanner.close();
    }
}
