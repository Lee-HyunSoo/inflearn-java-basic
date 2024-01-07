package access.a;

public class PublicClassIneerMain {

    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // public 이라 어디서든 접근 가능
        DefaultClass1 defaultClass1 = new DefaultClass1(); // 같은 패키지라 접근 가능
        DefaultClass2 defaultClass2 = new DefaultClass2(); // 같은 패키지라 접근 가능
    }
}
