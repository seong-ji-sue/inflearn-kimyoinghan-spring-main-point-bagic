package hello.core.singleton;

/**
 * 싱글톤 주의할 점 테스트를 위한 예시 Service
 */
public class StatefulService {

//    private int price; // 상태를 유지하는 코드

    public int order(String name, int price){
        System.out.println("name = " + name + " price = " + price);
//        this.price = price;// 여기가 문제
        return price;
    }

//    public int getPrice() {
//        return price;
//    }
}
