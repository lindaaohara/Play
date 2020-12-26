package com.play.area;
import java.util.*;

public class FixTariqSolution {

        public static String RectangleArea(String[]strArr){
            int minX =0;
            int maxX =0;
            int minY =0;
            int maxY =0;

            for(int i=0; i<strArr.length; i++){
                String tempPointValue = strArr[i].replaceAll("[()]","");
                String[] tempPoints = tempPointValue.split(" ");
                int x = Integer.parseInt(tempPoints[0]);
                int y = Integer.parseInt(tempPoints[1]);


               if(x<minX || minX==0){
                 minX = x;

                } else if (x > maxX || maxX==0) {
                  maxX=x;


                }
                if(y<minY || minY ==0){
                    minY = y;
                } else if (y > maxY || maxY==0){
                    maxY=y;

                }
            }
            System.out.println(Arrays.toString(strArr));
            System.out.println("maxX = " + maxX + "; minX = "+ minX);
            System.out.println("maxY = " + maxY + "; minY = "+ minY);
            return String.valueOf((maxX - minX) * (maxY - minY));
        }
    }


