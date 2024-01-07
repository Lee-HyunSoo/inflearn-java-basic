package static1;

public class Data3 {

    public String name;
    public static int count; // static

    public Data3(String name) {
        this.name = name;
        count++; // Data3 의 생성자와 같이 자신의 클래스에 있는 정적 변수라면 클래스명을 생략 가능
    }
}
