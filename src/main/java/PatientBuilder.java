import java.time.LocalDate;

public class PatientBuilder {

    private String name;
    private Location location;
    private LocalDate date;

    public PatientBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PatientBuilder setLocation(Location location) {
        this.location = location;
        return this;
    }

    public PatientBuilder setDate(LocalDate date) {
        this.date = date;
        return this;
    }

    public Patient getPatientBuilder(){
        return new Patient(name,location,date);
    }
}
