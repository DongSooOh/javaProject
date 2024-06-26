package javaExample;

public class TimeTest {
	public static void main(String[] args) {

		Time t = new Time(12, 35, 30);
		System.out.println(t); // System.out.println(t.toString());

		// t.hour = 13; // private으로 접근이 불가, get, set을 이용해야 함
		t.setHour(t.getHour() + 1); // 현재시간보다 1시간 후로 변경
		System.out.println(t); // System.out.println(t.toString());과 동일, toString()은 Object 클래스의 멤버
	}
}

class Time {
	private int hour;
	private int minute;
	private int second;

	Time(int hour, int minute, int second) {
		setHour(hour);
		setMinute(minute);
		setSecond(second);
	}

	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		if (hour < 0 || hour > 23)
			return;
		this.hour = hour;
	}

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		if (minute < 0 || minute > 59)
			return;
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		if (second < 0 || second > 59)
			return;
		this.second = second;
	}

	public String toString() {
		return hour + ":" + minute + ":" + second;
	}
}
