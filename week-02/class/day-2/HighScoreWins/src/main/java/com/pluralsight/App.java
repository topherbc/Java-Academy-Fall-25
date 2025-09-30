package com.pluralsight;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Game Format: teamName1:teamName2|teamScore1:teamScore2
        //EX. Steelers:Packers|31:25
        System.out.print("Please enter game scores: ");
        String userInput = scan.nextLine();

        String[] inputSplit = userInput.split("\\|");

        String[] teamNames = inputSplit[0].split("\\:"); //teamNames
        String[] teamScores = inputSplit[1].split("\\:"); //scores

        String team1 = teamNames[0];
        String team2 = teamNames[1];

        int team1Score = Integer.parseInt(teamScores[0]);
        int team2Score = Integer.parseInt(teamScores[1]);

        if (team1Score > team2Score) {
            System.out.println("Winner: " + team1 + "!");
        } else if (team2Score > team1Score ){
            System.out.println("Winner: " + team2 + "!");
        } else {
            System.out.println("Tie!");
        }

    }
}
