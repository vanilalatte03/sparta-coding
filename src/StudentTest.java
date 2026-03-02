public class StudentTest {
    public static void main(String[] args) {
        System.out.println("=== 학생 관리 시스템 ===");

        // TODO: Student 객체 3개 생성 및 정보 설정
        Student student1 = new Student("민자바", "2024001", 2, 3.8);
        Student student2 = new Student("이파이썬", "2024002", 1, 3.2);
        Student student3 = new Student("임지호", "2022661081", 2, 4.17);


        // TODO: 각 학생 정보 출력 및 메서드 테스트
        System.out.println("[학생 1]");
        student1.showInfo();
        student1.study();

        System.out.println("[학생 2]");
        student2.showInfo();
        student2.study();

        System.out.println("[학생 3]");
        student3.showInfo();
        student3.study();
    }
}
