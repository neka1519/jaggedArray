package com.neka;

public class Main {

    public static void main(String[] args) {
//1d array;
        int arr1D[] = new int[5];
        int _2arr1D [] = {4,14,24,34,44};
        System.out.println(arr1D[3]); //by default values are zero

        arr1D[0] = 5;
        arr1D[1] = 15;
        arr1D[2] = 25;
        arr1D[3] = 35;
        arr1D[4] = 45;
        System.out.println(arr1D[3]); //35

        arr1D[3] = 65;
        System.out.println(arr1D[3]); //65

        //to print all the values
        for (int i = 0; i <  arr1D.length; i++) {
            System.out.println(arr1D[i]);
        }
        //2D Array:
        int a[] = {1,2,3,4,5};
        int b[] = {21,22,32,42,52};
        int c[] = {11,12,13,14,15};

        int d[][] = {
                {1,2,3,4,5},   //i - entire row
                {21,22,32,42},
                {11,12,13,14},

                  };

        System.out.println(d[0][2]);

        //to print entire array
        for(int i = 0;i<d.length;i++){
            for(int j=0; j<4; j++){
                System.out.print(d[i][j] + " ");
            }
            System.out.println(" ");
            /*
            1 2 3 4
            21 22 32 42
            11 12 13 14
             */
        }

        //Jagged array
        //when i != j

        int jagArray[][] = {
                {1,2,3,4,5},   //i - entire row
                {21,2,52},
                {11,12,13,14,15}

        };

        for(int i = 0; i<jagArray.length; i++){
            for(int j=0; j<jagArray[i].length; j++){
                System.out.print(jagArray[i][j]+ " ");
            }
            System.out.println();
            /*
            1 2 3 4
            21 22 32 42
            11 12 13 14
             */
        }
    }
}
