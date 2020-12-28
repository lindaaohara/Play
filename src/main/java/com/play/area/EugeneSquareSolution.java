package com.play.area;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class EugeneSquareSolution {
    public static String getAreaTwo(String[]coordinates){
        Integer xMax = Arrays.stream(coordinates).map(coord ->
                Integer.parseInt(coord.replaceAll("[()]","")
                .split(" ")[0]))
                .distinct().reduce(0,(a,b) ->
                        a == 0 ? b : Math.abs(a-b));
        Integer yMax = Arrays.stream(coordinates).map(coord ->
                Integer.parseInt(coord.replaceAll("[()]","")
                .split(" ")[1]))
                .distinct().reduce(0,(a,b)->
                    a == 0 ? b : Math.abs(a-b));
        return String.valueOf(Math.abs(xMax * yMax));
    }

 //another way--a bit easier to read
    public static String getArea(String[]coordinates){
        HashSet<Integer> xCoordinates = new HashSet<>();
        HashSet<Integer> yCoordinates = new HashSet<>();
        Arrays.stream(coordinates).map(coordinate -> coordinate
                .replaceAll("[()]",""))
                .forEach(normalizedCoordinate ->{
                    String[] normalizedCoordinates =normalizedCoordinate.split(" ");
                    String xCoord = normalizedCoordinates[0];
                    String yCoord = normalizedCoordinates[1];
                    xCoordinates.add(Integer.parseInt(xCoord));
                    yCoordinates.add(Integer.parseInt(yCoord));
                });
                int maxXCoordinate = Math.abs(new ArrayList<>(xCoordinates).get(0)
                    -new ArrayList<>(xCoordinates).get(1));
                int maxYCoordinate =  Math.abs(new ArrayList<>(yCoordinates).get(0)
                    -new ArrayList<>(yCoordinates).get(1));
        return String.valueOf(maxXCoordinate * maxYCoordinate);
    }
}
