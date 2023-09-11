// Imports for the parameters of flood

import java.lang.reflect.Array;
import java.util.*;


public class Flood {

    // An alternative implementation goes here.
    //O(n) time complexity
    public static void flood(WaterColor color, LinkedList<Coord> flooded_list, Tile[][] tiles, Integer board_size) {
        boolean[][] visited = new boolean[board_size][board_size];
        LinkedList<Coord> queue = new LinkedList<>();

        for (Coord coord : flooded_list) {
            queue.add(coord);
            visited[coord.getY()][coord.getX()] = true;
        }

        while (!queue.isEmpty()) {
            Coord current = queue.poll();

            int[][] neighborsOffsets = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

            for (int[] offset : neighborsOffsets) {
                int newY = current.getY() + offset[0];
                int newX = current.getX() + offset[1];

                if (newY >= 0 && newY < board_size && newX >= 0 && newX < board_size) {
                    Coord neighbor = new Coord(newX, newY);
                    if (!visited[newY][newX] && tiles[newY][newX].getColor() == color) {
                        visited[newY][newX] = true;
                        flooded_list.add(neighbor);
                        queue.add(neighbor);
                    }
                }
            }
        }
    }

    // Students implement this flood function.
    //O(n) time complexity
    public static void flood1(WaterColor color, LinkedList<Coord> flooded_list, Tile[][] tiles, Integer board_size) {
        LinkedList<Coord> queue = new LinkedList<>();
        boolean[][] visited = new boolean[board_size][board_size];

        for (Coord coord : flooded_list) {
            queue.add(coord);
            visited[coord.getY()][coord.getX()] = true;
        }

        while (!queue.isEmpty()) {
            Coord current = queue.removeFirst();

            for (Coord neighbor : current.neighbors(board_size)) {
                if (!visited[neighbor.getY()][neighbor.getX()] && tiles[neighbor.getY()][neighbor.getX()].getColor() == color) {
                    visited[neighbor.getY()][neighbor.getX()] = true;
                    flooded_list.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

}