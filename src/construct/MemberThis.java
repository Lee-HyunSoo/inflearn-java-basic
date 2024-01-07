package construct;

public class MemberThis {

    String nameField;

    // 멤버변수 이름 != 파라미터 이름 이기 때문에 멤버변수를 가져다 쓴다.
    void initMember(String nameParameter) {
        nameField = nameParameter;
    }
}
