package com.play.area;

public class TariqFoodSolution {
    public static int foodDistribution(int arr[]){
        //Number of Sandwiches
        int numOfSandwiches = arr[0];

        //New array just containing hungry people
        int[]hungryPeople = new int[arr.length-1];

        //This loop moves all the hungry people over
        for(int x=0; x < arr.length-1; x++)
            hungryPeople[x] = arr[x+1];

        //This is the variable we are going to use to track the biggest difference
        int difference;

        do{
            difference = -1;
            //first index to track
            int a = 0;
            //second index to track
            int b = 0;
            //find the biggest difference and the index where they exist
            for(int i=0; i < hungryPeople.length-1; i++){
                int tempA = hungryPeople[i];
                int tempB = hungryPeople[i+1];
                int tempDiff = Math.abs(tempA-tempB);
                if(tempDiff > difference){
                    difference = tempDiff;
                    a = i;
                    b= i+1;
                }
            }
            //this is the value to change at the biggest index
            int numberToChange = 0;
            if(numOfSandwiches > difference) {
                numOfSandwiches -= difference;
                numberToChange = difference;
            } else {
                numberToChange =numOfSandwiches;
                numOfSandwiches = 0;
            }

            if(hungryPeople[a] > hungryPeople[b]){
                    hungryPeople[a] -= numberToChange;
            } else {
                    hungryPeople[b] -= numberToChange;
            }
        } while ((difference >0) && (numOfSandwiches >0));

        int finalDiff = 0;
        for(int x = 0; x <hungryPeople.length -1; x++){
            finalDiff += Math.abs(hungryPeople[x] - hungryPeople[x+1]);
        }
       return finalDiff;
    }
    public static void main(String[]args){
        System.out.println("Value should be 1 : actual value "+ TariqFoodSolution.foodDistribution(new int[]{5,2,3,4,5}));
        System.out.println("Value should be 4 : actual value "+ TariqFoodSolution.foodDistribution(new int[]{3,2,1,0,4,1,0}));
    }
}
