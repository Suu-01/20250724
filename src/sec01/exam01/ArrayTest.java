package sec01.exam01;

public class ArrayTest {

	static int method() {
		System.out.println("method1");
		return 100;
	}
	public static void main(String[] args) {
//		int[] arr = new int[] {100, 200, 300};
		int[] arr = {100, 200, 300, 400};
		String names[] = new String[5];
		
		for(int i=0; i < arr.length; i++) {
			System.out.println(names[i]);
			System.out.println(arr[i]);
		}

	}

}
