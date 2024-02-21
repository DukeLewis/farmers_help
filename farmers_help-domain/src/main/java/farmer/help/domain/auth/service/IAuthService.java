package farmer.help.domain.auth.service;

import java.util.Map;

public interface IAuthService {
    Map<String,String> authorize(String username, String password, String code);

    boolean register(String username, String password);
}
