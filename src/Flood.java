// Imports for the parameters of flood

import java.lang.reflect.Array;
import java.util.*;


public class Flood {

    // Students implement this flood function.
    public static void flood(WaterColor color,
                              LinkedList<Coord> flooded_list,
                              Tile[][] tiles,
                              Integer board_size) {
        boolean[][] visited = new boolean[board_size][board_size];

        if (tiles[0][0].getColor() == color) {
            flooded_list.add(new Coord(0, 0));
            visited[0][0] = true;
        }

        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};

        for (int i = 0; i < flooded_list.size(); i++) {
            Coord currentCoord = flooded_list.get(i);

            for (int j = 0; j < 4; j++) {
                int newX = currentCoord.getX() + dx[j];
                int newY = currentCoord.getY() + dy[j];

                if (newX >= 0 && newX < board_size && newY >= 0 && newY < board_size) {
                    if (!visited[newY][newX] && tiles[newY][newX].getColor() == color) {
                        flooded_list.add(new Coord(newX, newY));
                        visited[newY][newX] = true;
                    }
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
