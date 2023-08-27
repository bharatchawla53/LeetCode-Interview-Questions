package com.company.graphs;

import java.util.LinkedList;
import java.util.Queue;

public class minKnightMoves {
    public static void main(String[] args) {
        System.out.println(knightMoves(2, 1));
        System.out.println(knightMoves(5, 5));
    }

    private static int knightMoves(int x, int y) {
        int[][] moves = new int[][]{{-1, 2}, {1, 2}, {2, 1}, {2, -1}, {1, -2}, {-1, -2}, {-2, -1}, {-2, 1}};

        boolean[][] visited = new boolean[601][601];
        Queue<int[]> queue = new LinkedList<>();

        // starting position
        queue.offer(new int[]{0, 0, 0});

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();

            if (pos[0] == x && pos[1] == y) {
                return pos[2];
            }

            for (int[] move : moves) {
                int nx = pos[0] + move[0];
                int ny = pos[1] + move[1];

                if (nx >= -2 && ny >= -2 && nx <= x + 2 && ny <= y + 2 && !visited[nx + 302][ny  + 302]) {
                    queue.add(new int[]{nx, ny, pos[2] + 1});
                    visited[nx + 302][ny + 302] = true;
                }
            }
        }

        return -1;
    }

}
