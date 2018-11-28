package D_array;

public class Array_02 {
	public static void main(String[] args) {
		
		/*
		1. 정렬
		  - 어떤 데이터를 빠르고 쉽게 찾기 위해 순서대로 데이터를 가지런히 나열하는 작업
		  - 버블정렬, 삽입정렬, 선택정렬
		
		2. 버블정렬 (bublle sort)
		  - 인접한 데이터 간에 교환이 계속적으로 일어나면서 정렬이 이루어진다.
		  - 회전이 진행됨에 따라 가장 큰값이 뒤로 보내진다.
	
		3.선택정렬( Select sort)
		  - 정렬의 대상에서 최솟값을 찾아서 맨앞의 내용과 교체하는 방식이다
		  - 회전이 진행됨에 따라 가장 작은값이 앞에 확정된다.
		  - 
 		*/
		//1. 5,2,3,1,4 숫자 5개를 저장할수 있는변수를 선언 및 생성하세요
		
//		int[] a = new int[]{5,2,3,1,4};
//		for(int k=0; k<a.length-1; k++){
//			System.out.println(k+1+"회전");
//		
//		for(int i = 0 ; i < a.length-1-k ; i++){
//			if( a[i] > a[i+1]){
//			int temp = a[i];
//			a[i] = a[i+1];
//			a[i+1] = temp;
//			}
//		}
//			for(int j=0;j<a.length;j++){
//				System.out.print(a[j]+" ");
//		}
//			System.out.println();
//		}

		//3. 최솟값(select sort)
		int[] arr = new int[]{5,2,3,1,4};
//		int min = arr[0];
//		int minBang = 0;
//		for(int i = 1; i < arr.length; i++){
//			if(min > arr[i]){
//				min = arr[i];
//				minBang = i;
//			}
//		}
//		int temp = arr[0];
//		arr[0] = arr[minBang];
//		arr[minBang] = temp;
//		System.out.println(arr);
		
//		int min = arr[1];
//		int minBang = 1;
//		for(int i = 1; i < arr.length; i++){
//			if(min > arr[i]){
//				min = arr[i];
//				minBang = i;
//			}
//		}
//		int temp = arr[1];
//		arr[1] = arr[minBang];
//		arr[minBang] = temp;
//		System.out.println(arr);
//		
//		int min = arr[2];
//		int minBang = 2;
//		for(int i = 1; i < arr.length; i++){
//			if(min > arr[i]){
//				min = arr[i];
//				minBang = i;
//			}
//		}
//		int temp = arr[2];
//		arr[2] = arr[minBang];
//		arr[minBang] = temp;
//		System.out.println(arr);
		for(int j = 0 ; j < arr.length-1 ; j++){
			int min = arr[j];
			int minBang = j;
			for(int i = j+1 ; i < arr.length; i++){
				if(min > arr [i]){
					min = arr[i];
					minBang = i;
					}
				}
			}
			
	

		//4. 로또번호를 출력하세요 단(번호는 중복되지 않게)
		
		
	}
}