package com.play.area;

import java.util.*;

public class SimplerAreaSolution {
    public static String RectangleArea(String[]strArr){

       Integer xDiff=0;
       Integer yDiff=0;
       Integer xDiffCounter=0;
       Integer yDiffCounter =0;
       List<Integer> xList = new ArrayList<Integer>();
       List<Integer> yList = new ArrayList<Integer>();

        for(int i=0; i<strArr.length; i++){
            String pointsNoParen = strArr[i].replaceAll("[()]","");
            String[] splitPointsNoParen = pointsNoParen.split(" ");
            int x = Integer.parseInt(splitPointsNoParen[0]);
            int y = Integer.parseInt(splitPointsNoParen[1]);
            xList.add(x);
            yList.add(y);
 }
        Integer xMax = xList.stream().max(Integer::compare).get();
        Integer xMin = xList.stream().min(Integer::compare).get();
        xDiff = Math.abs(xMax-xMin);
        Integer yMax = yList.stream().max(Integer::compare).get();
        Integer yMin = yList.stream().min(Integer::compare).get();
        yDiff = Math.abs(yMax-yMin);

        System.out.println(Arrays.toString(strArr));;
        System.out.println("xDiff= "+xDiff);
        System.out.println("yDiff= "+yDiff);
        return String.valueOf(xDiff * yDiff);
    }
}