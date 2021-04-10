package sample.model;

public class Manager {

    // Methods
    public void addDoctor(String name,String userName,String password)
    {
        Doctor doctor=new Doctor(name,userName,password);
        //DB doctor

    }
    public void addNurse(String name,String userName,String password,Shift shift)
    {
        Nurse nurse=new Nurse(name,userName,password,shift);
        //DB nurse

    }
    public void addPatient(String name,Gender gender,boolean needIsolation,String bedName)
    {
        Patient patient=new Patient(name,gender,needIsolation);
        //add patient in DB and put in bed

    }
    public void dischargePatient(int patientID)
    {
        //DB
    }
}
