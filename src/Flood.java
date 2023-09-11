// Imports for the parameters of flood

import java.lang.reflect.Array;
import java.util.*;


public class Flood {
    public static void flood1(WaterColor color, LinkedList<Coord> flooded_list, Tile[][] tiles, Integer board_size) {
        //O(n) time complexity

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

    public static void flood(WaterColor color, LinkedList<Coord> flooded_list, Tile[][] tiles, Integer board_size) {
        //O(n) time complexity

        boolean[][] visited = new boolean[board_size][board_size];

        for (Coord coord : flooded_list) {
            visited[coord.getY()][coord.getX()] = true;
        }

        LinkedList<Coord> newCoords = new LinkedList<>();

        for (int y = 0; y < board_size; y++) {
            for (int x = 0; x < board_size; x++) {
                if (visited[y][x] && tiles[y][x].getColor() == color) {
                    Coord current = new Coord(x, y);

                    for (Coord neighbor : current.neighbors(board_size)) {
                        if (!visited[neighbor.getY()][neighbor.getX()]) {
                            visited[neighbor.getY()][neighbor.getX()] = true;
                            newCoords.add(neighbor);
                        }
                    }
                }
            }
        }

        flooded_list.addAll(newCoords);
    }

}
