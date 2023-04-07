package SOCIAL.MEDIA.MANAGING.SYSTEM.demoSOCIAL.MEDIA.MANAGING.SYSTEM;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Post {
    private String content;
    private int postId;
    private LocalDateTime time;
    private User user;
    private int likes;
}
