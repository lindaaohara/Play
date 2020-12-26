package com.play.area;

import static java.lang.StrictMath.abs;

public class FoodDistribution {
//We have one array and the value in the 0 index is the number of sandwiches
//I want to look at each index and the index after it to minimize the difference between each pair

    public static int FoodDistribution(int[] arr) {
        Integer sandwiches = arr[0];
        Integer maxDiff = 0;
        Integer currentDiff=0;
        Integer whoToFeed = null;
        Integer result = 0;


        for (int i = 2; i < arr.length; i++) {
            int comparison1 = arr[i-1];
            int comparison2 = arr[i];
            currentDiff = abs(comparison1-comparison2);
            if(currentDiff > maxDiff) {
                maxDiff = currentDiff;
            }
        }



   /*             int hungryPerson1 = arr[x];
                int hungryPerson2 = arr[x+1];
                if(hungryPerson1 > hungryPerson2){
                    currentDiff = hungryPerson1 - hungryPerson2;
                } else{
                    currentDiff =hungryPerson2- hungryPerson1;
                }
                if(currentDiff >

            }
            System.out.println("No of Sandwiches:  " + numberOfSandwiches);
            System.out.println (" Hungry01:" + hungryPerson1 + "Hungry 02:"
                    + hungryPerson2 + "Difference: " + currentDiff);
        }
        return arr[0];

    */
        return result;
    }


}


