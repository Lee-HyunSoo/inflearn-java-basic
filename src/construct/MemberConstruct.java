package construct;

public class MemberConstruct {

    String name;
    int age;
    int grade;

    // 생성자 추가
    public MemberConstruct(String name, int age) {
        // 자기 자신의 생성자 호출로 변경
        this(name, age, 50);
    }

    public MemberConstruct(String name, int age, int grade) {
        System.out.println("생성자 호출 name: " + name + ", age: " + age + ", grade: " + grade);
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
