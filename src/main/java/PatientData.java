import java.util.ArrayList;
import java.util.List;

public class PatientData {

    //Creating the list of Patients with locations
    public List<Patients> CreatePatientData(){
        List<Patients> totalPatients = new ArrayList<>();

        Patients p = new Patients();
        p.setName("ABC");
        p.setLocation("Bengaluru");
        totalPatients.add(p);

        Patients p1 = new Patients();
        p1.setName("XYZ");
        p1.setLocation("Bengaluru");
        totalPatients.add(p1);

        Patients p2= new Patients();
        p2.setName("SDF");
        p2.setLocation("Pune");
        totalPatients.add(p2);

        Patients p3= new Patients();
        p3.setName("RGRG");
        p3.setLocation("Mumbai");
        totalPatients.add(p3);

      //
       /* totalPatients.add(p2);
        totalPatients.add(p3);*/

        return totalPatients;

    }

}
