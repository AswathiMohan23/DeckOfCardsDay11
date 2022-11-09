package com.java;

import java.util.LinkedList;

public class DeckOfCardsPlayerMethods {

    static int[] queueArray=new int[9];
    static PlayerDetails playerDetails=new PlayerDetails();
    static LinkedList <String> firstPlayer=new LinkedList<>();
    static LinkedList <String> secondPlayer=new LinkedList<>();
    static LinkedList <String> thirdPlayer=new LinkedList<>();
    static LinkedList <String> fourthPlayer=new LinkedList<>();
    static LinkedList <String> rank1 =new LinkedList<>();
    static LinkedList <String> rank2 =new LinkedList<>();
    static LinkedList <String> rank3 =new LinkedList<>();
    static LinkedList <String> rank4 =new LinkedList<>();



    public static void main(String[] args) {
        addCards(firstPlayer,"player1",rank1);
        addCards(secondPlayer,"player2",rank2);
        addCards(thirdPlayer,"player3",rank3);
        addCards(fourthPlayer,"player4",rank4);
    }

    public static void addCards(LinkedList player, String playerName, LinkedList rank) {
        for (int i =   0; i < 9; i++) {
            String randomSuit = playerDetails.randomSuitCheck();
            String randomRank = playerDetails.randomRankCheck();
            player.add(randomSuit);
            rank.add(randomRank);
        }
        System.out.println("\n\n======================="+playerName+"'s cards ========================\n"+"\n"+player+"\nrank : "+rank);
    }


    }






  /*  private static void printingPlayerData(LinkedList<String> player, String playerName) {
        System.out.println("\n============================  "+playerName+"'s cards  ===============================");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(player[i][j]==null){
                    i++;j++;
                }
                System.out.println(player[i][j]);
            }
        }
    }*/


