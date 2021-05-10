import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hospital {

       //private String hospitalName;
       private Location location;
       private List<Patient> patients;


       public Hospital(Location location){
           this.location = location;
           patients = new ArrayList<>();
       }

    public Location getLocation(){
           return location;
       }

    public long getIndoorPatient(List<Patient>patientsList) {
        return  patientsList.stream()
                .filter(patient1 -> patient1.getLocation().equals(Location.Bangalore)).count();

    }
    public long getOutdoorPatient(List<Patient>patientsList) {
        return patientsList.size() - getIndoorPatient(patientsList);
    }

    public long getIndoorPatientPercentage(List<Patient>patientsList){
           return (getIndoorPatient(patientsList)*100/getTotalPatientVisited(patientsList));
    }

    public long getOutStationPatientPercentage(List<Patient>patientsList){
        return (getOutdoorPatient(patientsList)*100/getTotalPatientVisited(patientsList));
    }

    public boolean addPatient(Patient patient) {
        return patients.add(patient);
    }

    public int getTotalPatientVisited(List<Patient>patients){
          return patients.size();
    }

    public boolean patientVisitedInNdays(Patient patient, LocalDate date){
         List<Visit> visits =  patient.getVisitList();
         return visits.stream().anyMatch(visit -> visit.getVisitDate().isAfter(date));
    }

    public long patientVisitsMultipleTimes(Patient patient, LocalDate date){
        List<Visit> visits =  patient.getVisitList();
        return visits.stream().filter(visit -> visit.getVisitDate().isEqual(date)).count();
    }
}

