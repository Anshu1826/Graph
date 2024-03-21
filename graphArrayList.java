package com.anshika.graph;
import java.util.*;
import java.io.*;
public class graphArrayList {
    public static class Edge {
        int src;
        int nbr;
        int w;
        public Edge (int src, int nbr, int w) {
            this.src = src;
            this.nbr = nbr;
            this.w = w;
        }
    }
    public static void main(String[] args) {
        int n =7;
        ArrayList<Edge>[] graph = new ArrayList[n];
        for(int i=0 ; i<n; ++i){
            graph[i] = new ArrayList<Edge>();
        }
        graph[0].add(new Edge(0,3,40));
        graph[0].add(new Edge(0,1,10));
        graph[1].add(new Edge(1,0,10));
        graph[1].add(new Edge(1,2,10));
        graph[2].add(new Edge(2,3,10));
        graph[2].add(new Edge(2,1,10));
        graph[3].add(new Edge(3,0,40));
        graph[3].add(new Edge(3,2,10));
        graph[3].add(new Edge(3,4,2));
        graph[4].add(new Edge(4,3,2));
        graph[4].add(new Edge(4,5,3));
        graph[4].add(new Edge(4,6,8));
        graph[5].add(new Edge(5,4,3));
        graph[5].add(new Edge(5,6,3));
        graph[6].add(new Edge(6,4,8));
        graph[6].add(new Edge(6,5,3));

        for(ArrayList<Edge> list:graph) {
            for(Edge e:list){
                System.out.println(e.src + " " + e.nbr + " " + e.w);
            }
        }
    }
}
