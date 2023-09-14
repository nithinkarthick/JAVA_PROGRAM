package com.java.hackerrank;

import java.util.Arrays;

public class GridSorting {
    public static void main(String[] args) {
        String[] grid = {"abc", "ade", "efg"};
        String result = gridSort(grid);
        System.out.println(result);
    }

    public static String gridSort(String[] grid) {
        // Rearrange characters in each row alphabetically
        for (int i = 0; i < grid.length; i++) {
            char[] row = grid[i].toCharArray();
            Arrays.sort(row);
            grid[i] = new String(row);
        }

        // Check if columns are sorted in ascending order
        for (int col = 0; col < grid[0].length(); col++) {
            for (int row = 1; row < grid.length; row++) {
                if (grid[row].charAt(col) < grid[row - 1].charAt(col)) {
                    return "NO";
                }
            }
        }

        return "YES";
    }
}


/*    --------------same code for List<String>------------------


import java.util.*;

public class GridSorting {
    public static void main(String[] args) {
        List<String> grid = new ArrayList<>();
        grid.add("abc");
        grid.add("ade");
        grid.add("efg");

        String result = gridSort(grid);
        System.out.println(result);
    }

    public static String gridSort(List<String> grid) {
        // Rearrange characters in each row alphabetically
        for (int i = 0; i < grid.size(); i++) {
            char[] row = grid.get(i).toCharArray();
            Arrays.sort(row);
            grid.set(i, new String(row));
        }

        // Check if columns are sorted in ascending order
        for (int col = 0; col < grid.get(0).length(); col++) {
            for (int row = 1; row < grid.size(); row++) {
                if (grid.get(row).charAt(col) < grid.get(row - 1).charAt(col)) {
                    return "NO";
                }
            }
        }

        return "YES";
    }
}




*/