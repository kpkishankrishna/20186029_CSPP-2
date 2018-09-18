public class Date {
	private List<Food>food;
	private List<Water>water;
	private List<PhysicalActivity>physicalactivity;
	private List<Weight>weight;
	private List<Sleep>sleep;
	private String date;
	Date() {
		food = new List<Food>();
		water = new List<Water>();
		physicalactivity = new List<PhysicalActivity>();
		weight = new List<Weight>();
		sleep = new List<Sleep>();

	}
	Date(String date) {
		this.date = date;
	}
	

}