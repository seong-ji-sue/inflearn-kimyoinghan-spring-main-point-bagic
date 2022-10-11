package hello.core.discount;

import hello.core.member.Gradle;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("Vip는 10% 할인 적용")
    void vip_o() {
        //given
        Member member = new Member(1L, "memberVIP", Gradle.VIP);

        //when
        int discount = discountPolicy.discount(member, 10000);

        assertThat(discount).isEqualTo(1000);
    }

    @Test
    @DisplayName("Vip이 아닌 경우 할인 적용 ㄴㄴ")
    void vip_x() {
        //given
        Member member = new Member(1L, "memberVIP", Gradle.BASIC);

        //when
        int discount = discountPolicy.discount(member, 10000);

        assertThat(discount).isEqualTo(0);
    }

}