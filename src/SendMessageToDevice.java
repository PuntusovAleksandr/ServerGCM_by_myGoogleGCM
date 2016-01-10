import java.io.IOException;

/**
 * Created by Aleksandr on 10.01.2016.
 */
public class SendMessageToDevice {

    public static void main(String[] args) throws IOException {
        // "Message to your device." is the message we will send to the Android app
        int responseCode = MessageUtil.sendMessage(ServerConfiguration.AUTHENTICATION_TOKEN,
                ServerConfiguration.REGISTRATION_ID,
                "Hi Aleksandr.");
        System.out.println(responseCode);
    }
}
