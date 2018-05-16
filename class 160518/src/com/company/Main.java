package com.company;

public class Main {

    public static void main(String[] args) {


        int[] a={1,2,7,1,4,6,7,9,8};
        sort(a,a.length-1);
        show(a);

    }
    //------bubble sort array-----------מיון בועות----------------
    static void sort(int[] a,int godel){

        int temp;
        boolean change=false;

        for (int i = 0; i <godel; i++) {

            if(a[i]>=a[i+1]){
                temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
                change=true;
            }

        }
        if (!change) return;

        --godel;
        if (godel>1) sort(a,godel);
    }
    //-----------מדפיס את המערך----------------------
    static void show(int[] a){

        String str="{";

        for (int i = 0; i <a.length; i++) {


            if(i==a.length-1) str+=a[i];
            else str+=a[i]+",";

        }

        str+="}";
        System.out.println(str);

    }
    //-------------------------------------------

}
