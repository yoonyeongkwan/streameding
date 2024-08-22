package streaming.streameding.repository.member;

import org.springframework.data.jpa.repository.JpaRepository;
import streaming.streameding.domain.member.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
