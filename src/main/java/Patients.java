import java.util.ArrayList;
import java.util.List;

public class Patients {

    private String name;
    private Location location;
    public List<Visit> visitList;

    public Patients(String name , Location location){
        this.name = name;
        this.location = location;
        visitList = new ArrayList<Visit>();
    }

    public String getName()
    {
        return name;
    }

    public Location getLocation()
    {
        return location;
    }

    public static List<Patients> patientsList(){
        return new PatientData().CreatePatientData();
    }

}

