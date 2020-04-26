import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/user-details")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value = "/insert", produces = MediaType.APPLICATION_JSON_VALUE)
    public void addUser(@RequestParam("firstName") String firstName,
                        @RequestParam("lastName") String lastName,
                        @RequestParam("age") int age,
                        @RequestParam("firstName") double weight) {
                   userService.addUser(firstName,lastName,age,weight)
    }
}
