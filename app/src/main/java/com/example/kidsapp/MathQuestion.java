package com.example.kidsapp;

import java.util.ArrayList;
import java.util.List;

public class MathQuestion {
    private int id;
    private String question;
    private List<Integer> answers;
    private int correctAnswerIndex;

    public MathQuestion() {
        id = -1;
        question = "";
        answers = new ArrayList<Integer>();
        correctAnswerIndex = -1;
    }

    public MathQuestion(int i, String q, List<Integer> a, int c) {
        id = i;
        question = q;
        answers = a;
        correctAnswerIndex = c;
    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String q) {
        question = q;
    }

    public List<Integer> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Integer> a) {
        this.answers = a;
    }

    public int getCorrectAnswerIndex() {
        return correctAnswerIndex;
    }

    public void setCorrectAnswerIndex(int i) {
        correctAnswerIndex = i;
    }

    public boolean compareAnswer(int userAnswer) {
        return userAnswer == answers.get(correctAnswerIndex);
    }
}
