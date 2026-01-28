class Student {
    private int id;
    private String name;
    private double cgpa;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Invalid CGPA! Must be between 0.0 and 4.0");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(101);
        s.setName("Md. Khalid Hasan");
        s.setCgpa(3.76);
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        System.out.println("CGPA: " + s.getCgpa());
        s.setCgpa(4.88);   
    }
}
