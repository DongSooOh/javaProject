package javaTest;

public class IfNestedExample {
	public static void main(String[] args) {
		
		int score = (int)(Math.random() * 20) + 81;
		// (0 <= x < 1 ) * 20: (0 ~ 0.9) * 20 �� 0 ~ 18
		// (int)(0 ~ 18) �� 0 ~ 18
		// (0 ~ 18) + 81 �� 81 ~ 99
		
		System.out.println("����: " + score);
		
		String grade;
		
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		}
		System.out.println("����: " + grade);
	}
}
