package fr.diginamic.dates;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TestDates {

	public static void main(String[] args) throws ParseException {
//		 System.out.println(java.time.LocalDate.now());
		
		
			// Etape 1
		 	Date date = new Date();
		 
			SimpleDateFormat formateur = new SimpleDateFormat("dd-MM-yyyy");
			String chaineFormatee = formateur.format(date);
			
			System.out.println(chaineFormatee);

			//Etape 2
			SimpleDateFormat formateurComplet = new SimpleDateFormat(" 'date du ' dd MMMM yyyy 'et' ss 'secondes'");
			System.out.println(formateurComplet.format(date));
	  }

}
