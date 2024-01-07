package super2;

public class ClassC extends ClassB {

    public ClassC() {
        super(10, 20); // ClassB 에 파라미터가 없는 기본 생성자가 없기 때문에 super 생략 불가능
        System.out.println("ClassC 생성자");
    }
}
