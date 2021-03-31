/**
 * The program will recieve 3 English words inputs from STDIN
 *
 * These three words will be read one at a time, in three separate line
 * The first word should be changed like all vowels should be replaced by %
 * The second word should be changed like all consonants should be replaced by #
 * The third word should be changed like all char should be converted to upper case
 * Then concatenate the three words and print them
 * Other than these concatenated word, no other characters/string should or message should be written to STDOUT
 *
 * For example if you print how are you then output should be h%wa#eYOU.
 *
 * You can assume that input of each word will not exceed more than 5 chars
 */

package com.example.java;

import java.util.Scanner;

public class StringTwist {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String one = sc.next();
        String two = sc.next();
        String three = sc.next();
        StringBuilder update = new StringBuilder();
        for(int i = 0; i<one.length();i++){
            char a = one.charAt(i);
            if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
               update.append("%");
            else
                update.append(a);
        }

        for(int i=0;i<two.length();i++){
            char a = two.charAt(i);
            if (!(a=='A'||a=='E'||a=='I'||a=='O'||a=='U'||a=='a'||a=='e'||a=='i'||a=='o'||a=='u'))
                update.append("#");
            else
                update.append(a);
        }

        for(int i=0;i<three.length();i++){
            char a = three.charAt(i);
            update.append(Character.toUpperCase(a));
        }
        System.out.println(update.toString());
    }
}
