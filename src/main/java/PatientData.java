import java.util.ArrayList;
import java.util.List;

public class PatientData {

    public List<Patients> CreatePatientData(){
        List<Patients> totalPatients = new ArrayList<>();

        Patients p = new Patients("ABC","Bengaluru");
        Patients p1 = new Patients("XYZ","Pune");
        Patients p2= new Patients("SDH","Mumbai");
        Patients p3= new Patients("DEF","Chennai");

        totalPatients.add(p);
        totalPatients.add(p1);
        totalPatients.add(p2);
        totalPatients.add(p3);


        return totalPatients;

    }

}
