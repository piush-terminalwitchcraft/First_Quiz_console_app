package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class QuizData extends question{
    void select_Question(int k) throws IOException {
        Que = "";
        Opt = "";
        Q_type = -1;
        ArrayList<String> Q = new ArrayList<String>();
        Q.add("0");
        Q.add("1");
        Q.add("2");
        Q.add("3");
        Collections.shuffle(Q);
        for(String s : Q){
            int a = Integer.parseInt(s);
            if(k==1){
            select_and_get_question_of_maths(a);
            }
            if(k==2){
            select_and_get_question_of_phy(a);
            }
        }
    }
}
