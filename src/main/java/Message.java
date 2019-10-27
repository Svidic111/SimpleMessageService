import lombok.*;
import lombok.extern.slf4j.Slf4j;

import javax.print.attribute.standard.DateTimeAtCreation;
import java.nio.file.attribute.FileTime;
import java.util.ArrayList;

@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
public class Message {
    private ArrayList<byte[]> attachments;
    private FileTime creationTime;
    @NonNull
    private String sender;
    @NonNull
    private String receiver;
    @NonNull
    @ToString.Include(name="subject")
    private String name;
    private String text;
}
