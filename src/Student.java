public class Student {

    private int id;
    private String firstName;
    private String lastName;

    private int age;
    private int yearLevel;
    private static int studentCount;

    public Student(String fName, String lName, int uAge, int uYearLevel) {
        firstName = fName;
        lastName = lName;
        age = uAge;
        yearLevel = uYearLevel;
        id = studentCount++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearLevel() {
        return yearLevel;
    }

    public void setYearLevel(int yearLevel) {
        this.yearLevel = yearLevel;
    }

    public static int getStudentCount() {
        return studentCount;
    }

    public boolean equals(Student n){
        if(this.firstName == n.firstName && this.lastName == n.lastName && this.age == n.age && this.yearLevel == n.yearLevel) {
            return true;
        } else {
            return false;
        }

    }

    public String toString(){
        return "Student{id=" + id + ", firstName='" + firstName + "', lastName='" + lastName + "', age=" + age + "}";
    }


}
