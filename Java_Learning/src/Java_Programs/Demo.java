package Java_Programs;
import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[10];
		int[] arr2={1,2};
//		int[] arr_copy=Arrays.copyOf(arr1,4);
		Arrays.fill(arr1,0);
		
		String name=Arrays.toString(arr1);
		System.out.println(name);
		
		
	}

}
