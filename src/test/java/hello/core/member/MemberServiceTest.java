package hello.core.member;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    MemberService memberService = new MemberServiceImpl();
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
