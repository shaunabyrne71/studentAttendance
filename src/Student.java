/**
 * Created by meudecc on 15/02/2017. 05/12/2018 - Shauna Byrne - Updated to Fix
 * asserts
 */
public class Student {

	public enum AttendanceGrade {
		ABSENT, VERY_POOR, AVERAGE, GOOD, VERY_GOOD
	};

	public AttendanceGrade getAttendanceGrade(int attendance) {
		System.out.println("attendance = " + attendance);
		if (attendance < 0 || attendance > 100) {
			throw new IllegalArgumentException();
		}
		if (attendance == 0) {
			System.out.println("attendance == 0");
			return AttendanceGrade.ABSENT;
		}
		if (attendance < 30) {
			System.out.println("attendance < 30");
			return AttendanceGrade.VERY_POOR;
		}
		if (attendance < 70) {
			System.out.println("attendance < 70");
			return AttendanceGrade.AVERAGE;
		}
		if (attendance < 90) {
			System.out.println("attendance < 90");
			return AttendanceGrade.GOOD;
		}
		return AttendanceGrade.VERY_GOOD;
	}

}
