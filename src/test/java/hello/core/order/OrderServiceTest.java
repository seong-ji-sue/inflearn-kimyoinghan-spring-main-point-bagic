package hello.core.order;

import hello.core.AppConfig;
import hello.core.member.Gradle;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 주문 테스트 코드
 */
public class OrderServiceTest {

    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    OrderService orderService = appConfig.orderService();
//    MemberService memberService = new MemberServiceImpl();
//    OrderService orderService = new OrderServiceImpl(memberRepository, discountPolicy);

    @Test
    void createOder() {
        Long memberId = 1L;
        Member member = new Member(memberId,"memberA", Gradle.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(order.getDiscountPrice()).isEqualTo(1000);
    }
}
