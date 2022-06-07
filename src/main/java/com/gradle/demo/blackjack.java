package com.gradle.demo;

import java.util.*;
public class blackjack {
    public static int bjack=21;
    public static int parseCard(String card) {
        HashMap<String, Integer> value = new HashMap<>();
        value.put("ace", 11);
        value.put("two", 2);
        value.put("three", 3);
        value.put("four", 4);
        value.put("five", 5);
        value.put("six", 6);
        value.put("seven", 7);
        value.put("eight", 8);
        value.put("nine", 9);
        value.put("ten", 10);
        value.put("jack", 10);
        value.put("queen", 10);
        value.put("king", 10);
        value.put("other", 0);
        return value.get(card);
    }

    public static boolean isBlackjack(String card1, String card2) {
        return parseCard(card1)+parseCard(card2)==bjack;
    }

    public static String largeHand(boolean isBlackjack, int dealerScore) {
        if(isBlackjack==true && dealerScore<10)
        {
            return "W";
        }
        else if(isBlackjack!=true)
        {
            return "P";
        }
        return "S";
    }

    public static String smallHand(int handScore, int dealerScore) {
        if(handScore>=17)
        {
            return "S";
        }
        else if(handScore<=11)
        {
            return "H";
        }
        else if(handScore<=16 && handScore>=12 && dealerScore>=7)
        {
            return "H";
        }
        return "S";
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls the other functions together in a
    // complete decision tree for the first turn.
    public static String firstTurn(String card1, String card2, String dealerCard) {
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
    }
    public static void main(String args[])
    {
        blackjack obj=new blackjack();
        System.out.println(obj.parseCard("ace"));
        System.out.println(obj.isBlackjack("queen", "ace"));
        boolean isBlackJack = true;
        int dealerScore = 7;
        System.out.println(obj.largeHand(isBlackJack, dealerScore));
        int handScore = 15;
        dealerScore = 12;
        System.out.println(obj.smallHand(handScore, dealerScore));
    }
}

