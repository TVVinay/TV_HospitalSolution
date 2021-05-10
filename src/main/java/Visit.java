import java.time.LocalDate;

public class Visit {
   
    private LocalDate date;

    public Visit(LocalDate date){
        this.date = date;
    }
    public LocalDate getVisitDate(){
        return date;
    }


}
