import org.junit.Test;

import java.util.List;

public class Decider {


    @Test
    public void getLocationWisePercentage() {

        Hospital hospital = new Hospital(Location.Bangalore);
        List<Patients> patients = Patients.patientsList();

        long indoorPatient = hospital.getIndoorPatient(patients);
        long outdoorPatient = hospital.getOutdoorPatient(patients);

        System.out.println("Indoor Patient percentage : " + (indoorPatient * 100 / patients.size()) + "%");
        System.out.println("Outdoor Patient percentage : " + (outdoorPatient * 100 / patients.size()) + "%");
    }

    @Test
    public void getLocationWisePatientsCount() {

        Hospital hospital = new Hospital(Location.Bangalore);
        List<Patients> patients = Patients.patientsList();
        long indoorPatient = hospital.getIndoorPatient(patients);

        long outdoorPatient = patients.size() - indoorPatient;

        System.out.println("Total Patients from " + hospital.getLocation() + " : " + indoorPatient);
        System.out.println("Total Outstation Patients : " + outdoorPatient);
    }

}


