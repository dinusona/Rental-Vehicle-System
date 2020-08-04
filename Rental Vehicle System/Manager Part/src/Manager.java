public class Manager {
    private int managerID;
    private String managerUserName;
    private String managerPhoneNumber;
    private String managerName;

    public Manager(){

    }
    public Manager(int managerID, String managerUserName, String managerPhoneNumber, String managerName) {
        this.managerID = managerID;
        this.managerUserName = managerUserName;
        this.managerPhoneNumber = managerPhoneNumber;
        this.managerName = managerName;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    public String getManagerUserName() {
        return managerUserName;
    }

    public void setManagerUserName(String managerUserName) {
        this.managerUserName = managerUserName;
    }

    public String getManagerPhoneNumber() {
        return managerPhoneNumber;
    }

    public void setManagerPhoneNumber(String managerPhoneNumber) {
        this.managerPhoneNumber = managerPhoneNumber;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerID=" + managerID +
                ", managerUserName='" + managerUserName + '\'' +
                ", managerPhoneNumber='" + managerPhoneNumber + '\'' +
                ", managerName='" + managerName + '\'' +
                '}';
    }
}
