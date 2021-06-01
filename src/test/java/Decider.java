import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Decider {


    @Test
    public void getLocationWisePercentage() {
        LocalDate date = LocalDate.now();

        Hospital hospital = new Hospital(Location.Bangalore);
        Patient patient1 = new Patient("Ramesh",Location.Pune,date.minusDays(2));
        Patient patient2 = new Patient("Suresh",Location.Bangalore,date);
        Patient patient3 = new Patient("Raju",Location.Mumbai,date.minusDays(1));
        Patient patient4 = new Patient("Sachin",Location.Bangalore,date);
        Patient patient5 = new Patient("Rakesh",Location.Pune,date.minusDays(3));

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);
        hospital.addPatient(patient4);
        hospital.addPatient(patient5);

        System.out.println("Total Patient Visited " + hospital.getTotalPatientVisited());

        System.out.println(hospital.getIndoorPatient());
        System.out.println(hospital.getOutdoorPatient());
        System.out.println(hospital.getIndoorPatientPercentage());
        System.out.println(hospital.getOutStationPatientPercentage());

        Assert.assertEquals(40,hospital.getIndoorPatientPercentage());
        Assert.assertEquals(60,hospital.getOutStationPatientPercentage());



    }

    @Test
    public void getLocationWisePatientsCount() {
        LocalDate date = LocalDate.now();

        Hospital hospital = new Hospital(Location.Bangalore);
        Patient patient1 = new Patient("Ramesh",Location.Pune,date.minusDays(2));
        Patient patient2 = new Patient("Suresh",Location.Bangalore,date);
        Patient patient3 = new Patient("Raju",Location.Mumbai,date.minusDays(1));
        Patient patient4 = new Patient("Sachin",Location.Bangalore,date);
        Patient patient5 = new Patient("Rakesh",Location.Pune,date.minusDays(3));


        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);
        hospital.addPatient(patient4);
        hospital.addPatient(patient5);

        long indoorPatient = hospital.getIndoorPatient();
        long outdoorPatient = hospital.getOutdoorPatient();

        System.out.println("Total Patients from " + hospital.getLocation() + " : " + indoorPatient);
        System.out.println("Total Outstation Patients : " + outdoorPatient);

        Assert.assertEquals(2,indoorPatient);
        Assert.assertEquals(3,outdoorPatient);
    }
    @Test
    public void getPatientVisitsPercentageInLastThreeDays(){
        LocalDate endDate=LocalDate.now();

        Hospital hospital = new Hospital(Location.Bangalore);
        Patient patient = new Patient("ABCD",Location.Bangalore,endDate);
        Patient patient1 = new Patient("XSF",Location.Bangalore,endDate.minusDays(2));
        Patient patient2 = new Patient("XSF",Location.Mumbai,endDate.minusDays(2));
        Patient patient3 = new Patient("XSF",Location.Mumbai,endDate.minusDays(1));

        hospital.addPatient(patient);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);

        hospital.totalIndoorPatientCountInNdays();
        System.out.println(hospital.totalIndoorPatientCountInNdays());
        System.out.println(hospital.totalOutdoorPatientCountInNdays());

        System.out.println(hospital.getIndoorPatientPercentageInNDays());
        System.out.println(hospital.getOutdoorPatientPercentageInNDays());

        Assert.assertEquals(50,hospital.getIndoorPatientPercentageInNDays());
        Assert.assertEquals(50,hospital.getOutdoorPatientPercentageInNDays());

    }

}


