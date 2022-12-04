package lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;



public class lab3 {
    public static void main(String[] args) {
        //Array
        //task1
        System.out.println("-------------------------------------------------------");
        MaxNumberInArray(new double[]{5, 9, 3, 2, 0, -4, -8.3, 3, -4});
        System.out.println("------------------------------------------------------------");
        //task2
        UniqArr(new int[]{1, 6, 3, 3, 4, 5, 5, 6, 0});
        System.out.println("------------------------------------------------------------");
        //task3
        ReplaceValue(new String[]{"12", "23", "34", "12", "56", "67"});
        System.out.println("------------------------------------------------------------");
        //task4
        ReverseArray(new int[]{2,4,6,3,2,6,7});
        System.out.println("------------------------------------------------------------");
        //Collections
        //task1
        ListReplace(new String[]{"EF1","dassda","213","EF1","sssw","213","1112","kfd","EF1","21"});
        System.out.println("------------------------------------------------------------");
        //task2
        ReverseMatrix(new int[][]{{5,7,2},{3,2,1},{8,9,0}});
        System.out.println("------------------------------------------------------------");
        UniqMatrix(new int[][]{{5,2,2},{3,2,7},{9,9,0}});
        System.out.println("------------------------------------------------------------");

    }

    public static void UniqMatrix(int[][]matrix){
        System.out.println("Original matrix:");
        for(int[] el: matrix){
            for (int j=0;j< matrix[1].length; j++){
                System.out.print(el[j]+"\t");
            }
            System.out.println();
        }

        HashMap<Integer,Integer> uniqArr = new HashMap<>();

        System.out.println("Matrix with deleted dublicates: ");
        for (int[] el : matrix) {
            for (int j = 0; j < matrix[1].length; j++) {
                uniqArr.put(el[j],j);
            }
        }
        System.out.println(uniqArr.keySet());
    }

    public static void ReverseMatrix(int[][]matrix){
        System.out.println("Original matrix:");
        for (int[] ints : matrix) {
            for (int j = 0; j < matrix[1].length; j++) {
                System.out.print(ints[j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Reversed matrix:");
        for (int i=matrix.length-1;i>=0;i--){
            for(int j=matrix[1].length-1;j>=0;j--){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void ListReplace(String[]arr){
        ArrayList<String> listOfStrings = new ArrayList<>(Arrays.asList(arr));
        int half=listOfStrings.size()/2;
        for(int i=0;i<half;i++){
            if(listOfStrings.get(i).equals("EF1")){
                listOfStrings.set(i,"EF2");
            }
        }
        System.out.println(listOfStrings);
    }

    public static void ReverseArray(int[]arr){
        int index=0;
        int[] reversedArray=new int[arr.length];
        for(int i=arr.length-1; i>=0;i--){
            reversedArray[index]=arr[i];
            index++;
        }
        System.out.println(Arrays.toString(reversedArray));
    }
    public static void ReplaceValue(String[] arr){
        for(int i=0;i< arr.length;i++){
            if(arr[i].equals("12")){
                arr[i]="replaced";
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void UniqArr(int[]arr){

        int[] uniqArr=new int[arr.length];
        int index=0;

        Arrays.sort(arr);

        for (int i=0;i<arr.length;i++){
            int flag=0;
            for(int j=0; j<i; j++){
                if(arr[i]==arr[j]){
                    flag=1;
                    break;
                }
            }
            if(flag==0){
                uniqArr[index]=arr[i];
                index++;
            }
        }

        for(int i=0;i<index;i++){
            System.out.print(uniqArr[i]+" ");
        }
        System.out.println();

    }
    public static void MaxNumberInArray(double[] arr){
        double max = arr[0];
        for(int i=0; i<arr.length; i++){
            if(i+1<arr.length){
                if(arr[i]<arr[i+1]){
                    max=arr[i+1];
                }
                else{
                    max=arr[1];
                }
            }
        }
        System.out.println(max);
    }
}
