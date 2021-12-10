package com.company;
import java.io.IOException;
public class ThrowException {
    public void ThrowException(){
        try{
            Integer j = NullException.generateException();
            j.toString();
        } catch (NullPointerException e){
            System.out.println("Wartość jest null");
            System.out.println("\n" + e );
            System.out.println("\nStos wywołań");
            e.printStackTrace();
        }
    }

}
