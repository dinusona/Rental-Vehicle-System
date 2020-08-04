import java.util.Date;

public class Schedule {
    private int scheduleID;
    private Date pickupDate;
    private Date dropBackDate;

    public Schedule(){

    }

    public Schedule(int scheduleID, Date pickupDate, Date dropBackDate) {
        this.scheduleID = scheduleID;
        this.pickupDate = pickupDate;
        this.dropBackDate = dropBackDate;
    }

    public int getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(int scheduleID) {
        this.scheduleID = scheduleID;
    }

    public Date getPickupDate() {
        return pickupDate;
    }

    public void setPickupDate(Date pickupDate) {
        this.pickupDate = pickupDate;
    }

    public Date getDropBackDate() {
        return dropBackDate;
    }

    public void setDropBackDate(Date dropBackDate) {
        this.dropBackDate = dropBackDate;
    }

    @Override
    public String toString() {
        return "Shedule{" +
                "scheduleID=" + scheduleID +
                ", pickupDate=" + pickupDate +
                ", dropBackDate=" + dropBackDate +
                '}';
    }
}
