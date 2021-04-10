package sample.model;

public class Bed {

    private int id;
    private String bedName;
    private int roomID;
    private int patientID;

    // Constructor
    public  Bed(String bedName) { this.bedName = bedName; }

    // Setter
    public void setBedName(String bedName) { this.bedName = bedName; }
    public void setRoomID(int roomID) { this.roomID = roomID; }
    public void setPatientID(int patientID) { this.patientID = patientID; }

    // Getter
    public int getId() { return id; }
    public String getBedName() { return bedName; }
    public int getRoomID() { return roomID; }
    public int getPatientID() { return patientID; }


}
