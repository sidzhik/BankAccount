package com.company;
import javax.swing.text.AttributeSet;
import java.util.Scanner;
    public class Main{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print(" Enter the number of Exercise: ");
            int exercise = in.nextInt();
            System.out.println("\n\tYou choose exercise #" + exercise);
            ThrowException npe = new ThrowException();
            Finally arrayArithmetic = new Finally();
            Account myAccount = new Account("Serhii Berezovskyi",  555000, "45 1090 1694 0000 0001 4905 9737");
            switch (exercise){
                case 1: npe.ThrowException();

                case 2: arrayArithmetic.startGettingException();
                case 3:

                    try {myAccount.withdrawal(12);}
                    catch(NotEnoughMoneyException e){
                        System.out.println(e);
                        e.printStackTrace();
                    } finally {
                        System.out.println("\nTransakscja zostałą wysłana\nSaldo wynosi: " + myAccount.getBalance() + " zł");
                    }
            }
        }
    }




