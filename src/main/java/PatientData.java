import java.util.ArrayList;
import java.util.List;

public class PatientData {


    public List<Patient> CreatePatientData(){
        List<Patient> totalPatients = new ArrayList<>();

        Patient p = new Patient("ABC", Location.Bangalore);
        totalPatients.add(p);

        Patient p1 = new Patient("XYZ",Location.Bangalore);
        totalPatients.add(p1);

        Patient p2= new Patient("SDW",Location.Mumbai);
        totalPatients.add(p2);

        Patient p3= new Patient("SWEW",Location.Pune);
        totalPatients.add(p3);

        Patient p4= new Patient("SDW",Location.Bangalore);
        totalPatients.add(p4);

        return totalPatients;

    }

    public List<Patient> patientsList(){
            return new PatientData().CreatePatientData();
        }
    }


