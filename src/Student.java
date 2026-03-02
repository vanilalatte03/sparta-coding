public class Student {
    // TODO: 속성(필드) 선언
    String name;
    String studentId;
    int grade;
    double gpa;

    public Student(String name, String studentId, int grade, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.grade = grade;
        this.gpa = gpa;
    }

    // TODO: study 메서드 구현
    public void study() {
        System.out.println("열심히 공부하고 있습니다!\n");
    }

    // TODO: showInfo 메서드 구현
    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("학번: " + studentId);
        System.out.println("학년: " + grade + "학년");
        System.out.println("학점: " + gpa);
        System.out.println("우등생 여부: " + isHonorStudent());
    }

    // TODO: isHonorStudent 메서드 구현
    public boolean isHonorStudent() {
        if(gpa >= 3.5){
            return true;
        } else {
            return false;
        }
    }
}
