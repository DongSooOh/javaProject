package javaAPI;

public class MathExample {
	public static void main(String[] args) {

		int v1 = Math.abs(-5); // abs(): 절대값
		double v2 = Math.abs(-3.14);
		System.out.println("v1= " + v1);
		System.out.println("v2= " + v2);

		double v3 = Math.ceil(5.3); // ceil(): 올림
		double v4 = Math.ceil(-5.3);
		System.out.println("v3= " + v3);
		System.out.println("v4= " + v4);

		double v5 = Math.floor(5.3); // floor(): 내림
		double v6 = Math.floor(-5.3);
		System.out.println("v5= " + v5);
		System.out.println("v6= " + v6);

		int v7 = Math.max(5, 9); // max(): 매개변수 중 최대값 반환
		double v8 = Math.max(5.3, 2.5);
		System.out.println("v7= " + v7);
		System.out.println("v8= " + v8);

		int v9 = Math.min(5, 9); // min(): 매개변수 중 최소값 반환
		double v10 = Math.min(5.3, 2.5);
		System.out.println("v9= " + v9);
		System.out.println("v10= " + v10);

		double v11 = Math.random(); // random(): 0 이상 1 미만의 임의의 값 반환
		System.out.println("v11= " + v11);

		double v12 = Math.rint(5.3); // rint(): 가까운 정수의 실수값
		double v13 = Math.rint(5.7);
		System.out.println("v12= " + v12);
		System.out.println("V13= " + v13);

		long v14 = Math.round(5.3); // round(): 반올림
		long v15 = Math.round(5.7);
		System.out.println("v14= " + v14);
		System.out.println("v15= " + v15);

		double value = 12.3456;
		double temp1 = value * 100;
		long temp2 = Math.round(temp1); // temp1 반올림
		double v16 = temp2 / 100.0;
		System.out.println("v16= " + v16);

	}

}
