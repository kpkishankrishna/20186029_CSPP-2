public class PhysicalActivity {
	private String activity;
	private String starttime;
	private String endtime;
	private String notes;
	PhysicalActivity(String activity, String starttime, 
		String endtime, String notes) {
		this.activity = activity;
		this.starttime = starttime;
		this.endtime = endtime;
		this.notes = notes;
	}
	public String getactivity() {
		return activity;
	}
	public String getstarttime() {
		return starttime;
	}
	public String getendtime() {
		return endtime;
	}
	public String getnotes() {
		return notes;
	}
}