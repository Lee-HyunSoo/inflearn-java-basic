package class1;

public class ClassStart2 {

    public static void main(String[] args) {
        String[] studentNames = {"학생1", "학생2"};
        int[] ages = {15, 16};
        int[] grade = {90, 80};

        for (int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + ages[i] + " 성적: " + grade[i]);
        }
    }
}
