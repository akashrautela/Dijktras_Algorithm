package com.dijktras.controller;
import com.dijktras.utility.*;
import java.util.*;
public class Main {
    public static void main(String[] args){
        int n=5;
        int inf=999;
        Scanner sc=new Scanner(System.in);
        int[][] graph=new int[n][n];
        int i,j;
        System.out.println("Enter weights : ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                graph[i][j]=sc.nextInt();
                if(graph[i][j]<=0){
                    graph[i][j]=inf;
                }
            }
        }
        for(i=0;i<n;i++){
            Algorithm.dij(graph,n,i);
        }
        System.out.println("Minimum distance from each node to every other node is : ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(graph[i][j]+"  ");
            }
            System.out.println();
        }
    }
}

/*
INPUT :
 0 3 0 1 0
 3 0 2 0 0
 0 2 0 2 4
 1 2 0 0 3
 0 0 4 3 0
 */