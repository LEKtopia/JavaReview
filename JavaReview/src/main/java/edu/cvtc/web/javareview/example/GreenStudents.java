package edu.cvtc.web.javareview.example;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import edu.cvtc.web.javareview.business.Person;
import edu.cvtc.web.util.WorkbookUtility;

/**
 * @author Project Skeleton
 *
 */
public class GreenStudents {

	private static final String INPUT_FILE = "../JavaReview/WebContent/assets/JavaWebProgramming.xlsx";
	
	/**
	 * @param args
	 * @throws IOException 
	 * @throws InvalidFormatException 
	 */
	public static void main(String[] args) throws InvalidFormatException, IOException {
		
		final List<Person> people = WorkbookUtility.retrievePeopleFromWorkBook(new File(INPUT_FILE));
		
		for (Person person : people) {
			if (person.getFavoriteColor().equalsIgnoreCase("green")) {
				System.out.println(person);
			}
		}
		
	}

}
