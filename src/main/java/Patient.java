import java.time.LocalDate;


public class Patient {

    private String name;
    private Location location;
    private LocalDate date;

    public Patient(String name , Location location, LocalDate date){
        this.name = name;
        this.location = location;
        this.date = date;
    }

    public Location getLocation() {
        return location;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName(){
        return name;
    }


}

