package streaming.streameding.domain.member;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import streaming.streameding.domain.content.Content;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    private String nickname;
    private String profileImageUrl;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Content> contents = new ArrayList<>();

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "user_follow",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "follower_id")
    )
    private List<User> followers = new ArrayList<>();
    /**
     * 사용자를 팔로우하는 다른 사용자들 (팔로워들).
     *
     * Many-to-Many 관계를 사용하여 팔로워 관계를 설정합니다.
     * 이 관계는 `user_follow`라는 중간 테이블을 통해 관리되며,
     * 중간 테이블에서 `user_id`는 현재 사용자를 가리키고,
     * `follower_id`는 팔로우하는 사용자를 가리킵니다.
     */
    @ManyToMany(mappedBy = "followers", cascade = CascadeType.ALL)
    private List<User> following = new ArrayList<>();
    /**
     * 사용자가 팔로우하는 다른 사용자들.
     *
     * `followers` 필드에 의해 매핑된 반대 방향의 Many-to-Many 관계입니다.
     * 이 필드는 현재 사용자가 팔로우하고 있는 다른 사용자들을 나타냅니다.
     * `mappedBy = "followers"` 설정을 통해 반대 관계임을 지정합니다.
     */

    // 생성메소드

    public User(String email, String password, String nickname) {
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }
}
