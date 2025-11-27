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

    /**
     * Discription: runs the program to perform the calculations to solve the tower of hanoi puzzle;
     * preconditions none
     * Postcondition prints out the solution, no arguement/value returned
     */
    public static void main(String[] args){
        /***input***/
        Scanner keyboard= new Scanner(System.in);
        System.out.println("please enter the number of disks in the program:");
        int n=keyboard.nextInt();
        char start='A',end='C',temp='B';

        System.out.println("the moves you need to make are:");
        solve_hanoi(n,start,end,temp);
        System.out.print("end of program ;)");

    }

    /**
     * Description: solves the tower of hanoi recursivly and keeps performing the nessesary calculations needed,
      it uses the number of disks and 3 pegs. It moves the disks one disk at a time adjusting the start and end points,
      using them like references at each stage. so at one stage the start is A and the end is C but another (aka n-1 will start at the temp and move it to the next "destination") till all disks are at the desired end.
     * precondition: needs to be called from the main method
     * postcondition: sprints out all the moves
     * param n the number of disks in the tower
     * param start the peg from which we are moveing the surrent disk
     * param end the destination peg we are tring to get the disk to
     * param temp the helper peg
     */
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
