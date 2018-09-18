public class Food{
	private String item;
	private double calories;
	private String time;
	Food(String item, double calories, String time) {
		this.item = item;
		this.calories = calories;
		this.time = time;
	}
	public String getitem() {
		return item;
	}
	public double getcalories() {
		return calories;
	}
	public String gettime() {
		return time;
	}
}