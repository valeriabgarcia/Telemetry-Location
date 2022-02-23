package br.com.golsat.location;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class LocationTest {

	public static void main(String[] args) {
		
		Location place = new Location();
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-yyyy hh:mm:ss a z");
		place.setTimestamp(simpleDateFormat.format(new Date()));		
			
		System.out.println("Inform the Latitude: ");
		place.setLatitude(new Scanner(System.in).nextDouble());
		
		System.out.println("Inform the Longitude: ");
		place.setLongitude(new Scanner(System.in).nextDouble());
		
		System.out.println("Date: " + place.getTimestamp());
		System.out.println("Latitude: " + place.getLatitude());
		System.out.println("Longitude: " + place.getLongitude());
		
				

	}

}
