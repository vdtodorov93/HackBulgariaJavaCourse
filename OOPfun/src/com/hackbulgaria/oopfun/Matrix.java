package com.hackbulgaria.oopfun;

import java.util.Arrays;

public class Matrix {
    private int[][] matrix;
    private int N;
    private int M;
    
    public Matrix(int N, int M, int[][]matrix){
        this.N = N;
        this.M = M;
        this.matrix = new int[N][M];
        for(int i = 0; i < N; i++){
            this.matrix[i] = Arrays.copyOf(matrix[i], M);
        }
        //System.arraycopy(matrix, 0, this.matrix, 0, N * M);
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void operate(MatrixOperation op){
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                matrix[i][j] = op.withPixel(i, j, this.matrix);
            }
        }
    }
    
    public int getPixel(int x, int y){
        return this.matrix[x][y];
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                sb.append(matrix[i][j]);
                sb.append(" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
    

}
