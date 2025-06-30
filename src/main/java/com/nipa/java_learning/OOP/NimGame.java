package com.nipa.java_learning.OOP;

import java.util.*;

public class NimGame {
    static final int MAX_DEPTH = 10;
    public static void main(String[] args) {
        int[] state = {3, 4, 5};
        Scanner scanner = new Scanner(System.in);
        boolean isPlayerTurn = true;

        while (!isTerminal(state)) {
            System.out.println("Current piles: " + Arrays.toString(state));
            if (isPlayerTurn) {
                System.out.print("Choose pile (0-2): ");
                int pile = scanner.nextInt();
                System.out.print("Stones to remove: ");
                int count = scanner.nextInt();

                if (pile < 0 || pile >= state.length || count <= 0 || count > state[pile]) {
                    System.out.println("Invalid move. Try again.");
                    continue;
                }

                state[pile] -= count;
            } else {
                Result result = alphaBeta(state, MAX_DEPTH, Integer.MIN_VALUE, Integer.MAX_VALUE, true);
                System.out.println("AI chooses: " + Arrays.toString(result.state));
                state = result.state;
            }
            isPlayerTurn = !isPlayerTurn;
        }

        String winner = isPlayerTurn ? "AI" : "You";
        System.out.println("Game over! " + winner + " wins!");
        scanner.close();
    }

    static boolean isTerminal(int[] state) {
        for (int pile : state) {
            if (pile != 0) return false;
        }
        return true;
    }

    static int evaluate(int[] state, boolean isMaximizing) {
        return isTerminal(state) ? (isMaximizing ? -1 : 1) : 0;
    }

    static List<int[]> getChildren(int[] state) {
        List<int[]> children = new ArrayList<>();
        for (int i = 0; i < state.length; i++) {
            for (int take = 1; take <= state[i]; take++) {
                int[] newState = state.clone();
                newState[i] -= take;
                children.add(newState);
            }
        }
        return children;
    }

    static class Result {
        int value;
        int[] state;

        Result(int value, int[] state) {
            this.value = value;
            this.state = state;
        }
    }

    static Result alphaBeta(int[] state, int depth, int alpha, int beta, boolean isMax) {
        if (isTerminal(state) || depth == 0) {
            return new Result(evaluate(state, isMax), state);
        }

        List<int[]> children = getChildren(state);
        int[] bestState = null;

        if (isMax) {
            int maxEval = Integer.MIN_VALUE;
            for (int[] child : children) {
                Result result = alphaBeta(child, depth - 1, alpha, beta, false);
                if (result.value > maxEval) {
                    maxEval = result.value;
                    bestState = child;
                }
                alpha = Math.max(alpha, maxEval);
                if (beta <= alpha) break;
            }
            return new Result(maxEval, bestState);
        } else {
            int minEval = Integer.MAX_VALUE;
            for (int[] child : children) {
                Result result = alphaBeta(child, depth - 1, alpha, beta, true);
                if (result.value < minEval) {
                    minEval = result.value;
                    bestState = child;
                }
                beta = Math.min(beta, minEval);
                if (beta <= alpha) break;
            }
            return new Result(minEval, bestState);
        }
    }
}

