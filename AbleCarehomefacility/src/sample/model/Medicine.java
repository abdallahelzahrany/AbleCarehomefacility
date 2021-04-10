package sample.model;

import java.util.Date;
import java.util.Map;

public class Medicine {

    // prop
    private String medicineID;
    private int doses;
    private Map<Date,String> time;

    // Getter
    public String getMedicineID()
    {
        return medicineID;
    }
    public int getDoses()
    {
        return doses;
    }
    public Map getTime()
    {
        return time;
    }

    // Setter
    public void setDoses(int doses)
    {
        this.doses = doses;
    }
    public void setTime(Map<Date,String> time)
    {
        this.time = time;
    }

}
