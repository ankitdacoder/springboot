package io.firstspringbootapp.topic;

public class topic {
	private String Id;
	private String name;
	private String description;
	
	public topic() {
	}
	
	/**
	 * @param id
	 * @param name
	 * @param description
	 */
	public topic(String id, String name, String description) {
		super();
		Id = id;
		this.name = name;
		this.description = description;
	}
	/**
	 * @return the id
	 */
	public String getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		Id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
