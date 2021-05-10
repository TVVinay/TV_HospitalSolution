import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;
import java.util.List;

public class Decider {

    PatientData patientData = new PatientData();

    @Test
    public void getLocationWisePercentage() {

        Hospital hospital = new Hospital(Location.Bangalore);
        List<Patient> patients = patientData.patientsList();

        System.out.println("Indoor Patient percentage : " + hospital.getIndoorPatientPercentage(patients) + "%");
        System.out.println("Outdoor Patient percentage : " + hospital.getOutStationPatientPercentage(patients) + "%");

        Assert.assertEquals(60,hospital.getIndoorPatientPercentage(patients));
        Assert.assertEquals(40,hospital.getOutStationPatientPercentage(patients));


    }

    @Test
    public void getLocationWisePatientsCount() {

        Hospital hospital = new Hospital(Location.Bangalore);
        List<Patient> patients = patientData.patientsList();

        long indoorPatient = hospital.getIndoorPatient(patients);
        long outdoorPatient = hospital.getOutdoorPatient(patients);

        System.out.println("Total Patients from " + hospital.getLocation() + " : " + indoorPatient);
        System.out.println("Total Outstation Patients : " + outdoorPatient);

        Assert.assertEquals(3,indoorPatient);
        Assert.assertEquals(2,outdoorPatient);
    }

    @Test
    public void getPatientVisitsInLastThreeDays(){
        LocalDate endDate=LocalDate.now();
        LocalDate startDate=LocalDate.now().minusDays(3);

        Visit visit = new Visit(endDate.minusDays(2));
        Visit visit1 = new Visit(endDate);

        Hospital hospital = new Hospital(Location.Bangalore);
        Patient patient = new Patient("ABCD",Location.Bangalore);
        Patient patient1 = new Patient("XSF",Location.Bangalore);
        patient.addVisitsDates(visit);
        patient1.addVisitsDates(visit1);

        hospital.addPatient(patient);
        hospital.addPatient(patient1);

       boolean isPatientVisitedInLast3Days = hospital.patientVisitedInNdays(patient,startDate);
        System.out.println(isPatientVisitedInLast3Days);

       Assert.assertTrue(isPatientVisitedInLast3Days);
    }

    @Test
    public void getTotalVisitsInADayBySinglePatient(){
        LocalDate endDate=LocalDate.now();
        LocalDate startDate=LocalDate.now().minusDays(2);

        Visit visit = new Visit(endDate.minusDays(2));
        Visit visit1 = new Visit(endDate.minusDays(2));
        Visit visit2 = new Visit(endDate.minusDays(2));

        Hospital hospital = new Hospital(Location.Bangalore);
        Patient patient = new Patient("ABCD",Location.Bangalore);
        patient.addVisitsDates(visit);
        patient.addVisitsDates(visit1);
        patient.addVisitsDates(visit2);

        hospital.addPatient(patient);

        long totalNumberOfVisitsInADay = hospital.patientVisitsMultipleTimes(patient,startDate);
        System.out.println("Total Number of Visits in day by Same patient : " + totalNumberOfVisitsInADay);
        Assert.assertEquals(3,totalNumberOfVisitsInADay);
    }


}


