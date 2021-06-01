package com.company;

import com.google.gson.Gson;

import java.io.*;
//import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public abstract class question extends Main_class {
    Vector<String> frame_option(String a,String b,String c,String d,String[] ans){
        ArrayList<String> opt=new ArrayList<String>();
        Vector<String> idx = new Vector<>();
        opt.add(a);opt.add(b);opt.add(c);opt.add(d);
        Collections.shuffle(opt);
        String[] index= new String[ans.length];
        for(int i=0;i< ans.length;i++){
            int k = opt.indexOf(ans[i]) + 1;
            index[i]  = Integer.toString(k);
            idx.add(index[i]);
        }
        String option = "";
        int att = 1;
        for(String s: opt){
            String k = Integer.toString(att);
            option = option + k + ")" + s + "  ";
            att++;
        }
        Opt = option;
        System.out.println(option);
        return idx;
    }
    void get_score(Vector<String> index){
        Scanner scanner  = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
        String k = scanner.nextLine();
        long stopTime = System.currentTimeMillis();
        if(stopTime-startTime>10000){
            System.out.println("Time Limit exceeded 10 seconds");
            k = "Wrong";
        }
        Vector<String> kt =  new Vector<>();
        String k2 = k.replace(" ","");
        for(int i=0;i<k2.length();i++){
            char k1 = k2.charAt(i);
            kt.add(String.valueOf(k1));
        }
        int t = 0;
        for (String s : kt) {
            int idx = index.indexOf(s);
            if (idx == -1) {
                t++;
            }
        }
        if(t==0 && index.size()== kt.size()){
            score+=4;
        }
        else{
            score+=(-1);
        }

    }
    void select_and_get_question_of_maths(int a){
        Gson gson = new Gson();
        try (Reader reader = new FileReader("src/com/company/Maths_Questions.json")){
            QuizData[] quizData = gson.fromJson(reader,QuizData[].class);
            Q_type=quizData[a].getQ_type();
            System.out.println(quizData[a].getQue());
            Vector<String> index = frame_option(quizData[a].getOpt1(),quizData[a].getOpt2(),quizData[a].getOpt3(),quizData[a].getOpt4(),quizData[a].getAns());
            quizData[a].get_score(index);
            score+=quizData[a].getScore();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
    void select_and_get_question_of_phy(int a) throws IOException {
        Gson gson = new Gson();
        try (Reader reader = new FileReader("src/com/company/Physics_Question.json")){
            QuizData[] quizData = gson.fromJson(reader,QuizData[].class);
            Q_type=quizData[a].getQ_type();
            System.out.println(quizData[a].getQue());
            Vector<String> index = frame_option(quizData[a].getOpt1(),quizData[a].getOpt2(),quizData[a].getOpt3(),quizData[a].getOpt4(),quizData[a].getAns());
            quizData[a].get_score(index);
            score+=quizData[a].getScore();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
