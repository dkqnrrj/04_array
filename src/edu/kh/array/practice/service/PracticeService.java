package edu.kh.array.practice.service;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeService {

	public void practice1() {

		int sum = 0;
		int[] arr = new int[9];

		for (int i = 0; i < 9; i++) {

			arr[i] = i + 1;

			if (i % 2 == 0) {

				sum += arr[i];

			}

		}

		System.out.println(Arrays.toString(arr));

		System.out.println("짝수 번째 인덱스 합 : " + sum);

	}

	public void practice2() {

		int sum = 0;
		int[] arr = new int[9];

		// [0] 9 [1] 8 [2] 7... [8] 1

		for (int i = 0; i < 9; i++) {

			arr[i] = 9 - i;

			if (i % 2 == 1) {

				sum += arr[i];

			}

		}

		System.out.println(Arrays.toString(arr));

		System.out.println("홀수 번째 인덱스 합 : " + sum);

	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);

		System.out.print("양의 정수 : ");
		int input = sc.nextInt();

		int[] arr = new int[input];

		for (int i = 0; i < input; i++) {

			arr[i] = i + 1;

		}

		System.out.println(Arrays.toString(arr));

	}

	public void practice4() {

		Scanner sc = new Scanner(System.in);

		System.out.print("입력0 : ");
		int input0 = sc.nextInt();

		System.out.print("입력1 : ");
		int input1 = sc.nextInt();

		System.out.print("입력2 : ");
		int input2 = sc.nextInt();

		System.out.print("입력3 : ");
		int input3 = sc.nextInt();

		System.out.print("입력4 : ");
		int input4 = sc.nextInt();

		int[] arr = { input0, input1, input2, input3, input4 };

		System.out.print("검색할 값 : ");
		int search = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {

			if (search == arr[i]) {

				System.out.print("인덱스 : " + i);

			} else {

			}

		}

		for (int ii = 0; ii < arr.length; ii++) {

			if (search != arr[ii]) {

				System.out.print("일치하는 값이 존재하지 않습니다.");
			}

		}

	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.next().charAt(0);

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);

			System.out.println(Arrays.toString(arr));

			int count = 0;

			for (int ii = 0; ii < arr.length; ii++) {

				if (arr[ii] == ch) {

					count++;
				}
			}
			
			if(count > 0) {
				
				System.out.println(ch + "개수" + count);
				
			} else {
			
			
			}
		}
	}
	
	
	public void practice6() {
		
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int input = sc.nextInt();

		int[] arr = new int[input];
		
		int sum = 0;
		
		for (int i = 0; i < arr.length; i++) {
		
		
			
		
		
		System.out.print("배열 " + arr[i] +"번째 인덱스에 넣을 값 : ");
		
		arr[i] = sc.nextInt();
		
		
		sum += arr[i];
		
		
		
	
		
		
	}
	
	
	
	
	System.out.println(Arrays.toString(arr));
	
	
	
	System.out.print("총 합 : " + sum);
	
	
	
	
	
	}
	
	
	
	public void practice7() { // 어렵다
		
		
		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) : ");
		String str = sc.nextLine();
		
		char[] num = new char[str.length()]; // char로 된 새로운 배열문 생성
		
		for(int i=0; i < num.length; i++) { // char 배열문에 입력 받은 주민등록번호 하나씩 삽입
			num[i] = str.charAt(i);
			
			
		}
		
		char[] copy = new char[num.length]; 
		
		for (int i = 0; i < copy.length; i++) {
			
			if(i <= 7) {
				copy[i] = num[i];
				
				 
			} else {
				
				copy[i] = '*';
				
			}
			
			
			System.out.print(copy[i]);
			
		}
		
		
		
		
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		
		for (int i = 0; i <= 100; i++) {
			
		
		
		if (input % 2 == 0 || input < 3) {
			
			System.out.println("다시 입력하세요.");
			
			break; // break가 안되는데?
	
		} else {
			
		
		}
		
		}
		
		int[] arr = new int[input]; // 입력 받은 값(홀수)으로 배열 만든 다음
		
		for( int n = 0; n <= input / 2; n++) { // 해당 값 /2 한 자리 까지는 ++
			
			arr[n] = n + 1;
			
			
		}
		
		
		for (int m = input / 2 + 1; m <= input - 1; m++) {  // 해당 값 /2 +2 한 자리 부터 -- 하도록
			
			// 5를 입력했을때 3번째 자리에 2가 들어가고 2번째 자리에는 1이 들어가야함.
			
			
			arr[m] = m - (input - m); // 이걸 모르겠어
			
		}
		
		
		System.out.print(Arrays.toString(arr));
		
		
	}
	
	public void practice9() {
		
		
		int arr[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			
			int random = (int) (Math.random() * 10 + 1);
			
			arr[i] = random;
		}
		
		
		System.out.println(Arrays.toString(arr));
		
		
		
	}
	
	public void practice10() {
		
		int arr[] = new int[10];
		
		
		
		for (int i = 0; i < 10; i++) {
			
			int random = (int) (Math.random() * 10 + 1);
			
			arr[i] = random;
		}
		
		
		System.out.println("발생한 난수 : " + Arrays.toString(arr));
		
		
		
		int max = -2147000000;
		int min = 2147000000;
		
		
		for (int a = 0; a < arr.length; a++) {
			max = Math.max(max, arr[a]);
			min = Math.min(min, arr[a]);
		}
		
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		
	}
	
	public void practice11() {
		
		
		int arr[] = new int[10]; // 10개짜리 정수형 배열 선언
		 
		
		
		
		for (int i = 0; i < 10; i++) { // 10까지 난수 생성
			
			int random = (int) (Math.random() * 10 + 1);
			
			arr[i] = random;
			
			
			

			for(int x = 0; x < i; x++) {
				
				if (random == arr[x]) {
				
					i--;
				
					break;
					
			}
			
		}
		
		
		}
		
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public void practice12() {
		
		
	int arr[] = new int[6]; // 6개짜리 정수형 배열 선언
		 
		
		
		
		for (int i = 0; i < arr.length; i++) { // 99까지 난수 생성
			
			int random = (int) (Math.random() * 99 + 1);
			
			arr[i] = random;
			
			
			

			for(int x = 0; x < i; x++) {
				
				if (random == arr[x]) {
				
					i--;
				
					break;
					
			}
			
		}
		
		
		}
		
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
	}
	
	public void practice13() {
	
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : "); // 문자열 입력 받기
		
		String input = sc.nextLine();
		
		
		
		char [] arr = new char[input.length()]; // 입력 받은 문자열 갯수 만큼 배열 생성
		
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i] = input.charAt(i);
			
			
		}
		
		
		System.out.print("문자열에 있는 문자 : " + Arrays.toString(arr));
		
		
		System.out.println();
		
		
		System.out.print("문자 개수 : " + input.length());
		
		
	}
	
	public void practice14() {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		
		int input0 = sc.nextInt();
		
		
		int arr[] = new int[input0];
		
		
		System.out.print("1번째 문자열 : ");
		String input1 = sc.nextLine();
		
		
		System.out.print("2번째 문자열 : ");
		String input2 = sc.nextLine();
		
		
		System.out.print("3번째 문자열 : ");
		String input3 = sc.nextLine();
		
		
		System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
		String input4 = sc.nextLine();
		
		if (input4 == "y") {
			
			System.out.print("더 입력하고 싶은 개수 : ");
			int input5 = sc.nextInt();
			
			
			for(int i = 0; i < input5; i++) {
				
				
				System.out.print( (i + 4) + "번째 문자열 : ");
				
			}
			
			
		}
		
	}
}