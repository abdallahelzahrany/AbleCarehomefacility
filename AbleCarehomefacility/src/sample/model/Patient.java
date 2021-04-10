package sample.model;

public class Patient extends Person{

    // prop
    private Gender gender;
    private boolean needIsolation;
    private Prescription prescription;

    // constarctor
    public Patient(String name,Gender gender,boolean needIsolation)
    {
        super(name);
        this.gender=gender;
        this.needIsolation=needIsolation;
    }

    // Getter
    public Gender getGender()
    {
        return gender;
    }
    public boolean getNeedIsolation()
    {
        return needIsolation;
    }
    public Prescription getPrescription()
    {
        return prescription;
    }

    // Setter
    public void setPrescription(Prescription prescription)
    {
        this.prescription = prescription;
    }

}
