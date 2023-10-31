package lk.ijse.vishnuka084.user_service.api;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {

    @PostMapping(path = "/save")
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
    }
}
