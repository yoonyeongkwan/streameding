package streaming.streameding.domain.community;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import streaming.streameding.domain.member.User;

import java.time.LocalDateTime;

@Entity
@Table(name = "notifications")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Notification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String message;

    private LocalDateTime notificationDate;
}
