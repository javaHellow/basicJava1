package D_array;

import java.util.Scanner;

public class Array_01 {
	public static void main(String[] args) {
		/*
		1. 배열(array)이란?
			-같은 타입의 여러 변수를 하나의 묶음으로 다루는 것.
			ex) 5명의 점수
			  int score1 = 100;
		 	  int score2 = 50;
		 	  int score3 = 30;
		 	  int score4 = 70;
		 	  int score5 = 63;
		 	  
		2. 배열의 선언
		  - 원하는 타입의 변수를 선언하고 변수 또는 타입에 배열임을 의미하는 []를 붙여준다.
		*/
//		int[] a1;  int 타입의 배열 위의 방법이 더 많이 쓰임
//		int a2[];
		
		/*
		3. 배열의 생성
		  - 배열을 선언한 다음에는 배열을 생성해야 한다.
		  - 배열생성을 위해서는 'new'와 함께 배열의 타입과 크기를 지정해 주면된다.

		 */
		int[] a = new int[3]; // 집에 방이 3개
		int[] a2;
		a2 = new int[]{3,4,5}; // 원하는 값으 넣어줄려면
		int[] a3 = {3,4,5}; // 분리가 안됨
//		int[] a3;
//		a3 = {3,4,5}; // 나중에 값을 구할떄 사용하기 위해 분리를 함
		
//		int[] score = new int[4];
//		System.out.println(score[0]);
//		System.out.println(score[1]);
//		System.out.println(score[2]);
//		System.out.println(score[3]);
		
//		for(int i = 0; i < 4 ; i++){
//			System.out.println(score[i]);
//		}
		
		//1. score의 0번쨰 방에 10을 저장해주세요
//		score[0] = 10; // (0+1)*10
		//2. score의 1번쨰 방에 20을 저장해주세요
//		score[1] = 20;// (1+1)*10
		//3. score의 2번쨰 방에 30을 저장해주세요
//		score[2] = 30;// (2+1)*10
		//4. score의 3번쨰 방에 40을 저장해주세요
//		score[3] = 40;// (3+1)*10
		
		
//		for(int i = 0; i < score.length ; i++){
//			System.out.println(score[i]);
//		}
			
		//1. 207호의 자바초급 점수를 저장할수 있는 변수를 선언 및 생성해주세요
		int[] score = new int[17];
		//2. 각 사람의 점수를 0~100점 사이의 랜덤한 정수값으로 저장해주세요(각방)
		for(int i= 0 ; i<17 ; i++){
			score[i] = (int)(Math.random()*101+1);{
//				score[0] = (int)(Math.random()*101+0);
//				score[1] = (int)(Math.random()*101+0);
//				score[2] = (int)(Math.random()*101+0);
//				score[3] = (int)(Math.random()*101+0);
//				score[4] = (int)(Math.random()*101+0);
//				score[5] = (int)(Math.random()*101+0);
//				score[6] = (int)(Math.random()*101+0);
//				score[7] = (int)(Math.random()*101+0);
//				score[8] = (int)(Math.random()*101+0);
//				score[9] = (int)(Math.random()*101+0);	
//				score[10] = (int)(Math.random()*101+0);
//				score[11] = (int)(Math.random()*101+0);
//				score[12] = (int)(Math.random()*101+0);
//				score[13] = (int)(Math.random()*101+0);
//				score[14] = (int)(Math.random()*101+0);
//				score[15] = (int)(Math.random()*101+0);
//				score[16] = (int)(Math.random()*101+0);
			}
		}
		//2.5 각사람의 점수를 출력 해주세요
//		for(int i= 0 ; i<score.length ; i++){
//			score[i] = (int)(Math.random()*101+0);
//			System.out.println("score["+i+"]="+score[i]);
//		}
		//3. 모든 사람의 합계를 구해주세요
//		int sum = 0;
//		for(int i= 0 ; i<score.length ; i++){
//			score[i] = (int)(Math.random()*101+0);
//			sum += score[i];
//			System.out.println(score[i]);		
//		}	
//		System.out.println(sum);

		
		
		//1. 7개의 정수를 저장할수 있는 변수 input을 선언 및 생성해주세요
		int[] input = new int[7];
		//2. input변수의 각각의 방을 사용자로부터 입력받아 저장해주세요
		Scanner sc = new Scanner(System.in);
//		input[0] = sc.nextInt();
//		input[1] = sc.nextInt();
//		input[2] = sc.nextInt();
//		input[3] = sc.nextInt();
//		input[4] = sc.nextInt();
//		input[5] = sc.nextInt();
//		input[6] = sc.nextInt();
		for(int i= 0 ; i<input.length ; i++){
			System.out.println("숫자를 입력해주세요");
			input[i] = sc.nextInt();
		}
		//3. 
		for(int i= 0 ; i<input.length ; i++){
			System.out.println(input[i]);
		}
		//4.
		int sum = 0;
		for(int i= 0 ; i<input.length ; i++){
			sum +=  input[i];
			
		}
		System.out.println(sum);
		
		//5.평균 소수점 3째자리에서 반올림해서 2번쨰자리를 나타내라.
//		int av=0;//평균을 저장할 변수
//		float av = (int)((frolat))sum/input.length*100+0.5)/100f;
//		System.out.println("입력한 값의 평균은"+av+"입니다.");

		//최대값
		int max = input[0]; 
		
		if(max < input[1]){
			max = input[1];
		}
		
		if(max < input[3]){ 
			max = input[3];
		}

		if(max < input[4]){ 
			max = input[4];
		}

		if(max < input[5]){ 
			max = input[5];
		}

		if(max < input[6]){ 
			max = input[6];
		}
		for(int i = 1; i < input.length; i++){
			if(max < input[i]){
				max = input[i];
			}
		}
		
		System.out.println("최댓값은 :" + max);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
	}

	
}

