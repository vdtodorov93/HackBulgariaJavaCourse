package com.hackbulgaria.oopfun;

public class Aproximator implements MatrixOperation {

    @Override
    public int withPixel(int x, int y, int[][] matrix) {
        int avg = 0;
        int count = 0;
        for(int i = -1; i < 2; i++){
            for(int j = -1; j < 2; j++){
                int currX = x + i;
                int currY = y + j;
                if(i == 0 && j == 0) continue;
                if(currX < 0 || currX >= matrix.length || currY < 0 || currY >= matrix[0].length) continue;
                avg += matrix[currX][currY];
                count++;
            }
        }
        
        return avg/count;
    }

}
