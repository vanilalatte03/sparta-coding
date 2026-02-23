package chapter3.optional;

import java.util.Optional;

public class CampService {

    public static Student[] students = {
        new Student("jiho"),
        new Student("jiho2"),
        new Student("jiho3")
    };

    public Optional<Student> findStudentByName(String name) {
        for (Student student : students) {
            String studentName = student.getName();
            if (studentName.equals(name)) {
                return Optional.of(student);
            }
        }
        return Optional.empty();
    }
}
