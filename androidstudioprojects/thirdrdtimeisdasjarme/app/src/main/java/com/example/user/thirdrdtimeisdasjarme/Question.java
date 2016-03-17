package com.example.user.thirdrdtimeisdasjarme;

/**
 * Created by User on 14.3.2016.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;

    public Question(int textResId,boolean answerTrue) {
        mAnswerTrue = answerTrue;
        mTextResId = textResId;
    }
    public int getTextResId() {
        return mTextResId;
    }
    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }
    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }
    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

}
