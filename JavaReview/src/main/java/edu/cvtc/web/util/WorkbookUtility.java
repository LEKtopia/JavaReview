/**
 * 
 */
package edu.cvtc.web.util;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import edu.cvtc.web.javareview.business.Hobby;
import edu.cvtc.web.javareview.business.Person;

/**
 * @author Project Skeleton
 *
 */
public class WorkbookUtility {
	
	public static List<Person> retrievePeopleFromWorkBook(final File file) throws InvalidFormatException, IOException {
		
		final Workbook workbook = WorkbookFactory.create(file);
		final Sheet sheet = workbook.getSheetAt(0);
		final List<Person> people = new ArrayList<>();
		
		for (Row row : sheet) {
			
			final Cell firstName = row.getCell(0);
			final Cell lastName = row.getCell(1);
			final Cell age = row.getCell(2);
			final Cell favoriteColor = row.getCell(3);
			final Cell hobby1 = row.getCell(4);
			final Cell hobby2 = row.getCell(5);
			
			final List<Hobby> hobbies = new ArrayList<Hobby>();
			
			if (null != hobby1) {
				hobbies.add(new Hobby(hobby1.getStringCellValue(), null));
			}
			if (null != hobby2) {
				hobbies.add(new Hobby(hobby2.getStringCellValue(), null));
			}
			
			final Person person = new Person(
					firstName.getStringCellValue().trim(), 
					lastName.getStringCellValue().trim(), 
					(int) age.getNumericCellValue(), 
					favoriteColor.getStringCellValue().trim(), 
					hobbies);
			people.add(person);
		}
		return people;
	}
	
}
