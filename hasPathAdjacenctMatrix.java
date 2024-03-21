package com.anshika.graph;

import java.util.Scanner;

public class hasPathAdjacenctMatrix {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of vertices:");
        int n = in.nextInt();
        int[][] graph = new int[n][n];
        for(int i=0; i<n ; ++i){
            for(int j=0 ; j<n ; ++j){
                graph[i][j] = Integer.MIN_VALUE;
            }
        }
        System.out.println("Enter the number of edges: ");
        int edges = in.nextInt();
        for(int i=0; i<edges ; ++i){
            int v1 = in.nextInt();
            int v2 = in.nextInt();
            int w = in.nextInt();
            graph[v1][v2] = w;
            graph[v2][v1] = w;
        }
        for(int i=0 ; i<n ;++i){
            for(int j=0; j<n ;++j){
                if(graph[i][j] != Integer.MIN_VALUE)
                    System.out.println(i+" -> "+j+" : "+graph[i][j]);
            }
        }
        boolean[] visited = new boolean[n];
        System.out.println("Enter the source and destination of the path: ");
        int src = in.nextInt();
        int dest = in.nextInt();
        System.out.println(hasPath(graph, visited, src, dest));
    }
    public static boolean hasPath(int[][] graph, boolean[] visited, int src, int dest){
        if(src == dest)
            return true;
        visited[src] = true;
        for(int j=0; j<graph.length ; ++j) {
            if(graph[src][j]!=Integer.MIN_VALUE && !visited[j] && hasPath(graph, visited, j, dest))
                return true;
        }
        return false;
    }
}
