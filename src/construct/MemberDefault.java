package construct;

public class MemberDefault {

    String name;

    // 자바가 자동으로 생성해주시는 기본 생성자는 클래스와 같은 접근 제어자를 가진다.
    public MemberDefault() {
        System.out.println("생성자 호출");
    }
}
