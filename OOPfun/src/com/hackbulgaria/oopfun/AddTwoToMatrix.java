package com.hackbulgaria.oopfun;

public class AddTwoToMatrix implements MatrixOperation{

    @Override
    public int withPixel(int x, int y, int[][] matrix) {
        return matrix[x][y] + 2;
    }

}
