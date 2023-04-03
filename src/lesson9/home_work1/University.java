package Less1.lesson9.home_work1;

import java.util.Date;

public class University
{
    String studentName;
    Date date;

    public University() {
    }

    public University(String studentName, Date date) {
        this.studentName = studentName;
        this.date = date;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    void getTimetable(String studentName, Date date)
    {
        System.out.println("Уф ежжи");
    }
}
