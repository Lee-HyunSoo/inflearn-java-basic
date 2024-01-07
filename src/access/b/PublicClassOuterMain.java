package access.b;

import access.a.PublicClass;

public class PublicClassOuterMain {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // public 이라 다른 패키지에서 호출 가능
//        DefaultClass1 defaultClass1 = new DefaultClass1(); // default 는 다른 패키지에서 호출 불가
//        DefaultClass2 defaultClass2 = new DefaultClass2(); // default 는 다른 패키지에서 호출 불가
    }
}
