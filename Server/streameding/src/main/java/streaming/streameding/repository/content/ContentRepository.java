package streaming.streameding.repository.content;

import org.springframework.data.jpa.repository.JpaRepository;
import streaming.streameding.domain.content.Content;

public interface ContentRepository extends JpaRepository<Content, Long> {
}
