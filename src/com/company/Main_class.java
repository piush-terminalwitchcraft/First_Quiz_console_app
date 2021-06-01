package com.company;

import com.google.gson.annotations.SerializedName;

import java.io.IOException;
public class Main_class implements result {
    @SerializedName("Q_type")
    int Q_type;
    @SerializedName("Que")
    String Que;
    @SerializedName("op1")
    String opt1;
    @SerializedName("op2")
    String opt2;
    @SerializedName("op3")
    String opt3;
    @SerializedName("op4")
    String opt4;
    @SerializedName("ans")
    String[] ans;
    String Opt;
    int score = 0;
    public int getScore() { return score; }
    public String[] getAns() { return ans; }
    public String getOpt1() {
        return opt1;
    }
    public String getOpt2() {
        return opt2;
    }
    public String getOpt3() {
        return opt3;
    }
    public String getOpt4() {
        return opt4;
    }
    public String getQue() {
        return Que;
    }
    public void setAns(String[] ans) {
        this.ans = ans;
    }
    public int getQ_type() {
        return Q_type;
    }
    void select_topic(int a) throws IOException {
        QuizData t = new QuizData();
        t.select_Question(a);
        t.get_result();
    }
    @Override
    public void get_result() {
        if(score<7){
            System.out.println("You have failed with score " + score);
        }
        else{
            System.out.println("You have passed with score " + score);
        }
    }
}
