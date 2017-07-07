package com.example.voytovich.geoquiz;

/**
 * Created by voytovich on 07.07.17.
 */

public class CheatingQuestion {
    private int mTitleQuestion;
    private boolean mIsAnswer;

    public CheatingQuestion(int TitleQuestion, boolean isAnswer) {
        mTitleQuestion = TitleQuestion;
        mIsAnswer = isAnswer;
    }

    public int getTitleQuestion() {
        return mTitleQuestion;
    }

    public void setTitleQuestion(int titleQuestion) {
        mTitleQuestion = titleQuestion;
    }

    public boolean isAnswer() {
        return mIsAnswer;
    }

    public void setAnswer(boolean answer) {
        mIsAnswer = answer;
    }
}