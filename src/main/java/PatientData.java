import java.util.ArrayList;
import java.util.List;

public class PatientData {


    public List<Patients> CreatePatientData(){
        List<Patients> totalPatients = new ArrayList<>();

        Patients p = new Patients("ABC", Location.Bangalore);
        totalPatients.add(p);

        Patients p1 = new Patients("XYZ",Location.Bangalore);
        totalPatients.add(p1);

        Patients p2= new Patients("SDW",Location.Mumbai);
        totalPatients.add(p2);

        Patients p3= new Patients("SWEW",Location.Pune);
        totalPatients.add(p3);

        Patients p4= new Patients("SDW",Location.Bangalore);
        totalPatients.add(p4);


        return totalPatients;

    }
    }

