package hello.core.lifecycle;

public class NetworkClient {

    private String url;
//초기화 작업은 의존관계 주입이 모두 완료되고 난 다음에 호출해야 한다.
    public  NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
        connect();
        call("최화 연결 메세지");
    }

    public void setUrl(String url) {
        this.url = url;
    }

    //서비스 시작 호출
    public void connect() {
        System.out.println("connect : " + url);
    }

    public void call(String message) {
        System.out.println("call : " + url + "message = " + message);
    }

    //서비스 종료시 호출
    public void disconnect() {
        System.out.println("close : " + url);
    }
}
