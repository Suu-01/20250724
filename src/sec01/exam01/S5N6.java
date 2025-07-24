package sec01.exam01;

import java.util.Scanner;

public class S5N6 {

	public static void main(String[] args) {
		boolean run = true;
		int studNum = 0;
		int scores[] = null;
		Scanner sc = new Scanner(System.in);
		
		while (run) {
			System.out.println("---------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------------");
			System.out.print("선택>");
			
			int num = Integer.parseInt(sc.nextLine());
			
			switch (num) {
			case 1:
				System.out.print("학생수>");
				studNum = Integer.parseInt(sc.nextLine());
				scores = new int[studNum];
				break;
			case 2:
				for (int i=0; i < studNum; i++) {
					System.out.print("scores[" + i + "]> ");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
				break;
			case 3:
				for (int i=0; i < studNum; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				break;
			case 4:
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int i=0; i < studNum; i++) {
//					max = (max < scores[i]) ? scores[i] : max;
					if (scores[i] > max) {
					    max = scores[i];
					}
					sum += scores[i];
				}
				avg = (double) sum / studNum;
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				break;
			case 5:
				run = false;
				break;
			}
		}
		System.out.println("종료");

	}

}
