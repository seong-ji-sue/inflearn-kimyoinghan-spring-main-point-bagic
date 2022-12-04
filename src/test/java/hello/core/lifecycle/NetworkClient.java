package hello.core.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class NetworkClient implements InitializingBean, DisposableBean {
//InitializingBean 초기화
    //종료
    private String url;
//초기화 작업은 의존관계 주입이 모두 완료되고 난 다음에 호출해야 한다.
    public  NetworkClient() {
        System.out.println("생성자 호출, url = " + url);
//        connect();
//        call("최화 연결 메세지");
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

    //의존 관계 주입이 끝나면 호출
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("NetworkClient.afterPropertiesSet");
        connect();
        call("최화 연결 메세지");

    }

    //빈이 종료될 때 호출
    @Override
    public void destroy() throws Exception {
        System.out.println("NetworkClient.destroy");
        disconnect();
    }
}
