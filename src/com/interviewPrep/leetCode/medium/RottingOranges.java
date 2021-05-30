package com.interviewPrep.leetCode.medium;

public class RottingOranges {
    boolean isGridUpdated = true;
    int minutes = 0;
    public int orangesRotting(int[][] grid) {
        int [][] secondCopy = new int[grid.length][grid[0].length];
        while (isGridUpdated) {
            secondCopy = updateGrid(grid);
            if (isGridUpdated) {
                minutes++;
                for (int iIndx = 0; iIndx < grid.length; iIndx++) {
                    for (int jIndx = 0; jIndx < grid[0].length; jIndx++) {
                        if (secondCopy[iIndx][jIndx] == 2) {
                            grid[iIndx][jIndx] = 2;
                        }
                    }
                }
            }
        }
        for (int iIndx = 0; iIndx < grid.length; iIndx++) {
            for (int jIndx = 0; jIndx < grid[0].length; jIndx++) {
                if (grid[iIndx][jIndx] == 1) {
                    return -1;
                }
            }
        }
        return minutes;

        /*for (int iIndx = 0; iIndx < grid.length; iIndx++) {
            for (int jIndx = 0; jIndx < grid[0].length; jIndx++) {
                if (grid[iIndx][jIndx] == 2) {
                    if (iIndx == 0 || iIndx == grid.length - 1) {
                        if(iIndx == 0) {
                            if (grid[iIndx + 1][jIndx] == 1) {
                                secondCopy[iIndx + 1][jIndx] = 2;
                            }
                            isEdgeCase = true;
                        }
                        if(iIndx == grid.length - 1) {
                            if (grid[iIndx - 1][jIndx] == 1) {
                                secondCopy[iIndx - 1][jIndx] = 2;
                            }
                        }
                    } else {
                        if (grid[iIndx + 1][jIndx] == 1) {
                            secondCopy[iIndx + 1][jIndx] =2;
                        }
                        if (grid[iIndx - 1][jIndx] == 1) {
                            secondCopy[iIndx - 1][jIndx] = 2;
                        }
                    }
                    if (jIndx == 0 || jIndx == grid[0].length-1) {
                        if(jIndx == 0) {
                            if (grid[iIndx][jIndx + 1] == 1) {
                                secondCopy[iIndx][jIndx + 1] = 2;
                            }
                        }
                        if (jIndx == grid[0].length-1) {
                            if (grid[iIndx][jIndx - 1] == 1) {
                                secondCopy[iIndx][jIndx - 1] = 2;
                            }
                        }
                    } else {
                        if (grid[iIndx][jIndx + 1] == 1) {
                            secondCopy[iIndx][jIndx + 1] = 2;
                        }
                        if (grid[iIndx][jIndx - 1] == 1) {
                            secondCopy[iIndx][jIndx - 1] = 2;
                        }
                    }
                }
            }
        }*/
    }

    public int[][] updateGrid(int[][] grid) {
        int [][] secondCopy = new int[grid.length][grid[0].length];
        isGridUpdated = false;
        for (int iIndx = 0; iIndx < grid.length; iIndx++) {
            for (int jIndx = 0; jIndx < grid[0].length; jIndx++) {
                if (grid[iIndx][jIndx] == 2) {
                    if (iIndx == 0 || iIndx == grid.length - 1) {
                        if(iIndx == 0  && ((iIndx + 1) < grid.length)) {
                            if (grid[iIndx + 1][jIndx] == 1) {
                                secondCopy[iIndx + 1][jIndx] = 2;
                                isGridUpdated = true;
                            }
                        }
                        if(iIndx == grid.length - 1 && ((iIndx - 1) > -1)) {
                            if (grid[iIndx - 1][jIndx] == 1) {
                                secondCopy[iIndx - 1][jIndx] = 2;
                                isGridUpdated = true;
                            }
                        }
                    } else {
                        if (grid[iIndx + 1][jIndx] == 1  && ((iIndx + 1) < grid.length)) {
                            secondCopy[iIndx + 1][jIndx] =2;
                            isGridUpdated = true;
                        }
                        if (grid[iIndx - 1][jIndx] == 1 && ((iIndx - 1) > -1)) {
                            secondCopy[iIndx - 1][jIndx] = 2;
                            isGridUpdated = true;
                        }
                    }
                    if (jIndx == 0 || jIndx == grid[0].length-1) {
                        if(jIndx == 0 && ((jIndx + 1) < grid[0].length)) {
                            if (grid[iIndx][jIndx + 1] == 1 ) {
                                secondCopy[iIndx][jIndx + 1] = 2;
                                isGridUpdated = true;
                            }
                        }
                        if (jIndx == grid[0].length-1 && ((jIndx - 1) > -1)) {
                            if (grid[iIndx][jIndx - 1] == 1) {
                                secondCopy[iIndx][jIndx - 1] = 2;
                                isGridUpdated = true;
                            }
                        }
                    } else {
                        if (grid[iIndx][jIndx + 1] == 1 && ((jIndx + 1) < grid[0].length)) {
                            secondCopy[iIndx][jIndx + 1] = 2;
                            isGridUpdated = true;
                        }
                        if (grid[iIndx][jIndx - 1] == 1 && ((jIndx - 1) > -1)) {
                            secondCopy[iIndx][jIndx - 1] = 2;
                            isGridUpdated = true;
                        }
                    }
                }
            }
        }
        return secondCopy;
    }
}
