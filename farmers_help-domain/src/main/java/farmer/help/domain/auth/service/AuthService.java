package farmer.help.domain.auth.service;

import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class AuthService implements IAuthService {

    @Override
    public Map<String, String> authorize(String username, String password, String code) {
        return null;
    }

    @Override
    public boolean register(String username, String password) {
        return false;
    }
}
