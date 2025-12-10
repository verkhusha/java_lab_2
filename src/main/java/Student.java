public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String studentId;

    public Student(String firstName, String lastName, int age, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return age == student.age &&
               java.util.Objects.equals(firstName, student.firstName) &&
               java.util.Objects.equals(lastName, student.lastName) &&
               java.util.Objects.equals(studentId, student.studentId);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(firstName, lastName, age, studentId);
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}