package com.company;

public class Finally {
    public void startGettingException(){
        for (int i = 0; i < 3; i++) {
            UseFinally.generateException(i);
            System.out.println();
        }
    }
}
