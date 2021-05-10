import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Patient {

    private String name;
    private Location location;
    public List<Visit> visitList;

    public Patient(String name , Location location){
        this.name = name;
        this.location = location;
        visitList = new ArrayList<Visit>();
    }

    public Location getLocation() {
        return location;
    }

    public void addVisitsDates(Visit... visit){
        Collections.addAll(visitList,visit);
    }

    public List<Visit> getVisitList(){
        return visitList;
    }

}

