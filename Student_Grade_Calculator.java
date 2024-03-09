import java.util.Scanner;

public class Student_Grade_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        float Average_percentage;
        System.out.println("Enter number of subjects you have :");
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the marks obtained in Subject" + (i+1) +" out of 100");
            arr[i] = in.nextInt();
             sum += arr[i];
        }
        System.out.println("The Total Marks is "+sum);
        Average_percentage=sum/n;
        System.out.println("The Average percentage is "+Average_percentage);
        if(Average_percentage>90 && Average_percentage <=100){
            System.out.println("you got grade S");
        }
        else if(Average_percentage>80 && Average_percentage <=90){
            System.out.println("you got grade A");
        }
        else if(Average_percentage>70 && Average_percentage <=80){
            System.out.println("you got grade B");
        }
        else if(Average_percentage>60 && Average_percentage <=70){
            System.out.println("you got grade C");
        }
        else if(Average_percentage>50 && Average_percentage <=60){
            System.out.println("you got grade D");
        }
        else if(Average_percentage>40 && Average_percentage <=50){
            System.out.println("you got grade E");
        }
        else {
            System.out.println(" Sorry your marks is too low! ");
        }

    }
}

