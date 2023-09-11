// Imports for the parameters of flood

import java.lang.reflect.Array;
import java.util.*;


public class Flood {

    // Students implement this flood function.
    public static void flood(WaterColor color,
                             LinkedList<Coord> flooded_list,
                             Tile[][] tiles,
                             Integer board_size) {
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

    // An alternative implementation goes here.
    public static void flood1(WaterColor color,
                             LinkedList<Coord> flooded_list,
                             Tile[][] tiles,
                             Integer board_size) {
        // YOUR CODE
    }

}
