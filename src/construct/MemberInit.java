package construct;

public class MemberInit {

    String name;
    int age;
    int grade;

    // 파라미터의 이름이 같을 경우엔 가까운 변수가 우선순위를 가진다.
    // 현재 필드변수보다 파라미터가 메서드 입장에서 더 가깝기 때문에 this 를 안붙이면 다 파라미터로 취급된다.
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
