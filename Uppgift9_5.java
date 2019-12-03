/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap9;

/**
 *
 * @author AleBriT18
 */
public class Uppgift9_5 {
    
    public static boolean siffra(String tecken) {
        int length = tecken.length();
        
        if (length < 2 ) {
            return true;
        } else {
            return false;
        }
    }
    
    public static void main(String[] args) {
        System.out.println(siffra("5"));
    }
}
