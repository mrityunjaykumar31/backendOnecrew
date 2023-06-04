package com.assesemnetApp.assesemnetApp.services;

import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.Arrays;
import java.util.Random;
import java.util.TimeZone;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.sql.Timestamp;

@Service
public class UtilsService {

	
	
	
	public Object[] getRandomObjects(Object[] objects, int slicedquantity ) {
        // Original array of objects
      
        // Create a copy of the original array
        Object[] shuffledArray = Arrays.copyOf(objects, objects.length);

        // Shuffle the array using the Fisher-Yates algorithm
        Random random = new Random();
        for (int i = shuffledArray.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);
            Object temp = shuffledArray[i];
            shuffledArray[i] = shuffledArray[j];
            shuffledArray[j] = temp;
        }

        // Select the first 10 elements from the shuffled array
        if(slicedquantity < objects.length) {
        	slicedquantity = slicedquantity;
        } else {
        	slicedquantity = objects.length;
        }
        Object[] randomObjects = Arrays.copyOf(shuffledArray, slicedquantity);

        return randomObjects;
    }

	public static Timestamp parseSqlDate (String dateString)throws DateTimeParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	        DateTimeFormatter formatter6= DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");; 
	       /// Date parsedDate = (Date) dateFormat.parse(dateString);
//	        Date parsedDate = dateFormat.parse(dateString);
//	        new java.sql.Date(utilDate.getTime());
//	        return  (Date) formatter6.parse(dateString);
	       // Date parsedDate = dateFormat.parse(dateString);
	     //   SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy HH:mm");
	       // formatter6.setTimeZone(TimeZone.getTimeZone("UTC"));
	      // java.util.Date parsedDate = formatter6.parse(dateString);
	        // Convert java.sql.Date to java.util.Date
	      //  java.util.Date utilDate = new java.util.Date(parsedDate.getTime());
	       
	        java.util.Date parsedDate = null;
			try {
				parsedDate = dateFormat.parse(dateString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        return new Timestamp(parsedDate.getTime());
	    
	}
}
