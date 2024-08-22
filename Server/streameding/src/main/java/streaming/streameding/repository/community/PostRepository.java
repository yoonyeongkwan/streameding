package streaming.streameding.repository.community;

import org.springframework.data.jpa.repository.JpaRepository;
import streaming.streameding.domain.community.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
