package Academy.model;

public class Academy {

	//name. birth. tel. address. major. itcourse. tribute. scores. attend. survey
	private String name;
	private String birth;
	private String tel;
	private String address;
	private String major;
	private String itcourse;
	private int tribute;	// String으로 변경할 수도 ... 품목을 적는다면 0ㅁ 0
	private int scores;
	private int attend;
	private String survey;
	
	public Academy() { }
	public Academy(String name, String birth, String tel, String address, String itcourse, int tribute, int scores, int attend, String survey) {
		this.name = name;
		this.birth = birth;
		this.tel = tel;
		this.address = address;
		this.itcourse = itcourse;
		this.tribute = tribute;
		this.scores = scores;
		this.attend = attend;
		this.survey = survey;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getItcourse() {
		return itcourse;
	}
	public void setItcourse(String itcourse) {
		this.itcourse = itcourse;
	}
	public int getTribute() {
		return tribute;
	}
	public void setTribute(int tribute) {
		this.tribute = tribute;
	}
	public int getScores() {
		return scores;
	}
	public void setScores(int scores) {
		this.scores = scores;
	}
	public int getAttend() {
		return attend;
	}
	public void setAttend(int attend) {
		this.attend = attend;
	}
	public String getSurvey() {
		return survey;
	}
	public void setSurvey(String survey) {
		this.survey = survey;
	}
	
	
	
}
