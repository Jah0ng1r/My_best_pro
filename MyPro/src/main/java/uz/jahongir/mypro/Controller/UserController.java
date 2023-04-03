package uz.jahongir.mypro.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.jahongir.mypro.Model.User;
import uz.jahongir.mypro.Service.MyUserService;

@RestController
@RequestMapping("/api/v2/users")
public class UserController {

    public UserController(MyUserService myUserService) {
        this.myUserService = myUserService;
    }

    private MyUserService myUserService;

    @PostMapping("/signup")
    public ResponseEntity<String> usersignUp(@RequestBody User user) {
        user.setUsername(user.getUsername());
        user.setPassword(user.getPassword());
        user.setFullName(user.getFullName());
        user.setAddress(user.getAddress());
        user.setPhoneNumber(user.getPhoneNumber());
        myUserService.save(user);
        return ResponseEntity.ok("User registered successfully!");
    }
}
