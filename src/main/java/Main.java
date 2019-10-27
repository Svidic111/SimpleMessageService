import java.io.File;
import java.util.ArrayDeque;


public class Main {


    public static void main(String[] args) {
        String targetFolfer = System.getProperty("user.dir") + "\\" + "messages";

        MessageRepo messageRepo = new MessageRepo();
        ArrayDeque<Message> allMessages = messageRepo.getAllMessages(new File(targetFolfer));

    }
}
