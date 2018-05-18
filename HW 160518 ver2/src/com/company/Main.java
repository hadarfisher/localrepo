package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr2 = {1,2,3,4,5,6,7,8};                 //zogy
        int[] arr3 = {1,2,3,4,5,6,7,8,9,10,11,12,13};   //e-zogy
        int[] arr4 = {1,2,3,4,5,6,7,8,9,10,4,12,5};

        int index;
        int x;



        print(arr3);  //print array
        x=9;
        //System.out.println("index of number "+x+" in array:"+containsSort2(arr3,x));
        //System.out.println("----------------------------------------");

        System.out.println("index of number "+x+" in array:"+containSort4(arr3,x));
        System.out.println("----------------------------------------");



        print(inRange(arr4,7,3));
    }



    //-------------O(n+logn)----------------------------------------------------------------
//    static int containsSort2(int[] arr,int num){
//
//                switch (arr.length) {
//
//                    case 2:
//                        if (num==arr[1]) return 1;
//                        else if (num==arr[0]) return 0;
//                        else return -1;
//
//
//                    case 1:
//                if (num==arr[0]) return 0;
//                else return -1;
//        }
//
//
//        int m = arr.length/2;
//
//        int location=0;
//        int[] L = new int[m];
//        int[] R = new int[arr.length-m];
//
//        for (int i = 0; i <= L.length-1; i++) {
//            L[i] = arr[i];
//
//        }
//        for (int j = 0; j <= R.length-1; j++) {
//            R[j] = arr[j+m];
//        }
//        //System.out.println("m"+m);
//
//        if(L[m-1]<num) {
//            location+=L.length+ containsSort2(R,num); // number in the right side
//
//        } else {
//
//            location+=containsSort2(L,num); //number in left side
//        }
//
//        return location;
//    }
    //----------------------------------------------------------------------

    static int containSort4(int[] arr,int num) {

        int index = containsSort3(arr,num,0,arr.length-1);

        return index;

    }
    //--------------o(logn)-------------------------------------------------
    static int containsSort3(int[] arr,int num,int first,int last){

        switch (last-first+1) {

            case 2:                             // two cell array
                if (num==arr[last]) return last;
                else if (num==arr[first]) return first;
                else return -1;


            case 1:                             //one cell array
                if (num==arr[first]) return first;
                else return -1;
        }


        int m = first+(last-first)/2+1; //m = arr.length/2
        int location=0;


        if(arr[m-1]<num) {

            first=m;
            location= containsSort3(arr,num,first,last); // number in the right side

        } else {
            last=m-1;
            location=containsSort3(arr,num,first,last); //number in left side
        }

        return location;
    }



    //--------------------print array---------------------------------
    static void print(int[] arr){
        System.out.print("{");

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ",");
        }
        if(arr.length > 0)
            System.out.print(arr[arr.length-1]);

        System.out.println("}");
    }
    //------------------create new array of items in range-------------
    static int[] inRange(int[] arr,int max,int min){

        int count=0;
        for (int i = 0; i <arr.length ; i++) {

                if(arr[i]>=min && arr[i]<=max) count++;

        }
        int[] newArr = new int[count];

        count=0;
        for (int i = 0; i <arr.length ; i++) {

            if(arr[i]>=min && arr[i]<=max) {
                                            newArr[count]=arr[i];
                                            count++;
            }

        }

    return newArr;
    }
    //-------------------------------------------------------
}
