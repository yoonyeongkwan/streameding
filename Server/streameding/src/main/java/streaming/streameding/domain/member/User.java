package streaming.streameding.domain.member;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import streaming.streameding.domain.content.Content;

import java.util.Set;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private String nickname;
    private String profileImageUrl;

    @OneToMany(mappedBy = "user")
    private Set<Content> contents;

    @ManyToMany
    @JoinTable(
            name = "user_follow",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "follower_id")
    )
    private Set<User> followers;

    @ManyToMany(mappedBy = "followers")
    private Set<User> following;
}
