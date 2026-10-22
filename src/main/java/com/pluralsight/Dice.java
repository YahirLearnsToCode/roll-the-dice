package com.pluralsight;

public class Dice {
    public static void main(String[] args) {
        int roll1, roll2;
        int twoCounter = 0 , fourCounter = 0, sixCounter = 0, sevenCounter = 0;

        Dice dice = new Dice();

        for(int i = 1; i <= 100; i++){
            roll1 = dice.roll();
            roll2 = dice.roll();
            int sum = roll1 + roll2;

            System.out.println("Roll " + i +":   " + roll1 + "   -   " + roll2 + "   Sum:   " + sum);

            if(sum == 2) {
                twoCounter++;
                continue;
            }
            if(sum == 4) {
                fourCounter++;
                continue;
            }
            if(sum == 6) {
                sixCounter++;
                continue;
            }
            if (sum == 7) {
                sevenCounter++;
            }
        }

        System.out.println("\ntwoCounter: " + twoCounter);
        System.out.println("fourCounter: " + fourCounter);
        System.out.println("sixCounter: " + sixCounter);
        System.out.println("sevenCounter: " + sevenCounter);

    }
    public int roll(){
        int maxValue = 6;
        int minValue = 1;
        int randomNumber = (int)(Math.random() * (maxValue - minValue + 1)) + minValue;

        return randomNumber;
    }
}
