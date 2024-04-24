package Data;

import Question.Multiple.MultipleQuestion;
import Question.OpenAnswer.OpenAnswerQuestion;
import Question.Single.SingleQuestion;
import Question.Question;

import java.util.ArrayList;
import java.util.List;

public class QuestionDatabase {
    // single answer questions
    List<Question> questionList = new ArrayList<>();
    final SingleQuestion singleQuestion1 = new SingleQuestion("Which programing language use static typing?", new String[]{"Python", "Java", "PHP", "Javascript"}, "B");
    final SingleQuestion singleQuestion2 = new SingleQuestion("What is the name of our Java guru?", new String[]{"Tomas", "Jolanda", "Jakub", "Tigran"}, "C");
    final SingleQuestion singleQuestion3 = new SingleQuestion("Which currency is used in Czech Republic?", new String[]{"Euro", "Ringgit", "Zloty", "Czech crown"}, "D");

    // multiple answer questions
    final MultipleQuestion multipleQuestion1 = new MultipleQuestion("What we can normally find in pencil case?", new String[]{"pen", "laptop", "rubber", "beer"}, "AC");
    final MultipleQuestion multipleQuestion2 = new MultipleQuestion("Where is the Tower Bridge?", new String[]{"UK", "London", "Kurim", "Hulin"}, "AB");
    final MultipleQuestion multipleQuestion3 = new MultipleQuestion("What is soap opera?", new String[]{"Breakfast with TV Nova", "Fokus Vaclava Moravce", "Esmeralda", "Wild Angel"}, "CD");

    // open answer questions
    final OpenAnswerQuestion openAnswerQuestion1 = new OpenAnswerQuestion("What is the name of programming language starts with letter J?", "Java");
    final OpenAnswerQuestion openAnswerQuestion2 = new OpenAnswerQuestion("What is the name of Vatican capital city?", "Vatican");
    final OpenAnswerQuestion openAnswerQuestion3 = new OpenAnswerQuestion("What the Pilsner Urquell produces?", "Beer");

    public List<Question> inputData() {
        questionList.add(singleQuestion1);
        questionList.add(singleQuestion2);
        questionList.add(singleQuestion3);

        questionList.add(multipleQuestion1);
        questionList.add(multipleQuestion2);
        questionList.add(multipleQuestion3);

        questionList.add(openAnswerQuestion1);
        questionList.add(openAnswerQuestion2);
        questionList.add(openAnswerQuestion3);

        return questionList;

    }
}
