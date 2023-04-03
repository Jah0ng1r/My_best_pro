package uz.jahongir.mypro.MyRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.jahongir.mypro.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    User findByPhoneNumber(String phoneNumber);


}