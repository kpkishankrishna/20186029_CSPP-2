public class Sleep {
	private String starttime;
	private String endtime;
	Sleep(String starttime, String endtime) {
		this.starttime = starttime;
		this.endtime = endtime;
	}
	public String getstarttime() {
		return starttime;
	}
	public String getendtime() {
		return endtime;
	}
}