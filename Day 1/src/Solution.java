
public class Solution {
	public static void main(String args[]){
		System.out.println("Hello");
		A a1= new A();
		a1.x=10;
		a1.y=13;
		A.z= 20;
		System.out.println(a1.sum());
		System.out.println(A.z);

	}

}

class array{
	public static void main(String args[]){
		int array[]= new int[10];
		int array1[]={-1,2,34,5,6,8,766};
		System.out.println(array1.length);
		int min= array1[0];
		
		for(int i=0;i<array.length;i++){
			if(array1[i]<min){
				min = array1[i];
			}
		}
		System.out.println("them in number"+min);
		}
	}
} // need to fix 
