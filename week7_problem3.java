package labweek7progs;

import java.util.Scanner;

abstract class Marks{
  abstract void getPercentage();
}
class A extends Marks{
  int m1,m2,m3;
  A(int s1,int s2,int s3)
  {
  m1=s1;
  m2=s2;
  m3=s3;
  }
  public void getPercentage()
  {
    double per=(double)(m1+m2+m3)/3;
    System.out.println("Percentage of student 1="+per+"%");
  }
}
class B extends Marks{
  int m1,m2,m3,m4;
  B(int s1,int s2,int s3,int s4)
  {
    m1=s1;
    m2=s2;
    m3=s3;
    m4=s4;
  }
  public void getPercentage()
  {
    double per=(double)(m1+m2+m3+m4)/4;
    System.out.println("Percentage of student 2="+per+"%");
  }
}

public class week7_problem3 {

  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int s1,s2,s3,s4;
    System.out.println("Enter marks of student 1 in 3 subjects");
    s1=s.nextInt();
    s2=s.nextInt();
    s3=s.nextInt();
    A p=new A(s1,s2,s3);
    p.getPercentage();
    System.out.println("Enter marks of student 2 in 4 subjects");
    s1=s.nextInt();
    s2=s.nextInt();
    s3=s.nextInt();
    s4=s.nextInt();
    B q=new B(s1,s2,s3,s4);
    q.getPercentage();
    s.close();
    

  }

}