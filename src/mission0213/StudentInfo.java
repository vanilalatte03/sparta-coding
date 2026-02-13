package mission0213;

public class StudentInfo {
    public static void main(String[] args) {
        String name = "지호";
        int age = 22; //만 나이
        double height = 180.1;
        char grade = '4';
        boolean isStudent = false;

        System.out.println("=== 학생 정보 ===");
        System.out.println("이름: " + name);
        System.out.println("나이: " + age + "세");
        System.out.println("키: " + height + "cm");
        System.out.println("학년: " + grade + "학년");
        System.out.println("재학중: " + isStudent);
    }
}
