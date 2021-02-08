package fr.diginamic.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

   public static void main(String[] args) {
	   
	   
	   // Etape 1
	   Calendar cal = Calendar.getInstance();
	   cal.set(2016, 4, 19, 23, 59, 30);
	   
	   Date date = cal.getTime();
	   
	   
	   SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
	   String chaineFormatee = formateur.format(date);
	   

	   System.out.println(chaineFormatee);
	   
	   
  
       DateFormat format = new SimpleDateFormat(" 'date du : 'EEEE dd MMMM yyyy 'et' ss 'secondes'", Locale.GERMANY);
   
       
       Calendar calendar = Calendar.getInstance();
       System.out.println(format.format(calendar.getTime()));

   }
}