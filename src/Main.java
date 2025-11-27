/*
 * Description:
 * 1. Given a positive integer n, list all the moves required in the Tower of Hanoi puzzle to move n disks from one peg
 to another according to the rules of the puzzle.
 * 2. Given a positive integer n, list all the bit sequences of length n that do not have a pair of consecutive Os.
 * 3. Given an integer n greater than 1, write out all ways to parenthesize the product of n + 1 variables.
 * (choosing option 1)
 * Author: joshua smith <joshuaadasmith2003@gmail.com>
 * version: 1.0
 */

import java.util.Scanner;
public class Main{

    public static void main(String[] args){
        /***input***/
        Scanner keyboard= new Scanner(System.in);
        System.out.println("please enter the number of disks in the program");
        int n=keyboard.nextInt();
        char start='A',end='C',temp='B';

        System.out.println("the moves you need to make are");
        solve_hanoi(n,start,end,temp);
        System.out.print("end of program");

    }

    public static void solve_hanoi(int n,char start, char end,char temp){
        //null case, let n=0
        if (n==0){
        }
        if (n==1){//base case: only 1 disk-> make the move directly
            System.out.println("move the disk from "+start+" to "+end);
        }
        else{
            //step 1: move n-1 disks from start to temp
            solve_hanoi(n-1, start, temp, end);
            //step 2: move last disk(the largest one aka disk n) to the end/target peg
            System.out.println("move disk " + n +" from "+start+ " to "+end);
            //step 3: move n-1 disks from the temp to the end
            solve_hanoi(n-1,temp,end,start);
        }
    }
}
