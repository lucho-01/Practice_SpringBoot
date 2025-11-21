package app.domain.models;

public class TacticalMessage {

	private long id;
	private long pilarId;
	private String contentFragmented;
	private String contentRebuilt;
	private String timestamp;
	public void setId(long id) {
		this.id = id;
	}
	public void setPilarId(long pilarId) {
		this.pilarId = pilarId;
	}
	public void setContentFragmented(String contentFragmented) {
		this.contentFragmented = contentFragmented;
	}
	public void setContentRebuilt(String contentRebuilt) {
		this.contentRebuilt = contentRebuilt;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public long getId() {
		return id;
	}
	public long getPilarId() {
		return pilarId;
	}
	public String getContentFragmented() {
		return contentFragmented;
	}
	public String getContentRebuilt() {
		return contentRebuilt;
	}
	public String getTimestamp() {
		return timestamp;
	}
}
