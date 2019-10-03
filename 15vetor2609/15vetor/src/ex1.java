import java.util.*;
public class ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		 int a[] = new int [20];
		 int b[] = new int [20];
		 int i;
		 
		 for(i=0;i<a.length;i++) {
			 System.out.println("Digite o " + (i+1) + " número ");
			 a[i] = in.nextInt();
		 }
		 for(i=0;i<a.length;i++) {
		 if(a[i] % 2 == 0) {
			 
			 b[i] = a[i];
			 
			System.out.println(b[i]);
		 }
	}
		 for(i=0;i<a.length;i++) {
			 if(a[i] % 2 != 0) {
				 
				 b[i] = a[i];
				 
				System.out.println(b[i]);
			 }
		}


}
}