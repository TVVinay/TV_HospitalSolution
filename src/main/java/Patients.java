import java.util.List;

public class Patients {

    private String name;
    private Patients.location location;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(location location) {
        this.location = location;
    }

    public enum location{ Bangalore, Pune, Mumbai}

    public String getName()
    {
        return name;
    }

    public Patients.location getLocation()
    {
        return location;
    }

    public List<Patients> patientsList(){
        return new PatientData().CreatePatientData();
    }
}

