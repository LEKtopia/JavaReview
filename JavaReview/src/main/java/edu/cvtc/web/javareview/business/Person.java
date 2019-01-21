/**
 * 
 */
package edu.cvtc.web.javareview.business;

import java.util.List;

/**
 * @author gandrews7
 *
 */
public class Person {

	private String firstName;
	private String lastName;
	private int age;
	private String favoriteColor;
	private List<Hobby> hobbies;
	
	/**
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param favoriteColor
	 * @param hobbies
	 */
	public Person(String firstName, String lastName, int age,
			String favoriteColor, List<Hobby> hobbies) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.favoriteColor = favoriteColor;
		this.hobbies = hobbies;
	}
	
	public String getFavoriteColor() {
		return favoriteColor;
	}
	
	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		sb.append("{ ");
		if (null != firstName) {
			sb.append("\"firstName\": \"" + this.firstName + "\"");
		}
		if (null != lastName) {
			sb.append(", \"lastName\": \"" + this.lastName + "\"");
		}
		if (age > 0) {
			sb.append(", \"age\": \"" + this.age + "\"");
		}
		if (null != favoriteColor) {
			sb.append(", \"favoriteColor\": \"" + this.favoriteColor + "\"");
		}
		if (null != hobbies && !hobbies.isEmpty()) {

			sb.append(", \"hobbies\": [ ");
			
			final int listSize = hobbies.size();
			
			for (int j = 0; j < listSize; j++) {
			
				final Hobby hobby = hobbies.get(j);

				if (null != hobby.getName()) {
					sb.append("{ \"name\": \"" + hobby.getName() + "\" }");
				}
				if (null != hobby.getDescription()) {
					sb.append(", { \"description\": \"" + hobby.getDescription() + "\" }");
				}
				if (listSize > 1 && j != listSize) {
					sb.append(",");
				}
			}
			sb.append(" ] ");
		}
		sb.append("}");
		return sb.toString();
	}
	
}
