import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Hospital {

       //private String hospitalName;
       private Location location;


       public Hospital(Location location){
           this.location = location;

       }

    public Location getLocation(){
           return location;
       }

    public long getIndoorPatient(List<Patients>patientsList) {
        return  patientsList.stream()
                .filter(patient1 -> patient1.getLocation().equals(Location.Bangalore)).count();

    }

    public long getOutdoorPatient(List<Patients>patientsList) {
        return patientsList.size() - getIndoorPatient(patientsList);
    }

}

