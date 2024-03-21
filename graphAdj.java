package com.anshika.graph;

import java.util.Scanner;

public class graphAdj {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int e = in.nextInt();
        int[][] graph = new int[n][n];
        for(int i=0 ;  i<n; ++i){
            for(int j=0; j<n ;++j){
                graph[i][j] = Integer.MIN_VALUE;
            }
        }
        for(int i=0 ; i<e ; ++i){
            int v1 = in.nextInt();
            int v2 = in.nextInt();
            int wt = in.nextInt();
            graph[v1][v2] = wt;
            graph[v2][v1] = wt;
        }
        display(graph);
    }
    public static void display(int[][] graph){
        for(int i=0 ; i<graph.length ; ++i){
            for(int j = 0; j < graph[0].length ; ++j){
                if(graph[i][j]!=Integer.MIN_VALUE)
                    System.out.print(i + " -> " + j + " : " + graph[i][j]+"   ");
            }
            System.out.println();
        }
    }
}
