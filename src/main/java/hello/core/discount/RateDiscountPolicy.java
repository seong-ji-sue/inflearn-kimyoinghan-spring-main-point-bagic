package hello.core.discount;

import hello.core.member.Gradle;
import hello.core.member.Member;
import org.springframework.stereotype.Component;

/**
 * 할인 정책 테스트
 */
@Component
public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGradle() == Gradle.VIP)
            return price * discountPercent /100;
        else
            return 0;
    }
}
