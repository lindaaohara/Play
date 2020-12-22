package com.play.area;

public class InsertDashes {

        public static String insertedDashes(String str){
            char[] numbers = str.toCharArray();
            String result = "";

            for (int i = 1; i < numbers.length; i++) {
                int value1 = Character.getNumericValue(numbers[i - 1]);
                int value2 = Character.getNumericValue(numbers[i]);
                result += value1;
                if (value1 % 2 != 0 && value2 % 2 != 0) {
                    result += "-";
                }
            }
            result += numbers[numbers.length - 1];
            return result;
        }
    }
