package org.example;

public class Main {
    public static void main(String[] args) {
        String my_array [] = {"FirstWord", "SecondWord", "THIRDWORD"};
        System.out.println(formateadorArray(my_array));
    }

    private static String formateadorArray(String[] myArray) {
        String result = "";
        // Este Ejercicio al iterar solo una vez un array tiene una complejidad Lineal
        //
        for(int i = 0; i < myArray.length ; i++){
            result += lowerCase(myArray[i]);

            if(i < myArray.length){
                result+= " ";
            }
        }
        return result;
    }

    private static String lowerCase(String string){
        return string.toLowerCase();
    }

}