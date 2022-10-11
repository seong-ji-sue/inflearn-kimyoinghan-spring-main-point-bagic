package hello.core.member;

import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * 회원 테스트 코드
 */
public class MemberServiceTest {

    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    @Test
    void join() {
        //given 주어질때
        Member member = new Member(1L,"memberA", Gradle.VIP);

        //when 했을때
        memberService.join(member);
        Member findMember = memberService.findMember(1L);


        //then 그게 된다
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
