package lk.ijse.vishnuka084.user_service.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @PostMapping()
    public String saveUser(){
        return "save User";
    }

    @GetMapping
    public String findUser(){
        return "find User";
    }

/*    @PostMapping(path = "/save")
    public String saveUser(){
        return "save User";
    }

    @DeleteMapping(path = "/delete")
    public String deleteUser(){
        return "Delete User";
    }

    @PutMapping(path = "/update")
    public String updateUser(){
        return "Update user";
    }*/
}
