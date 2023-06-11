package xyz.norrland.kame;

//Arraylist of type Question can only be used in intent.putExtra if class is serializable.
import java.io.Serializable;

public class Question implements Serializable {

    protected String question;
    protected String correctAnswer;

    //gets question
    public String getQuestion() {
        return question;
    }

    //gets answer
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    //checks if answer is correct
    public boolean isAnswerCorrect(String input, Boolean reverse) {
        if (reverse == false) {
            return input.equals(correctAnswer);
        }
        else {
            return input.equals(question);
        }
    }

}
