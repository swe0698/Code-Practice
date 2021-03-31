package com.example.java;
/*The Caesar cipher is a type of substitution cipher in which each alphabet in the plaintext or messages is shifted by a number of places down the alphabet.
For example,with a shift of 1, P would be replaced by Q, Q would become R, and so on.
To pass an encrypted message from one person to another, it is first necessary that both parties have the ‘Key’ for the cipher, so that the sender may encrypt and the receiver may decrypt it.
Key is the number of OFFSET to shift the cipher alphabet. Key can have basic shifts from 1 to 25 positions as there are 26 total alphabets.
As we are designing custom Caesar Cipher, in addition to alphabets, we are considering numeric digits from 0 to 9. Digits can also be shifted by key places.
For Example, if a given plain text contains any digit with values 5 and keyy =2, then 5 will be replaced by 7, “-”
(minus sign) will remain as it is. Key value less than 0 should result into “INVALID INPUT”*/

import java.util.Scanner;
public class Caesarcipher {
    public static void customCaesarCipher(int k, String m) {
        String update = "";
        int change = 0;
        char b;
        for (int i = 0; i < m.length(); i++) {
            int d = m.charAt(i);

            if(Character.isDigit(d)){
                if (d + k <= 57){
                    b = (char) (d + k);
                    update = update + b;
                }
                else {
                    change = ((d + k) - 48) % 10 +48;
                    b = (char) (change);
                    update = update + b;
                }
            }
            else if(Character.isUpperCase(d)){
               if(d + k<=90){
                   b = (char)(d+k);
                   update = update+b;
               }
               else{
                   change = (d+k-65)%26 + 65;
                   b = (char) (change);
                   update = update+b;
               }
            }
            else if(Character.isLowerCase(d)){
                if(d + k<=122){
                    b = (char)(d+k);
                    update = update+b;
                }
                else{
                    change = (d+k-97)%26 + 97;
                    b = (char) (change);
                    update = update+b;
                }
            }
            else if(Character.isWhitespace(d))
                update = update + " ";
            else if(d=='-')
                update = update + "-";

             }
        System.out.println(update);
    }
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       String str = s.nextLine();
       int key = s.nextInt();
       customCaesarCipher(key,str);

       }
   }

