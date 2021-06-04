import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private Location location;
    private List<Patient> patientList;

    public Hospital(Location location) {
        this.location = location;
        patientList = new ArrayList<>();
    }

    public Location getLocation() {
        return location;
    }

    public long getIndoorPatient() {
        return patientList.stream()
                .filter(patient1 -> patient1.getLocation().equals(Location.Bangalore)).count();

    }

    public long getOutdoorPatient() {
        return getTotalPatientVisited() - getIndoorPatient();
    }

    public long getIndoorPatientPercentage() {
        return (getIndoorPatient() * 100 / getTotalPatientVisited());
    }

    public long getOutStationPatientPercentage() {
        return (getOutdoorPatient() * 100 / getTotalPatientVisited());
    }

    public void addPatient(Patient patient) {
        patientList.add(patient);
    }

    public int getTotalPatientVisited() {
        return patientList.size();
    }


    public long totalIndoorPatientCountInNdays() {

        return patientList.stream().filter(patient ->patient.getDate().isBefore(LocalDate.now())
        || patient.getDate().isAfter(LocalDate.now().minusDays(3))).filter(patient -> patient.getLocation()
        .equals(Location.Bangalore)).count();

    }

    public long totalOutdoorPatientCountInNdays() {
       return patientList.stream().filter(patient -> patient.getDate().isBefore(LocalDate.now())
        || patient.getDate().isAfter(LocalDate.now().minusDays(3))).count() - totalIndoorPatientCountInNdays();

    }

    public long getIndoorPatientPercentageInNDays() {
      return totalIndoorPatientCountInNdays() * 100 / getTotalPatientVisited();
    }

    public long getOutdoorPatientPercentageInNDays() {
        return totalOutdoorPatientCountInNdays() * 100 /getTotalPatientVisited();
    }
}

