package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void game() {
        Scanner scanner = new Scanner(System.in);

        var userName = "";

        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        System.out.println("To win, you need to give three correct answers in a row.");
        System.out.println();

        var userAnswer = "";
        var correctAnswer  = "";
        var answersCount = 0;

        for (var i = answersCount; i < 3; i++) {
            var generatedNumber = (int) (Math.random() * 100);

            System.out.println("Question: " + generatedNumber);
            userAnswer = scanner.next();
            System.out.println("Your answer: " + userAnswer);

            if (generatedNumber % 2 == 0) {
                correctAnswer = "yes";
            } else {
                correctAnswer = "no";
            }

            if (userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println("Correct!");
                answersCount++;
                System.out.println("Correct answers: " + answersCount);
                System.out.println();
                if (answersCount == 3) {
                    System.out.println("Congratulations, " + userName + "!");
                }
            } else {
                System.out.println("'" + userAnswer + "'" + " is wrong answer ;(. Correct answer was "
                        + "'" + correctAnswer + "'.");
                System.out.println("Let's try again, " + userName + "!");
                break;
            }
        }

        scanner.close();
    }
}
