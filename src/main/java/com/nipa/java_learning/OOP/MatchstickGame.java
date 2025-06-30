package com.nipa.java_learning.OOP;

import java.util.Scanner;


public class MatchstickGame {
    static final int MAX_DEPTH = 10;
    static final int MAX_REMOVE = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matchsticks = 15;
        boolean isPlayerTurn = true;

        while (matchsticks > 0) {
            System.out.println("\nMatchsticks left: " + matchsticks);

            int move;

            if (isPlayerTurn) {
                System.out.print("Your move (1-4): ");
                move = scanner.nextInt();

                if (move < 1 || move > MAX_REMOVE || move > matchsticks) {
                    System.out.println("Invalid move. Try again.");
                    continue;
                }
            } else {
                move = getBestMove(matchsticks);
                System.out.println("AI takes " + move + " matchstick(s).");
            }

            matchsticks -= move;
            isPlayerTurn = !isPlayerTurn;
        }

        String winner = isPlayerTurn ? "AI" : "You";
        System.out.println("\nGame over! " + winner + " wins!");

        scanner.close();
    }

    // Evaluate terminal state
    static int evaluate(int matchsticks, boolean isMax) {
        if (matchsticks == 0) {
            return isMax ? -1 : 1;
        }
        return 0;
    }

    // Alpha-beta pruning logic
    static int alphaBeta(int matchsticks, int depth, int alpha, int beta, boolean isMax) {
        if (depth == 0 || matchsticks == 0) {
            return evaluate(matchsticks, isMax);
        }

        if (isMax) {
            int maxEval = Integer.MIN_VALUE;
            for (int move = 1; move <= MAX_REMOVE; move++) {
                if (matchsticks >= move) {
                    int eval = alphaBeta(matchsticks - move, depth - 1, alpha, beta, false);
                    maxEval = Math.max(maxEval, eval);
                    alpha = Math.max(alpha, eval);
                    if (beta <= alpha) break;
                }
            }
            return maxEval;
        } else {
            int minEval = Integer.MAX_VALUE;
            for (int move = 1; move <= MAX_REMOVE; move++) {
                if (matchsticks >= move) {
                    int eval = alphaBeta(matchsticks - move, depth - 1, alpha, beta, true);
                    minEval = Math.min(minEval, eval);
                    beta = Math.min(beta, eval);
                    if (beta <= alpha) break;
                }
            }
            return minEval;
        }
    }

    // Get best move for AI using alpha-beta
    static int getBestMove(int matchsticks) {
        int bestValue = Integer.MIN_VALUE;
        int bestMove = 1;

        for (int move = 1; move <= MAX_REMOVE; move++) {
            if (matchsticks >= move) {
                int value = alphaBeta(matchsticks - move, MAX_DEPTH, Integer.MIN_VALUE, Integer.MAX_VALUE, false);
                if (value > bestValue) {
                    bestValue = value;
                    bestMove = move;
                }
            }
        }

        return bestMove;
    }
}

