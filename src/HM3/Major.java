package HM3;

public enum Major {
	
	Math("MTH"),Physique("PHY"),Science("SCI"),Technology("TECH"),Literary("LIT");
	private Major(String major) {this.major=major;};
	public String getMajor() {  return major;	}
	private String major;
}
