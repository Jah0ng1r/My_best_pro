package uz.jahongir.mypro.Service;

import org.springframework.stereotype.Service;
import uz.jahongir.mypro.Model.User;
import uz.jahongir.mypro.MyRepository.UserRepository;

@Service
public class MyUserService {


    private UserRepository userRepository;


    public MyUserService(UserRepository userRepository) {
        this.userRepository = userRepository;

    }

    public User save(User user) {
        user.setPassword(user.getPassword());
        return userRepository.save(user);
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
