package package1;


import java.util.ArrayList;

public class Calculator {
    public double perimeter = 3.1415;

    public static int sum(int a, int b) {
        System.out.println("METHOD 1 INT");
        return a + b;
    }
    public static void sum(int a, int b, int c){
        System.out.println("METHOD 2 VOID");
    }

    public static int sub(int a, int b) {
        return a - b;
    }
    public static int mult(int a, int b) {
        return a * b;
    }
    public static double div(double a, double b) {
        if (b != 0) {
            return a / b;
        }
        return 0;
    }

    public void updateP (double a) {
        this.perimeter = a;
    }


    public static int pow(int a, int b) {
        int init = 1;
        if (b == 0) return 1;
        for (int i = 0; i < b; i++){
           init = init * a;
        }

        return init;
    }

    public static int fac(int a){
        int result = a;
        for (int i = a - 1; i >= 1; i--) {
//            System.out.println("a="+a+" i="+i+" res="+result);
            result = result * i;
        }
        System.out.println("Factorial "+a+":");
        return result;
    }


    public static int sum(int array[]) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    int[] arr = {1, 5, 7, 89, 22, 43};

// 1 цикл - цель: посчитать
// 2 создать массив из цикла 1
// 3 цикл переноса

    public static int[] cutArray(int array[], boolean even){
        int counterEven = 0;
        int counterOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                counterEven++;
            } else {
                counterOdd++;
            }
        }

        int[] evenArray = new int[counterEven];
        int[] oddArray = new int[counterOdd];

        int j = 0;
        int x = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                evenArray[j] = array[i];
                j++;
            } else {
                oddArray[x] = array[i];
                x++;
            }
        }

        if (even) return evenArray;
        else return oddArray;
    }

    public static String compare(int arr1[], int arr2[]) {
        if (arr1.length > arr2.length) return "Array1 is bigger";
        else if (arr1.length == arr2.length) return "EQUAL";
        else return "Array2 is bigger";
    }

}
