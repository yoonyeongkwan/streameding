package streaming.streameding.repository.member;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import streaming.streameding.domain.member.User;

import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Test
    void 저장(){
        //given
        User user = new User("admin@naver.com", "admin", "test");

        //when
        userRepository.save(user);

        //then
        Optional<User> findUser = userRepository.findById(user.getId());
        assertThat(findUser.get()).isEqualTo(user);
        assertThat(findUser.get().getEmail()).isEqualTo("admin@naver.com");
        assertThat(findUser.get().getNickname()).isEqualTo("test");
    }
}