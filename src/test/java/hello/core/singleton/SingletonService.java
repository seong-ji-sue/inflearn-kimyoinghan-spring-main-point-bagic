package hello.core.singleton;

/**
 * 싱글톤 만드는 방법 설명(
 * 내부 메서드로 통해서만 인스턴스 호출, 외부에서 인스턴스 만들지 못함, 하나의 인스턴스만 공유)
 */
public class SingletonService {

    private static final SingletonService instance = new SingletonService();

    public static  SingletonService getInstance() {
        return instance;
    }

    //외부에서 인스턴스 만들지 못하도록 함
    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }

}
