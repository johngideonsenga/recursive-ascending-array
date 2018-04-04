public class Ascending_Array{
	public static int A1[] = {0,2,4,5,5,7,9,10,11,11,12,15,16,16,16,17,18,20,22,24}; //sample of ascending array
	public static int A2[] = {9,-8,12,18,-13,7,9,2,-5,23,12,-11,16,5,20,4,6,-20,13}; //sample of non-ascending array
	
	public static void main(String Args[]){
		int q1 = A1.length-1, q2 = A2.length-1;
		System.out.println("Array1 is ascending: "+isAscending(A1,q1));
		System.out.println("Array2 is ascending: "+isAscending(A2,q2));
	}
	public static boolean isAscending(int A[], int q){
		if(A[q] < A[q-1])return false;
		if(q == 1)return true;
		return isAscending(A, q-1);
	}
}