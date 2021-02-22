import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Student student1 = new Student();

    student1.setName("Arnold Spielberg");
    student1.setGPA(4.0);
    student1.setMajor("Electrical Engineering");

    student1.print();

    Student student2 = new Student();

    student2.name = "Adam James";
    student2.gpa = 4.3;
    student2.major = "Information Systems";

    student2.print();

    ArrayList<Double> gpas = new ArrayList<Double>();
    gpas.add(student1.getGPA());
    gpas.add(student2.getGPA());

    double sumGPA = 0;
    for (Double i : gpas) {
      sumGPA += i;
    }

    System.out.println("The average GPA is " + (sumGPA/gpas.size()));
  }
}