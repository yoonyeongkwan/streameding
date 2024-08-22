package streaming.streameding.repository.community;

import org.springframework.data.jpa.repository.JpaRepository;
import streaming.streameding.domain.community.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {
}
