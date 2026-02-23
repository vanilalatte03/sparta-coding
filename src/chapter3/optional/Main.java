package chapter3.optional;

import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CampService campService = new CampService();

        System.out.println("캠프에서 찾고 싶은 수강생의 이름을 입력하세요: ");
        String name = scanner.nextLine();

        Optional<Student> studentOptional = campService.findStudentByName(name);
        if(studentOptional.isPresent()){
            Student student = studentOptional.get();
            System.out.println("캠프에 " + student.getName() + " 수강생이 존재합니다.");
        } else {
            System.out.println("캠프에 수강생이 존재하지 않습니다.");
        }


        /*Camp camp = new Camp();
     *//*   Student student = camp.getStudent().
                orElseGet(() -> new Student("미등록 학생"));*//*

        Optional<Student> studentOptional = camp.getStudent();

        boolean flag = studentOptional.isPresent();
        if(flag) {
            Student student = studentOptional.get();
            String studentName = student.getName();
            System.out.println("studentName = " + studentName);
        } else {
            System.out.println("학생이 없습니다.");
        }*/
    }
}
