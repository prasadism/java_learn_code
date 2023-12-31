/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test;

/**
 *
 * @author prasad
 */
public class Test {

    public static void main(String[] args) {
       
        calculateScore(false, 3000,20,100);
        
    }
    
    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
         int finalScore = score;

            if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
                           }
            else {
            System.out.println("------------------------");
            System.out.println("Game not Completed Yet");
            System.out.println("-------------------------");
            }
    }

}
