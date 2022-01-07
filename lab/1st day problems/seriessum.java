import java.util.Scanner;

public class seriessum {
    public static void main(String[] args){
        int num,sum=0;
        Scanner n=new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=n.nextInt();
        for (int i=1;i<=num;i++){
            sum=sum+(i*i);
        }
        System.out.println("The sum of square of "+ num + " natural numbers is: "+sum);

    }
}
