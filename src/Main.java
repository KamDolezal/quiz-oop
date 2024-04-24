import Data.QuestionDatabase;
import Question.Question;


import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final QuestionDatabase questionDatabase1 = new QuestionDatabase();
        final List<Question> questionList = questionDatabase1.inputData();
        Random random = new Random();
        int questNumber;    // is used for random question number drawing
        int correctAnswerCounter = 0;   // counter of correct answers

        // introduction:
        System.out.println();
        System.out.println("Hello, welcome to quiz, which will check your knowledge.");
        System.out.println();

        for (int i = 0; i < 3; i++) {
            questNumber = random.nextInt(3) + 3 * i;
            questionList.get(questNumber).printQuestion();
            correctAnswerCounter += questionList.get(questNumber).checkAnswer();
        }

        // results:
        if (correctAnswerCounter == 3) {
            System.out.println("Big brain, bro!");
        } else if (correctAnswerCounter == 2) {
            System.out.println("It is not bad, but you did one mistake.");
        } else if (correctAnswerCounter == 1) {
            System.out.println("Try it again, you did 2 mistakes.");
        } else {
            System.out.println("Come back to elementary school, your knowledge is horrible.");
        }
        System.out.println("Number of correct answer(s): " + correctAnswerCounter);
    }
}