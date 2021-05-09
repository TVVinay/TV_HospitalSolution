import java.util.List;

public class Patients {

    private String name;
    private String location;
    private int id;
    //private List<Visit> visit;

    public Patients(String name, String location)
    {
        this.name = name;
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

    public int getId() {
        return id;
    }

    public List<Patients> patientsList(){
        return new PatientData().CreatePatientData();
    }
}

