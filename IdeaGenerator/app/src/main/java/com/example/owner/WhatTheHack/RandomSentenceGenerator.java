package com.example.owner.WhatTheHack;

import java.util.Random;

/**
 * Created by owner on 2017-01-21.
 */
public class RandomSentenceGenerator{
    static String Idea;

    String generateIdea(String input){
        String [] Technologies = {"Amazon Echo", "HoloLens", "Oculus Rift", "iPad", "Quantum Computing", "Pebble", "Machine Learning", "Artificial Intelligence", "Cross-platform", "Cloud Computing", "Augmented Reality", "Crowdsourced", "Anonymous", "End-to-end encrypted"};
        String [] Products = {"Notetaking app", "Social media platform", "Personal assistant", "Frogger game", "Sleep tracker", "Fitness app", "Data virtualization", "Data mining", "Productivity app", "Uber", "AirBnB", "Cryptocurrency", "Cybersecurity Defence", "Self-driving Car", "Self-driving Ice Cream Truck", "Sans-serif font", "Cloud storage platform", "JavaScript Microframework", "IoT platform", "Camera glasses", "Fire extenguisher phone case", "pronounciation for 'GIF'"};
        String [] Demographics = {"Seniors", "Teens", "Hipsters", "Young Professionals", "Toddlers", "Big Families", "Billionaires", "Vegans", "Venture Capitalists", "Automotive industry", "Gamers", "New Parents", "Drunk coders", "Information Security professionals", "Authors", "Artists"};
        String [] Inspiration = {"Climate change", "Net neutrality", "Bitcoin", "Big Data", "Politics", "Livestreaming", "Caligraphy", "Samsung Galaxy Note 7s", "Justin Bieber"};


        String result= "";

        //"A TECHNOLOGIES PRODUCT for DEMOGRAPHIC built using LANGUAGE"

        Random technology_index = new Random();
        int tIndex = technology_index.nextInt(Technologies.length);

        Random products_index = new Random();
        int pIndex = products_index.nextInt(Products.length);

        Random demographics_index = new Random();
        int dIndex = demographics_index.nextInt(Demographics.length);

        Random inspiration_index = new Random();
        int iIndex = inspiration_index.nextInt(Inspiration.length);

        //if (input.compareTo("Enter your search here") != 0 && input.compareTo("") != 0){
            for(int i = 0 ; i < Technologies.length; i++) {
                if (Technologies[i].equalsIgnoreCase(input)) {
                    result = Technologies[i] + " " + Products[pIndex] + " for " + Demographics[dIndex] + " interested in " + Inspiration[iIndex];
                    return result;
                }
            }
            for(int i = 0 ; i < Products.length; i++){
                if (Products[i].equalsIgnoreCase(input)){
                    result = Technologies[tIndex] + " " + Products[i] + " for " + Demographics[dIndex] + " interested in " + Inspiration[iIndex];
                    return result;
                }
            }
            for(int i = 0 ; i < Demographics.length; i++){
                if (Demographics[i].equalsIgnoreCase(input)){
                    result = Technologies[tIndex] + " " + Products[pIndex] + " for " + Demographics[i] + " interested in " + Inspiration[iIndex];
                    return result;
                }
            }
            for(int i = 0 ; i < Inspiration.length; i++){
                if (Inspiration[i].equalsIgnoreCase(input)){
                    result = Technologies[tIndex] + " " + Products[pIndex] + " for " + Demographics[dIndex] + " interested in " + Inspiration[i];
                    return result;
                }
            }

        //}

            result = Technologies[tIndex] + " " + Products[pIndex] + " for " + Demographics[dIndex] + " interested in " + Inspiration[iIndex];


        return result;

    }


    public String getIdeas(String input){
        return Idea;
    }
}
