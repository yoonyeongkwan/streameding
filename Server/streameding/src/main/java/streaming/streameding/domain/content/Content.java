package streaming.streameding.domain.content;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import streaming.streameding.domain.member.User;

import java.time.LocalDateTime;

@Entity
@Table(name = "contents")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "content_type")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String title;

    @Column(length = 1000)
    private String description;

    @Column(nullable = false)
    private LocalDateTime uploadDate;

    private String mediaUrl;
}
