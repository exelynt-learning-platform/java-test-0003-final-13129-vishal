// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// This test evaluates the candidate’s understanding of conditional logic and alternating value patterns in Java.

// The candidate must implement a Java program that prints the required binary triangle pattern using nested loops and logical conditions. The output must strictly follow the pattern structure provided.

// Program

// Write a Java program to print the following pattern:

// 1
// 0 1
// 1 0 1
// 0 1 0 1
// 1 0 1 0 1
// 0 1 0 1 0 1


class Main {
    public static void main(String[] args) {

    int rows = 6;                   //  row count
    for(int i=1;i<=rows;i++){       //  loop for column element
        for(int j=1;j<=i;j++){      //  loop for row element
            if((i+j)%2==0){         //  logic for print "1"
                System.out.print("1");
            }
            else{                   //  logic for print "1"
                System.out.print("0");
            }
        }
        System.out.println();       //  new line
    }

    }
}