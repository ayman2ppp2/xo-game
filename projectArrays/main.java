package projectArrays;

import java.util.Scanner;

public class main {
    public static void main(String[] args){

    
        Scanner input = new Scanner(System.in);
        System.out.println("Enter how many rows in array 1");
        int row1 = input.nextInt();
        System.out.println("Enter how many cols in array 1");
        int col1 = input.nextInt();
        System.out.println("Enter how many rows in array 2");
        int row2 = input.nextInt();
        System.out.println("Enter how many cols in array 2");
        int col2 = input.nextInt();
        double array1 [][]=new double[row1][col1];
        double array2 [][]=new double[row2][col2];
        double sum [][]=new double[row1][col2];
        System.out.println("Enter array 1");
        for(int i=0;i<row1;i++){    // this loop will enter array 1
            for(int y=0;y<col1;y++){
                System.out.println("enter a "+i+" "+y+"");
                array1[i][y]=input.nextDouble();
            }
        }
        System.out.println("Enter array 2"); 
        for(int i=0;i<row2;i++){    // this loop will enter array 2
            for(int y=0;y<col2;y++){
                System.out.println("enter a "+i+" "+y+"");
                array2[i][y]=input.nextDouble();
            }
        }
        if(col1==row2){             // to check if the coloums of array = rows of array2
            for(int i = 0; i < row1; i++){
                for (int y=0;y<col2;y++){
                    for(int j=0;j<col1;j++){
                        sum[i][y]+=array1[i][j]*array2[j][y];
                    }
                }
            }
            System.out.println("your frikin result is :");
            display(sum);
        }
        else{
            System.out.println("Error col1 != row2");
        }
    }
    public static void display(double x[][]) {  // to display the result array
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                System.out.print(x[row][column] + "\t");
            }
            System.out.println();
        }
    }
}
