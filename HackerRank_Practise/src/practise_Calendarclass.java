import java.time.LocalDate;
import java.util.*;
//practise_Calendarclass
public class practise_Calendarclass
{
    String getDay(String month , String day ,  String year)
    {
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        return LocalDate.of(y, m, d).getDayOfWeek().name();
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
         System.out.println("Enter Date");
         String m = sc.next();
         String d = sc.next();
        
        String y = sc.next();
        practise_Calendarclass pcc = new practise_Calendarclass();
//        System.out.println(pcc.getDay("8",  "11", "2001"));
        System.out.println(pcc.getDay(m,d,y));
        sc.close();
        
    }
}