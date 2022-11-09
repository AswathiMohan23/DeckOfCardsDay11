package com.java;

public class CardDetails {
    static String[][] firstPlayer = new String[3][3];
    static String[][] secondPlayer = new String[3][3];
    static String[][] thirdPlayer = new String[3][3];
    static String[][] fourthPlayer = new String[3][3];
    static String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    static String[] rank = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};

    public static void main(String[] args) {
        cardDistribution(firstPlayer,"player1");
        cardDistribution(secondPlayer,"player2");
        cardDistribution(thirdPlayer,"player3");
        cardDistribution(fourthPlayer,"player4");

    }

    private static String randomSuitCheck() {
        int randomSuitCheck = (int) (Math.random() * (4 - 1 + 1) + 1);//Math.random()*(max-min+1)+min....max=9,min=1
        switch (randomSuitCheck) {
            case 1:
                return "Clubs";
            case 2:
                return "Diamonds";
            case 3:
                return "Hearts";
            case 4:
                return "Spades";
            default:
                return "null";
        }
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

    private static String randomRankCheck() {
        int randomSuitCheck = (int) (Math.random() * (12 - 1 + 1) + 1);//Math.random()*(max-min+1)+min....max=9,min=1
        switch (randomSuitCheck) {
            case 1:
                return "2";
            case 2:
                return "3";
            case 3:
                return "4";
            case 4:
                return "5";
            case 5:
                return "6";
            case 6:
                return "8";
            case 7:
                return "9";
            case 8:
                return "10";
            case 9:
                return "jack";
            case 10:
                return "queen";
            case 11:
                return "king";
            case 12:
                return "ace";
            default:
                return "null";
        }
    }
}
