package Question.Single;

import Question.Question;

import java.util.Scanner;

public class SingleQuestion extends Question {

    public SingleQuestion(String question, String answer[], String correctAnswer) {
        super(question, answer, correctAnswer);
    }

    @Override
    public void printQuestion() {
        System.out.println(question);
        int asciiCode = 65;
        for (String ans : super.answer) {
            char letter = (char) asciiCode;
            System.out.print(letter + ": " + ans + "\t\t");
            asciiCode++;
        }
        System.out.println();

        System.out.println("Type a letter of correct answer: \t\t (There is only 1 correct answer.)");

    }
}
