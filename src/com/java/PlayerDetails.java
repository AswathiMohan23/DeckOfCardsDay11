package com.java;

public class PlayerDetails {
    static String randomSuitCheck() {
        int randomCheck = (int) (Math.random() * (4 - 1 + 1) + 1);//Math.random()*(max-min+1)+min....max=9,min=1
        switch (randomCheck) {
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
        static String randomRankCheck() {
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
