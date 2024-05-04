package system;

import java.util.ArrayList;

public class Instructor extends Account
{
   ArrayList<Course>taughtCourses=new ArrayList();
   
   public Instructor(String userName,String fullName,String password , String email , double credit , int age , ArrayList<Course> taughtCourses)
   {
      super(userName, fullName,password , email ,  credit ,  age);
      this.taughtCourses=taughtCourses;
   }

    public ArrayList<Course> getTaughtCourses() {
        return taughtCourses;
    }

    public void setTaughtCourses(ArrayList<Course> taughtCourses) {
        this.taughtCourses = taughtCourses;
    }
   
   
   @Override
   public String getUserName()
   {
      return this.userName;
   }
   
   @Override
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

   

   @Override
    public void setPassword(String password) {
        this.password = password;
    }


   @Override
    public void setCredit(double credit) {
        this.credit = credit;
    }

   @Override
    public void setAge(int age) {
        this.age = age;
    }

   @Override
    public String getFullName() {
        return fullName;
    }

   @Override
    public String getLanguage() {
        return language;
    }

   @Override
    public String getPassword() {
        return password;
    }

   @Override
    public String getEmail() {
        return email;
    }

   @Override
    public double getCredit() {
        return credit;
    }

   @Override
    public int getAge() {
        return age;
    }
   
   
   
   
   @Override
   public  void changeLanguage(String lang){
   this.language=lang;
   }
   
   @Override
   public  void changeUserName(String name){
   this.userName=name;
   }
   
   @Override
    public  void changeEmail(String email){
    this.email=email;
    }
   
    
   @Override
   public  void displayInfo(){
       System.out.println(userName +"info:");
       System.out.println("full Name:"+fullName);
       System.out.println("password :"+password);
       System.out.println("email:"+email);
       System.out.println("credit:"+credit);
       System.out.println("age:"+age);
       
       
   }

    @Override
    public String toString() {
        return "Instructor{" + "taughtCourses=" + taughtCourses + '}';
    }

    public void withdrawCredit (double credit){
        if(credit<0)
            System.out.println("invalid credit");
        else if(credit<this.credit)
            System.out.println("there is not enough credit");
        else 
        this.credit-=credit;
    }
   
   
   
   
   
   // this method should create course then add the course to the system.
   // use course class constrcutor
   public void createCourse(String title, String description, String[] content, String catagory, String difficulty, double price, int estimatedHours)
   {
       Certificate certificate=new Certificate();
       
      Course newCourse =new Course(this,title,description,content,catagory,difficulty,price,estimatedHours,certificate);
      
      
   }
   
   public void addCourseWorks (){
       
   }
   
}
