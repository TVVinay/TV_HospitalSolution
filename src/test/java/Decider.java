import org.junit.Test;

import java.util.List;

public class Decider {

    @Test
    public void Descision(){

        int indoorPatient = 0;
        Hospital hospital = new Hospital();
        hospital.setLocation("Bengaluru");
        List<Patients> patients = new Patients().patientsList();

        for(Patients p : patients){
            if(p.getLocation().equalsIgnoreCase(hospital.getLocation())){
                indoorPatient++;
            }
        }
        int outdoorPatient = patients.size() - indoorPatient;

        System.out.println("Total Patients from " + hospital.getLocation() +" : "+ indoorPatient);
        System.out.println("Total Outstation Patients : " + outdoorPatient);

        System.out.println("Indoor Patient percentage : "+ (indoorPatient * 100 / patients.size())+"%");
        System.out.println("Outdoor Patient percentage : "+ (outdoorPatient * 100 / patients.size())+"%");
    }
}
