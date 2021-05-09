import java.util.List;

public class Patients {

    private String name;
    private String location;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getName()
    {
        return name;
    }

    public String getLocation()
    {
        return location;
    }

    public List<Patients> patientsList(){
        return new PatientData().CreatePatientData();
    }
}

