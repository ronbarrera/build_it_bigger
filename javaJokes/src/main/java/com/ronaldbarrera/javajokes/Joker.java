package com.ronaldbarrera.javajokes;

import java.util.Random;

public class Joker {

    String [] jokes = {
            "What’s the best thing about Switzerland? I don’t know, but the flag is a big plus.",
            "Did you hear about the mathematician who’s afraid of negative numbers? He’ll stop at nothing to avoid them.",
            "Why do we tell actors to “break a leg? Because every play has a cast.",
            "Why don’t scientists trust atoms? Because they make up everything.",
            "How does a rabbi make coffee? Hebrews it!",
            "Rest in peace boiling water. You will be mist!",
            "How do you throw a space party? You planet!",
            "Want to hear a construction joke? Oh never mind, I'm still working on that one.",
            "Why don't scientists trust atoms? Because they make up everything!",
            "Talk is cheap? Have you ever talked to a lawyer?",
            "What do you call a boomerang that doesn't come back? A stick!",
            "Why did the rubber chicken cross the road? She wanted to stretch her legs."
    };

    public String getJoke(){
        int rand = new Random().nextInt(jokes.length);
        return jokes[rand];
    }
}
