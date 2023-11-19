package hello.hellospring.repository;

import hello.hellospring.domain.Member;
//import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import static org.assertj.core.api.Assertions.*;

class MemoryMemberRepositoryTest {
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @Test
    public void save() {
        Member member = new Member();
        member.setName("spring");

        repository.save(member);

        Member result = repository.findById(member.getId()).get();
//        System.out.println("result = " + (result == member));
//        Assertions.assertEquals(member, result);
        assertThat(member).isEqualTo(result);

    }


}
