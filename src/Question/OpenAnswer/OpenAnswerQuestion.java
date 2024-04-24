package Question.OpenAnswer;

import Question.Question;

public class OpenAnswerQuestion extends Question {
    public OpenAnswerQuestion(String question, String correctAnswer) {
        super(question, correctAnswer);
    }

    @Override
    public void printQuestion() {
        System.out.println(super.question);
        System.out.println("Enter a full-text answer:");

    }
}
