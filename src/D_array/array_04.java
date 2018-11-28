package D_array;

import java.util.Arrays;

public class array_04 {
	public static void main(String[] args) {
		
		//1. 6명의 7과목을 저장할수 있는 변수 score를 선언 및 생성해주세요
		String[] str = new String []{"정필지","이종선","조현웅","정창훈","명노현","이상엽"};
		String[] k = new String [] {"중국어","몽골어","국어","영어","일본어","스페인어","독일어"};
		int[][] score = new int[str.length][k.length];
		
		
		//2. score의 각방을 0~100점 사이의 랜덤한 정수값을 저장해주세요
		for(int i = 0 ; i<score.length ; i++){
			for(int j = 0 ; j<score[i].length ; j++){
				score[i][j] = (int)(Math.random()*101+0);
			}
		}
		//합계 값
		int[] namesum = new int[str.length];
		for(int i = 0 ; i < str.length ; i++){
			int sum = 0;
			for (int j =0 ; j< k.length ; j++){
		
				sum += score[i][j];
				namesum[i] = sum;
			}
		}
		//평균값 
		float[]ave = new float [str.length];
		for(int i = 0 ; i < str.length ; i++){
			ave[i]= (int)(namesum[i]/(float)str.length*100+0.5)/100f;
		}//
		for(int i = 0 ; i<score.length ; i++){
			for(int j = 0 ; j<score[i].length ; j++){
				score[i][j] = (int)(Math.random()*101+0);
			}
		}
		//과목합계 값
		int[] namesum2 = new int[k.length];
		for(int i = 0 ; i < k.length ; i++){
			int sum = 0;
			for (int j =0 ; j<str.length ; j++){
				namesum2[i] = sum;
			}
		}
			

	
		//0. 아래와 같이 출력해주세요
		
		
		
		for(int i = 0 ; i<k.length ; i++){
			System.out.print("\t"+k[i]);
		}
		System.out.print("\t합계");
		System.out.print("\t평균");
	
		System.out.println();
		for(int i = 0 ; i<score.length ; i++){
			System.out.print(str[i]+"\t");
			
			for(int j = 0 ; j<score[i].length ; j++){
				System.out.print(score[i][j]+"\t");
				
			
				
			}
			System.out.print(namesum[i]+"\t");
			System.out.print(ave[i]);
			System.out.println();
			
			
		}
		System.out.print("과목합계");
		for(int i = 0; i < k.length ; i++){
			System.out.print("\t" + namesum2[i]);
		}
		
		//3.
		
			
	}
}
