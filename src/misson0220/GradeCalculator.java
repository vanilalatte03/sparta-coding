package misson0220;

public class GradeCalculator {
    public static void main(String[] args) {
        int[] scores = {70, 92, 87, 98, 75};

        int total = 0;
        for (int i = 0; i < scores.length; i++) {
            total += scores[i];
        }

        double average = 0.0;
        average = (double) total / scores.length;

        char grade;

        if(average >= 90){
            grade = 'A';
        } else if (average >= 80){
            grade = 'B';
        } else if (average >= 70){
            grade = 'C';
        } else if (average >= 60){
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("=== 성적 계산기 ===");
        System.out.println("학점: " + grade);
    }
}
