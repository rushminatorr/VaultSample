import org.springframework.vault.authentication.TokenAuthentication;
import org.springframework.vault.client.VaultEndpoint;
import org.springframework.vault.core.VaultTemplate;
import org.springframework.vault.support.VaultResponseSupport;

/**
 * Created by rashmim on 18/06/17.
 */
public class RushTest {
    public static void main(String[] args) {

        VaultEndpoint something = VaultEndpoint.create("localhost",8300);
        something.setScheme("http");

        VaultTemplate vaultTemplate = new VaultTemplate(something,
                new TokenAuthentication("devroot"));

        Secrets secrets = new Secrets();
        secrets.username = "kb";
        secrets.password = "rora";

        vaultTemplate.write("secret/rushTest", secrets);

        VaultResponseSupport<Secrets> response = vaultTemplate.read("secret/rushTest", Secrets.class);
        System.out.println(response.getData().getUsername());
    }
}

