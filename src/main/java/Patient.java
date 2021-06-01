import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

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


}

