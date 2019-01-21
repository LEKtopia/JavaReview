/**
 * 
 */
package edu.cvtc.web.javareview.business;

/**
 * @author gandrews7
 *
 */
public class Hobby {

	private String name;
	private String description;
	
	/**
	 * @param name
	 * @param description
	 */
	public Hobby(String name, String description) {
		super();
		this.name = name;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		if (null != name) {
			sb.append(name);
		}
		if (null != description) {
			sb.append(" " + description);
		}
		return sb.toString();
	}
	
}
