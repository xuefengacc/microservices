package micro.model;

public class Term {

	private long termId;
	private String termName;
	private String category;
    private int dateTime;
    private String area;
    private String site;
    private String filePath;
    
	public long getTermId() {
		return termId;
	}
	public void setTermId(long termId) {
		this.termId = termId;
	}
	public String getTermName() {
		return termName;
	}
	public void setTermName(String termName) {
		this.termName = termName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getDateTime() {
		return dateTime;
	}
	public void setDateTime(int dateTime) {
		this.dateTime = dateTime;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
}
