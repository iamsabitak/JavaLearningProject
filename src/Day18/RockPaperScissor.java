package Day18;

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        // if 0 rock
        // if 1 paper
        // if 2 scissor
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 0 for Rock, 1 for Paper, 2 for Scissor: ");
        int user = sc.nextInt();
        // int randomInt = (int) (Math.random() * 3);
        // if (user == 0 && randomInt == 1) {
        // System.out.println("Computer Win : " + randomInt + " You Lose : " + user);
        // } else if (user == 1 && randomInt == 0) {
        // System.out.println("You Win : " + user + " Computer Lose : " + randomInt);
        // } else if (user == 0 && randomInt == 2) {
        // System.out.println("You Win : " + user + " Computer Lose : " + randomInt);
        // } else if (user == 2 && randomInt == 0) {
        // System.out.println("Computer Win : " + randomInt + " You Lose : " + user);
        // } else if (user == 1 && randomInt == 2) {
        // System.out.println("Computer Win : " + randomInt + " You Lose : " + user);
        // } else if (user == 2 && randomInt == 1) {
        // System.out.println("You Win : " + user + " Computer Lose : " + randomInt);
        // } else if (user == randomInt) {
        // System.out.println("You choose : " + user + " Computer chose : " + randomInt
        // + "Its a Tie.");
        // } else {
        // System.out.println("Invalid input! Please enter 0 for Rock, 1 for Paper, or 2
        // for Scissor.");
        // }

        if (user < 0 || user > 2) {
            System.out.println("Invalid input! Please enter 0 for Rock, 1 for Paper, or 2 for Scissor.");
        } else {
            int randomInt = (int) (Math.random() * 3);

            if (user == randomInt) {
                System.out.println("It's a Tie! You both chose " + user);
            } else if ((user == 0 && randomInt == 2) ||
                    (user == 1 && randomInt == 0) ||
                    (user == 2 && randomInt == 1)) {
                System.out.println("You Win! You chose " + user + " and the computer chose " + randomInt);
            } else {
                System.out.println("You Lose! You chose " + user + " and the computer chose " + randomInt);
            }
        }

        sc.close();
    }
}