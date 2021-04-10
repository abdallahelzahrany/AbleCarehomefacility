package sample.model;

import java.util.Date;

public class Nurse extends Employee implements MedicalStaff{

    // prop
    private Shift shift;

    // Constructor
    public Nurse(String name, String userName, String password,Shift shift) {
        super(name, userName, password);
        this.shift=shift;
    }

    // Getter
    public Shift getShift()
    {
        return shift;
    }

    // Methods
    public void movePatient(int patientID,String toBedName)
    {
        //
        //DB
    }
    @Override
    public void checkPatient(int patientID)
    {
        //DB
    }
    @Override
    public void logTime(Date time)
    {
        //DB
    }
}
