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


    public int totalIndoorPatientCountInNdays() {
        int count = 0;
        for (Patient p : patientList) {
            if (p.getDate().isBefore(LocalDate.now()) || p.getDate().isAfter(LocalDate.now().minusDays(3))) {
                if (p.getLocation().equals(Location.Bangalore)) {
                    count++;
                }
            }
        }
        return count;
    }

    public int totalOutdoorPatientCountInNdays() {
        for (Patient p : patientList) {
            if (p.getDate().isBefore(LocalDate.now()) || p.getDate().isAfter(LocalDate.now().minusDays(3))) {
                return patientList.size() - totalIndoorPatientCountInNdays();
            }
        }
        return 0;
    }

    public int getIndoorPatientPercentageInNDays() {
      return totalIndoorPatientCountInNdays() * 100 / getTotalPatientVisited();
    }

    public int getOutdoorPatientPercentageInNDays() {
        return totalOutdoorPatientCountInNdays() * 100 /getTotalPatientVisited();
    }
}

