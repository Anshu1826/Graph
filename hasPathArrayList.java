package com.anshika.graph;

import java.util.ArrayList;
import java.util.Scanner;
public class hasPathArrayList {
    public static class Edge {
        int src;
        int nbr;
        int wt;
        public Edge(int src, int nbr, int wt){
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of vertices: ");
        int n = in.nextInt();
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i=0 ; i<n ; ++i){
            graph[i] = new ArrayList<Edge>();
        }
        System.out.println("Enter the number of edges: ");
        int edges = in.nextInt();
        for(int i=0; i<edges ; ++i){
            int v1 = in.nextInt();
            int v2 = in.nextInt();
            int w = in.nextInt();
            graph[v1].add(new Edge(v1,v2,w));
            graph[v2].add(new Edge(v2,v1,w));
        }
        for(ArrayList<Edge> list:graph) {
            for(Edge edge: list) {
                System.out.println(edge.src+" -> "+edge.nbr+" : "+edge.wt);
            }
        }
        boolean[] visited = new boolean[n];
        System.out.println("Enter the source and the destination of the paths: ");
        int src = in.nextInt();
        int dest = in.nextInt();
        System.out.println(hasPath(graph, visited, src, dest));
    }
    public static boolean hasPath(ArrayList<Edge>[] graph, boolean[] visited, int src, int dest) {
        if(src == dest)
            return true;
        visited[src] = true;
        for(Edge edge: graph[src]){
            if(!visited[edge.nbr] && hasPath(graph, visited, edge.nbr, dest))
                return true;
        }
        return false;
    }
}
/*
18 : n
e : 22
0 1 100
0 2 100
2 3 200
1 3 500
1 14 200
15 14 20
15 16 12
14 17 18
17 16 16
1 4 5
4 8 56
8 9 58
9 10 25
8 10 15
4 5 20
4 6 58
5 7 45
6 7 58
6 11 25
11 12 45
11 13 58
12 13 25
 */
