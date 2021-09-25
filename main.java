package project3;

// to do 1- no entry less than 0 or more than 1 .
// 2- if the student fail in one subject he can clean it in the next semester .
// 3-make a table to show the details of the students degree .
// 4-find and solve the problem in the degrees .
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        methods meth = new methods();
        Scanner input = new Scanner(System.in);
        int count = 0;
        int failure=0;
        int semnum=0;
        for(; semnum < 8;semnum++) {                        //semester loop
            for(int j = 0; j < meth.sem[semnum]; j++){      // subjects loop
                System.out.println("Enter your degree at :"+meth.myarray[count]);
                meth.degrees[count] = input.nextDouble();
                if(meth.degrees[count]<50){ // if the student fail in one subject
                    failure++;
                    System.out.println("you fail in "+meth.myarray[count]+" Enter it again :");
                    meth.degrees[count] = input.nextDouble();

                }
                if(failure>=2){
                    semnum--;
                    break;
                }
                count++; //for the next subject
            }
        }
        System.out.println(semnum);
        System.out.println(count);
        // for visuals (:
        System.out.println("|semeter number  |semeter grade   |final grade  |");
        System.out.println("|-----------------------------------------------|");
        for (int r = 0; r < 8; r++) {
            System.out.println("|semeter" + (r + 1) + "        | " + meth.current[r] + "            | " + meth.sumf[r]
                    + "         | ");
        }
        System.out.println("|-----------------------------------------------|");
        input.close();
    }

}
