package app.domain.models;


public class Enemy {

	private long id;
	private String name;
	private String positionPossible;
	private String ConfidenceLevel;
	private String description;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPositionPossible() {
		return positionPossible;
	}
	public void setPositionPossible(String positionPossible) {
		this.positionPossible = positionPossible;
	}
	public String getConfidenceLevel() {
		return ConfidenceLevel;
	}
	public void setConfidenceLevel(String confidenceLevel) {
		ConfidenceLevel = confidenceLevel;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
