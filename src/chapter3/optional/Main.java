package chapter3.optional;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Camp camp = new Camp();
     /*   Student student = camp.getStudent().
                orElseGet(() -> new Student("미등록 학생"));*/

        Optional<Student> studentOptional = camp.getStudent();

        boolean flag = studentOptional.isPresent();
        if(flag) {
            Student student = studentOptional.get();
            String studentName = student.getName();
            System.out.println("studentName = " + studentName);
        } else {
            System.out.println("학생이 없습니다.");
        }
    }
}
