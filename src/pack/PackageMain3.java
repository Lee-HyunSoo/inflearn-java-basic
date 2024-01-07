package pack;

import pack.a.User;

public class PackageMain3 {

    public static void main(String[] args) {
        User userA = new User();
        // 이미 User 라는 클래스를 import 했기 때문에 한쪽은 패키지 경로를 다 적어줘야 한다.
        pack.b.User userB = new pack.b.User();
    }
}
