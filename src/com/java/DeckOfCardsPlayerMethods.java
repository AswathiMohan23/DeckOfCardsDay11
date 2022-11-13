package com.java;

import static com.java.PlayerDetails.randomRankCheck;
import static com.java.PlayerDetails.randomSuitCheck;

public class DeckOfCardsPlayerMethods{
    static String[][] firstPlayer = new String[3][3];
    static String[][] secondPlayer = new String[3][3];
    static String[][] thirdPlayer = new String[3][3];
    static String[][] fourthPlayer = new String[3][3];

    public static void main(String[] args) {
        cardDistribution(firstPlayer,"player1");
        cardDistribution(secondPlayer,"player2");
        cardDistribution(thirdPlayer,"player3");
        cardDistribution(fourthPlayer,"player4");

    }


    public static void cardDistribution(String[][] player,String playerName) {
        for(int i=0;i<3;i++){ // each player needs 9 cards 3 rows 3 columns =9
            String rank=randomRankCheck();
            for(int j=0;j<3;j++){
                String suit=randomSuitCheck();
                String input=suit+"-"+rank;
                player[i][j]=input;
            }
        }
        printingPlayerData(player,playerName);
    }

    private static void printingPlayerData(String[][] player,String playerName) {
        System.out.println("\n============================  "+playerName+"'s cards  ===============================");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(player[i][j]==null){
                    i++;j++;
                }
                System.out.println(player[i][j]);
            }
        }
    }
}