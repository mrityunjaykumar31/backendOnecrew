package com.assesemnetApp.assesemnetApp.services;

import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.Random;

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
}
