import java.util.*;

public class sudo {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();
	for(int i =0 ; i<n ;i++){
        if (i % 2 == 0) {
            System.out.println("Even--"+i);
        } else {
            System.out.println("Odd---"+i);
        }
	}
    }
}
