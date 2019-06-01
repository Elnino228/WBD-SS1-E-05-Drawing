import java.util.Scanner;
public class Drawing {
    public static void main(String[] args) {
        System.out.println("Menu:");
        System.out.println("1. Print rectangle.");
        System.out.println("2. Print square triangle.");
        System.out.println("3. Print isosceles triangle.");
        System.out.println("0. Exit");
        Scanner scanner=new Scanner(System.in);
        int choice=-1;
        int rows,cols;
        while (choice!=0){
            System.out.println("Enter your choice");
            choice=scanner.nextInt();
            switch (choice){
                case 1:
                    rows=5;
                    cols=3;
                    for (int i=0;i<rows;i++){
                        for (int j=0;j<cols;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    rows=5;
                    cols=5;
                    for (int i=0;i<rows;i++){
                        for (int j=i;j<cols;j++){
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    rows=5;
                    cols=5;
                    for (int i=0;i<rows;i++){
                        for (int j=0;j<cols;j++){
                            if (j<i)
                                System.out.print(" ");
                            else System.out.print("*");
                        }
                        System.out.println();
                    }
                    rows=5;
                    cols=5;
                    for (int i=0;i<rows;i++){
                        for (int j=0;j<cols;j++){
                            if (j>=rows-i-1)
                                System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    rows=5;
                    cols=5;
                    for (int i=0;i<rows;i++){
                        for (int j=0;j<cols;j++){
                            if (j<=i)
                                System.out.print("*");
                            else System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    rows=5;
                    cols=9;
                    for (int i=0;i<rows;i++){
                        for (int j=0;j<cols;j++){
                            if (j>=cols/2-i && j<=cols/2+i)
                                System.out.print("*");
                            else
                                System.out.print(" ");
                        }
                        System.out.println();
                    }
                    break;
                case 0:
                    System.exit(0);
            }
        }
    }
}
