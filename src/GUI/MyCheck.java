/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.Scanner;



/**
 *
 * @author User
 */
public class MyCheck {

    private static Scanner sc = new Scanner(System.in);

    public static int getAnInteger(String inputMsg) {
        int a;
        while (true) {
            try {
                System.out.print(inputMsg);
                a = Integer.parseInt(sc.nextLine());
                return a;
            } catch (Exception e) {
                System.out.println("Please enter again!!!");
            }
        }
    }

    public static double getAnDouble(String inputMsg) {
        double d;
        while (true) {
            try {
                System.out.print(inputMsg);
                d = Double.parseDouble(sc.nextLine());
                return d;
            } catch (Exception e) {
                System.out.println("Please enter again!!!");
            }
        }
    }
    

    public static String getStringName(String inputMsg) {
        String s;
        while (true) {
            System.out.print(inputMsg);
            s = sc.nextLine().trim();
            if (s.isEmpty() || s.length() == 0) {
                System.out.println("Please enter again!!!");
            } else {
                return s;
            }
        }
    }
    
    
    
    
  
}
