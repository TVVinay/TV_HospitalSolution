import java.time.LocalDate;

public class Visit {
   
    public LocalDate date;

    public Visit(LocalDate date){
        this.date = date;
    }
    public LocalDate getVisitDate(){
        return date;
    }


}
