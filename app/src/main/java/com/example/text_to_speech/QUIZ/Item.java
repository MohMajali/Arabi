package com.example.text_to_speech.QUIZ;

public class Item {

    private String question , answer;

    public Item(String question , String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer() {
        return answer;
    }
}
