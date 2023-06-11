package xyz.norrland.kame;

import java.io.Serializable;

public class Score<T extends Number, E extends Number> implements Serializable {
    //Could be made serializable to save scores to file in future

    private T time;
    private E numberOfQuestions;
    private E rightAnswers;

    Score(T time, E numberOfQuestions, E rightAnswers) {
        this.time = time;
        this.numberOfQuestions = numberOfQuestions;
        this.rightAnswers = rightAnswers;
    }

    //time per question
    public double timePerQuestion () {
        return time.doubleValue()/numberOfQuestions.doubleValue();
    }
    //percent of correct answers in score
    public double correctPercentage () {
        return rightAnswers.doubleValue()/numberOfQuestions.doubleValue()*100;
    }

    public double getTime () {
        return time.doubleValue();
    }

    public int getNumberOfQuestions (){
        return numberOfQuestions.intValue();
    }

    public int getRightAnswers() {
        return rightAnswers.intValue();
    }
}
