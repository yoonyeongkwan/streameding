package streaming.streameding.domain.content;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("MUSIC")
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Music extends Content {

    @Column(nullable = false)
    private String genre;
}
