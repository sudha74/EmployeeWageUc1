package com.Bridgelabz;

public class Gambler {
    public static void main(String[] args) {
        int stake = Integer.parseInt(args[0]);          //Gambler starting position
        int goal = Integer.parseInt(args[1]);           //Gambler desired position
        int trial = Integer.parseInt(args[2]);          //Gambler trial position
        int bets = 0;    //Total number of bets made
        int wins = 0;    //Total number of game wons
        //Using for loop for repeat trials times
        for (int j =0; j<trial; j++) {
            //Using while loop for one gamblers run simulaton
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;    //win $1
                else                     cash--;    //lose$1
            }
            if (cash == goal) wins++;           //if gambler achieved desired goal?
        }
        //Print the results
        System.out.println(wins + "wins of" + trial);
        System.out.println("Percent of game wons = " + 100*wins / trial);
        System.out.println("Avg # bets   = " + 1*bets / trial);

    }
}
