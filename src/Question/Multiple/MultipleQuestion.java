package Question.Multiple;

import Question.Question;

public class MultipleQuestion extends Question {
    public MultipleQuestion(String question, String[] answer, String correctAnswer) {
        super(question, answer, correctAnswer);
    }

    @Override
    public int checkAnswer() {
        char[] corAns = correctAnswer.toUpperCase().toCharArray();
        char[] userAns = userInput().toUpperCase().toCharArray();

        // cycle checks answer no matter on order of letters
        int counter = 0;
        for (char userAn : userAns) {
            for (char corAn : corAns) {
                if (userAn == corAn) {
                    counter++;
                    break;
                }
            }
        }

        if (corAns.length == counter) {
            return 1;
        } else {
            return 0;
        }
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

        System.out.println("Type a letter of correct answer: \t\t (There are more than 1 correct answer.)");

    }
}
