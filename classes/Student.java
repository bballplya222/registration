package registration.classes;

public class Student{
  private String firstName;
  private String lastName;
  private int id;
  private int gradYear;
  private Course schedule[]= new Course [6];

  public Student (String firstName, String lastName, int id, int gradYear){
    this.firstName=firstName;
    this.lastName=lastName;
    this.id=id;
    this.gradYear=gradYear;
  }
  //need to track number of courses each student is registered in
  public String getFirstName(){
    return firstName;
  }
  public String getLastName(){
    return lastName;
  }
  public int getId(){
    return id;
  }
  public int getGradYear(){
    return gradYear;
  }
  public Course[] getSchedule(){
    return schedule; //review array syntax 
  }

  public String toString(){
    return id+": "+lastName+", "+firstName+" - "+gradYear;//not sure if return will work like this
  }
  public boolean equals(Student other){
    if (id==other.id){
      return true;
    }else{
      return false;
    }
    }
}