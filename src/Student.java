/**
 * Created by meudecc on 15/02/2017.
 * 05/12/2018 - Shauna Byrne - Updated to Fix asserts
 */
public class Student {

    public enum AttendanceGrade {ABSENT, VERY_POOR, POOR, AVERAGE, GOOD, VERY_GOOD};

    public AttendanceGrade getAttendanceGrade(int attendance) {
        if (attendance < 0 || attendance > 100) throw new IllegalArgumentException();
        else if (attendance == 0) return AttendanceGrade.ABSENT;
        else if (attendance < 30) return AttendanceGrade.VERY_POOR;        
        else if (attendance < 70 && attendance >= 30) return AttendanceGrade.AVERAGE;
        else if (attendance < 90 && attendance >= 70) return AttendanceGrade.GOOD;
        return AttendanceGrade.VERY_GOOD;
    }
    
}
