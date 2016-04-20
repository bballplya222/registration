public class Course {

	private int department;
	private int courseNum;
	private String name;
	private char day;
	private Period timeSlot; // this should be pulled from period object i think 
	private int credits;
	private Student roster[] = new Student [20]; //array language

  public Course(int department, int courseNum, String name, char day, int timeSlot, int credits) {
    this.department = department;
    this.courseNum = courseNum;
    this.name = name;
    this.day = day;
    this.timeSlot = timeSlot;
    this.credits = credits;
  }

  public int getDepartment() {
   return department;
  }

  public int getCourseNum() {
    return courseNum;
  }

  public String getName() {
    return name;
  }

  public Period getPeriod() {
    return timeSlot; //this is supposed to return the period
  }

  public int getCredits() {
    return credits;
  }

  public Student[] getRoster(){
    return roster;
  }
  // need public String toString() and public boolean equals ()
}