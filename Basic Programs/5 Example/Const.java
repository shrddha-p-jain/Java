// Default constructor
class Student_Default{
int roll_no;
String name;
float percentage;
}

// Non - parameterized constructor
class Student_non_p{
int roll_no;
String name;
float percentage;
Student_non_p() {
roll_no = 10;
name = "ABC";
percentage = 50;
}
}

//Paremeterized Constructor
class Student_p{
int roll_no;
String name;
float percentage;
Student_p(int roll, String n,float f){
roll_no = roll;
name = n;
percentage = f;
}
}
class Const {
  public static void main(String[] args) {
Student_Default s_d = new Student_Default();
Student_non_p s_n = new Student_non_p();
Student_p s_p = new Student_p(11,"XYZ",55);
System.out.println(s_d.roll_no+" "+s_d.name+" "+s_d.percentage);
System.out.println(s_n.roll_no+" "+s_n.name+" "+s_n.percentage);
System.out.println(s_p.roll_no+" "+s_p.name+" "+s_p.percentage);
}
}