package lab2;

import java.util.HashMap;

public class lab2 {
    public static void main(String[] args) {
        //task1
        System.out.println("-------------------------------------------------------");
        Add(5,4);
        Substract(10,2);
        Multiply(3,6);
        Divide(4,2);
        System.out.println("-------------------------------------------------------");
        //task2
        TotalWords("sdada dsadax dasd tresa");
        System.out.println("-------------------------------------------------------");
        //task3
        CharsInWords("sdada dsadax sd tresa");
        System.out.println("-------------------------------------------------------");
        //task4
        CharsInWordsByIndex("sdada dsadax dasd tresa adsadzxc aw", 4);
        System.out.println("-------------------------------------------------------");
    }

    public static void CharsInWordsByIndex(String str, int index){
        String[] words = str.split(" ");
        if(index < words.length && index>=0){
            String word = words[index];
            System.out.println("Word "+ word+" has "+word.length() + " chars");
        }
        else{
            System.out.println("Choose corect index");
        }
    }

    public static void TotalWords(String str){
        int count=0;
        String[] words = str.split(" ");
        for(String word : words){
            count++;
        }
        System.out.println("There is " + count + " Words");
    }
    public static void CharsInWords(String str){
        String[] words = str.split(" ");
        HashMap<String, Integer> result = new HashMap<>();
        for (String word : words){
            result.put(word,word.length());
        }
        System.out.println(result);
    }

    public static void Add(int a, int b){
        int result = a+b;
        System.out.println(result);
    }
    public static void Substract(int a, int b){
        int result = a-b;
        System.out.println(result);
    }
    public static void Multiply(int a, int b){
        int result = a*b;
        System.out.println(result);
    }
    public static void Divide(double a, double b){
        if(b != 0){
            double result = a/b;
            System.out.println(result);
        }
        else{
            System.out.println("Can't divide by zero");
        }
    }

}
