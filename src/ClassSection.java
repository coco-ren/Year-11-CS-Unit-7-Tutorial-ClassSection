import java.util.ArrayList;
public class ClassSection {

    private String subject;

    private int capacity;

    private int yearLevel;

    private ArrayList<Student> students = new ArrayList();

    public ClassSection(String subject, int capacity, int yearLevel){
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void addStudent(Student uStudent) {
        if (students.size() <= capacity && uStudent.getYearLevel() == yearLevel && isStudentEnrolled(uStudent)==false) {
            students.add(uStudent);
        }
    }

    public void removeStudent(Student userStudent) {
        students.remove(userStudent);
    }

    public boolean isStudentEnrolled(Student student) {
        if(students.contains(student)){
                return true;
            }
        return false;
    }

    public String toString(){
        return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", students=" + students + "}";
    }



    }


