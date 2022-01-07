
import java.util.*;

interface Exam {
	int Pass(int mark[]);
}

interface Classify {
	String Average(int total, int num);
}

class Result implements Exam, Classify {
	public int Pass(int[] mark) {
		int total = 0;
		for (int i = 0; i < mark.length; i++) {
			total = total + mark[i];
		}
		return total;
	}

	public String Average(int tot, int num) {
		int tot1 = tot / num;
		if (tot1 >= 60)
			return "First";
		else if (tot1 >= 50)
			return "Second";
		else
			return "No-Division";
	}
}

public class MyResult {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int pass;
		System.out.println("Enter number of marks : ");
		int n = sc.nextInt();
		int mark[] = new int[n];
		String division;
		Result res = new Result();
		try {
			for (int i = 0; i < n; i++) {
				System.out.println("Enter the mark : ");
				mark[i] = sc.nextInt();
			}
			pass = res.Pass(mark);
			division = res.Average(pass, n);
			System.out.println("you passed with division: " + division + ".");
		} catch (Exception e) {
			System.out.println("Error : " + e);
		}
		sc.close();
	}
}