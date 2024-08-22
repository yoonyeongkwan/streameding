package streaming.streameding.repository.member;

import org.springframework.data.jpa.repository.JpaRepository;
import streaming.streameding.domain.member.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Long> {
}
