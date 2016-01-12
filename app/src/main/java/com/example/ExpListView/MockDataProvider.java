package com.example.ExpListView;

import java.util.Random;    
import com.example.ExpListView.Bike;  
import com.example.ExpListView.Bus;  
import com.example.ExpListView.Car;  
import com.example.ExpListView.Vehicle;    
public class MockDataProvider {      
	// A utility method that generates random Vehicles      
	public static Vehicle getRandomVehicle(String name) {          
		Vehicle vehicle = null;          
		Random random = new Random();          
		int type = random.nextInt(3);          
		switch (type) {              
		case 0:                  
			vehicle = new Car(name);                  
			break;              
		case 1:                  
			vehicle = new Bus(name);                  
			break;              
		case 2:                  
			vehicle = new Bike(name);                  
			break;          
		}          
		return vehicle;      
   }  
}  

