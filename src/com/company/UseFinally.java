package com.company;

public class UseFinally {

    public static void generateException(int what) {
        int t;
        int []arr = new int[2];
        System.out.println("Otrzymuje " + what);

        try{
            switch(what){
                case 0: t = 25/what;
                case 1: t = arr[4];
                case 2: return;
            }
        } catch (ArithmeticException e) {System.out.println("Nie dziel przez zero");
        } catch (ArrayIndexOutOfBoundsException e) {System.out.println("Nie ma takiego elementu w tablicy");
        } finally{System.out.println("Wyświetli zawsze");}

    }


}
