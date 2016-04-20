package registration.classes;

public class Period{
  private int timeSlot;
  private char day;
// need to reevaluate this constructor and how it'll work with the rest of the program? 
  public Period(char day, int timeSlot){
    this.day= day;
    this.timeSlot= timeSlot;
  }
  public char GetDay(){
    return day;
  }
  public int GetTimeSlot(){
    return timeSlot;
  }
  public String toString(){
    return ""+this.day+this.timeSlot; //check this before submitting
  }
  // need compare to method, Java has this built in....?
}