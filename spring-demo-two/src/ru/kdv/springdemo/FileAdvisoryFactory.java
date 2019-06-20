package ru.kdv.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class FileAdvisoryFactory implements AdviseFactory {
	
	@Value("${fileName}")
	private String fileName;
	
	private List<String> advisories;
	
	@PostConstruct
	private void getAdvisoryFromFile() {
		System.out.println(fileName);
		File file = new File(fileName);
		System.out.println("Is file exists? "+file.exists());
		if(file.exists()) {
			advisories = new ArrayList<String>();
			
			try (BufferedReader br = new BufferedReader(
					new FileReader(fileName))) {
				String tempLane;
				
				while((tempLane = br.readLine())!= null) {
					advisories.add(tempLane);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
	
	@Override
	public String getAdvise() {
		Random rand = new Random();
		return advisories.get(rand.nextInt(advisories.size()));
	}

}
