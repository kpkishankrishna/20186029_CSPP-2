public class Task {
	private String tasktitle;
	private String nameofperson;
	private int minutes;
	private boolean important;
	private boolean urgent;
	private String status;
	Task(String tasktitle, String nameofperson, int minutes, boolean important,
		boolean urgent, String status) {
		this.tasktitle = tasktitle;
		this.nameofperson = nameofperson;
		this.minutes = minutes;
		this.important = important;
		this.urgent = urgent;
		this.status = status;
	}
	public String toString() {
		String one = "";
		String two = "";
		if (urgent){
			one = "Urgent";
		} else {
			one = "Not Urgent";
		}
		if (important) {
			two = "Important";
		} else {
			two = "Not Important";
		}
		return (tasktitle + ", " + nameofperson + ", " + minutes + ", " + two + ", " + one + ", " + status);

	}

}
