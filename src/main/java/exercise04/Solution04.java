/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Maggie Perry
 */
/*
Mad Lib

Establish scanner input
prompt user for noun - sout.print "Enter a noun: "
save input as noun variable - noun = next in
repeat for verb
repeat for adjective
repeat for adverb
output with printf
"Today I'll <verb> <adverb> to the zoo. Last time,I saw a(n) <adjective> <noun> jumping up and down in its tree."
 */


package exercise04;

import java.util.Scanner;

public class Solution04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a noun: ");

        String noun = sc.nextLine();

        System.out.print("Enter a verb: ");

        String verb = sc.nextLine();

        System.out.print("Enter a adjective: ");

        String adjective = sc.nextLine();

        System.out.print("Enter a adverb: ");

        String adverb = sc.nextLine();

/* "Today I'll <verb> <adverb> to the zoo. Last time,I saw a(n) <adjective> <noun> jumping up and down in its tree." */

        System.out.printf("\"Today I'll %s %s to the zoo. Last time,I saw a(n) %s %s jumping up and down in its tree.\"",
                verb , adverb , adjective, noun );

    }
}
