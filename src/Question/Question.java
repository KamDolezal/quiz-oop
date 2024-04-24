package Question;

import java.util.Scanner;

public abstract class Question {
    protected String question;
    protected String[] answer;
    protected String correctAnswer;

    //constructor for single and multiple questions
    public Question(String question, String[] answer, String correctAnswer) {
        this.question = question;
        this.answer = answer;

        this.correctAnswer = correctAnswer;
    }

    //constructor for open answer questions
    public Question(String question, String correctAnswer) {
        this.question = question;
        this.correctAnswer = correctAnswer;
    }

    protected String userInput() {
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        return choice;
    }

    public int checkAnswer() {
        if (userInput().toUpperCase().equals(this.correctAnswer.toUpperCase())) {
            return 1;
        } else {
            return 0;
        }
    }

    public abstract void printQuestion();
}
