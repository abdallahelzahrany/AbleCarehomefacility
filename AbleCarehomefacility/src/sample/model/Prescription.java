package sample.model;

import java.util.Date;
import java.util.Map;

public class Prescription {

    // prop
    private Medicine[] medicines;

    // Getter
    public Medicine[] getMedicines()
    {
        return medicines;
    }

    // Setter
    public void setMedicines(Medicine[] medicines)
    {
        this.medicines = medicines;
    }
}
