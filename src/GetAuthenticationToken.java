import java.io.IOException;

/**
 * Created by Aleksandr on 10.01.2016.
 */
public class GetAuthenticationToken {

    public static void main(String[] args) throws IOException {
        String token = AuthenticationUtil.getToken(SecureStorage.USER,
                SecureStorage.PASSWORD);
        System.out.println(token);
    }
}
