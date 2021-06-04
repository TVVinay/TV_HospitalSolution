import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class Decider {


    @Test
    public void getLocationWisePercentage() {
        LocalDate date = LocalDate.now();

        Hospital hospital = new Hospital(Location.Bangalore);
        Patient patient1 = new PatientBuilder().setName("Vinay").setLocation(Location.Mumbai).getPatientBuilder();
        Patient patient2 = new PatientBuilder().setName("Rajesh").setLocation(Location.Bangalore).getPatientBuilder();
        Patient patient3 = new PatientBuilder().setName("Raju").setLocation(Location.Mumbai).getPatientBuilder();
        Patient patient4 = new PatientBuilder().setName("Sachin").setLocation(Location.Bangalore).getPatientBuilder();
        Patient patient5 = new PatientBuilder().setName("Ravi").setLocation(Location.Pune).getPatientBuilder();

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
        Patient patient1 = new PatientBuilder().setName("Vinay").setLocation(Location.Mumbai).getPatientBuilder();
        Patient patient2 = new PatientBuilder().setName("Rajesh").setLocation(Location.Bangalore).getPatientBuilder();
        Patient patient3 = new PatientBuilder().setName("Raju").setLocation(Location.Mumbai).getPatientBuilder();
        Patient patient4 = new PatientBuilder().setName("Sachin").setLocation(Location.Bangalore).getPatientBuilder();
        Patient patient5 = new PatientBuilder().setName("Ravi").setLocation(Location.Pune).getPatientBuilder();


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
        Patient patient1 = new PatientBuilder().setName("Vinay").setLocation(Location.Mumbai).setDate(endDate).getPatientBuilder();
        Patient patient2 = new PatientBuilder().setName("Rajesh").setLocation(Location.Bangalore).setDate(endDate.minusDays(3)).getPatientBuilder();
        Patient patient3 = new PatientBuilder().setName("Raju").setLocation(Location.Mumbai).setDate(endDate.minusDays(2)).getPatientBuilder();
        Patient patient4 = new PatientBuilder().setName("Sachin").setLocation(Location.Bangalore).setDate(endDate).getPatientBuilder();
        Patient patient5 = new PatientBuilder().setName("Ravi").setLocation(Location.Pune).setDate(endDate.minusDays(1)).getPatientBuilder();

        hospital.addPatient(patient1);
        hospital.addPatient(patient2);
        hospital.addPatient(patient3);
        hospital.addPatient(patient4);
        hospital.addPatient(patient5);

        hospital.totalIndoorPatientCountInNdays();

        System.out.println(hospital.totalIndoorPatientCountInNdays());
        System.out.println(hospital.totalOutdoorPatientCountInNdays());
        System.out.println("Indoor Patient percentage is : "+hospital.getIndoorPatientPercentageInNDays()+"%");
        System.out.println("OutStation Patient percentage is : "+hospital.getOutdoorPatientPercentageInNDays()+"%");

        Assert.assertEquals(40,hospital.getIndoorPatientPercentageInNDays());
        Assert.assertEquals(60,hospital.getOutdoorPatientPercentageInNDays());

    }

}


