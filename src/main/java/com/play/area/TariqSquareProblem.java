package com.play.area;
import java.util.*;
import java.io.*;

public class TariqSquareProblem {
    //class Main{

        public static String RectangleArea(String[]strArr){
           // Map<Integer, Integer> points = new HashMap<>();
            int minX = -1;
            int maxX = -1;
            int minY = -1;
            int maxY = -1;
            for(int i=0; i<strArr.length; i++){
                String tempPointValue = strArr[i].replaceAll("[()]","");
                String[] tempPoints = tempPointValue.split(" ");
                int x = Integer.parseInt(tempPoints[0]);
                int y = Integer.parseInt(tempPoints[1]);

                if(minX == -1 || x< minX){
                    minX = x;
                }
                else if(x>maxX){
                    maxX = x;
                }
                if(minY == -1 || y< minY){
                    minY = y;
                }
                else if(y> maxY){
                    maxY=y;
                }
            }
            System.out.println(Arrays.toString(strArr));
            System.out.println("maxX = " + maxX + "; minX = "+ minX);
            System.out.println("maxY = " + maxY + "; minY = "+ minY);
            return String.valueOf((maxX - minX) * (maxY - minY));
        }
    }

