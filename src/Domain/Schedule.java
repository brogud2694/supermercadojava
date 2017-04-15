package Domain;

import java.util.Date;

/**
 *
 * @author kenne
 */
public class Schedule {
    private int idSchedule;
    private char day;
    private Date fHour;
    private Date sHour;

    public Schedule(int idSchedule, char day, Date fHour, Date sHour) {
        this.idSchedule = idSchedule;
        this.day = day;
        this.fHour = fHour;
        this.sHour = sHour;
    }

    public Schedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }

    public int getIdSchedule() {
        return idSchedule;
    }

    public void setIdSchedule(int idSchedule) {
        this.idSchedule = idSchedule;
    }

    public char getDay() {
        return day;
    }

    public void setDay(char day) {
        this.day = day;
    }

    public Date getfHour() {
        return fHour;
    }

    public void setfHour(Date fHour) {
        this.fHour = fHour;
    }

    public Date getsHour() {
        return sHour;
    }

    public void setsHour(Date sHour) {
        this.sHour = sHour;
    }
    
    
}
