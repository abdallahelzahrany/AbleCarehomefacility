package sample.model;

import java.util.Date;

public class Doctor extends Employee implements MedicalStaff{

    // Constructor
    public Doctor(String name, String userName, String password)
    {
        super(name, userName, password);
    }

    // Methods
    public void addPrescription(int patientID,Prescription newPrescription)
    {
        //DB
    }
    public void UpdatePrescription(int patientID,Prescription updatedPrescription)
    {
        //DB
    }
    @Override
    public void checkPatient(int patientID)
    {

    }
    @Override
    public void logTime(Date time)
    {

    }
}
