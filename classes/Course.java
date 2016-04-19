public class Course {
<<<<<<< HEAD
	private int department;
	private int courseNum;
	private String name;
	private char day;
	private int timeSlot; // this should be pulled from period object i think 
	private int credits;
	private String roster[]=new String [20]; //array language

	public void Course (int department, int courseNum, String name, char day, int timeSlot, int credits) {
=======

  private int department;
  private int courseNum;
  private String name;
  private char day;
  private int timeSlot; // this should be pulled from period object i think
  private int credits;
  private int [] roster; //array language

  public void Course(int department, int courseNum, String name, char day, int timeSlot, int credits) {
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD
  public Student[] getRoster(){
    return roster;
  }
  /* need public String toString() and public boolean equals ()
  */
=======

  public Student[] getRoster() {
    return roster;
  }

>>>>>>> refs/remotes/origin/master
}