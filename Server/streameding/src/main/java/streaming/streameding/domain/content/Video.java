package streaming.streameding.domain.content;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("VIDEO")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Video extends Content {

    @Column(nullable = false)
    private String videoQuality;
}
