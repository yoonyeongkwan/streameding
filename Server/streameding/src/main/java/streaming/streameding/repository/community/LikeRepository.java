package streaming.streameding.repository.community;

import org.springframework.data.jpa.repository.JpaRepository;
import streaming.streameding.domain.community.Like;

public interface LikeRepository extends JpaRepository<Like, Long> {
}
