package com.in28minutes.mockito.mockitodemo;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SomeBusinessImpl {
	private DataService dataService;

	int findTheGreatestFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;

		for (int value : data) {
			if (value > greatest) {
				greatest = value;
			}
		}
		return greatest;
	}

}