
import java.time.LocalDate;

public class DateDemo {
    public static void main(String[] args) {
        // System.out.println(System.currentTimeMillis()/86400000);
        
        //find age
        // LocalDate curDate = LocalDate.now(); 
        // LocalDate bDate = LocalDate.of(2001,06,18); 
        // System.out.println(Period.between(bDate, curDate).getYears());

        LocalDate date1 = LocalDate.of(2000,06,18);
        LocalDate date2 = LocalDate.of(2001,06,18);

        if(date1.isAfter(date2)){
            System.out.println("Date 1 is after");
        }else if(date1.isBefore(date2)){
            System.out.println("Date 1 is earlier");
        }else{
            System.out.println("Same date");
        }

    }
}
