package lk.NextTravelPvt.Ltd.vishnuka084.userservice.service;

import lk.NextTravelPvt.Ltd.vishnuka084.userservice.dto.UserDTO;
import lk.NextTravelPvt.Ltd.vishnuka084.userservice.exception.DuplicateException;
import lk.NextTravelPvt.Ltd.vishnuka084.userservice.exception.NotFoundException;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface UserService {
    boolean saveUser(UserDTO userDTO,
                     MultipartFile nic1,
                     MultipartFile nic2, MultipartFile pic) throws DuplicateException;

    UserDTO findUserById(String userId) throws NotFoundException;

    List<UserDTO> findAll();

    void deleteUserById(String userId) throws NotFoundException;

    UserDTO findUserByIdOrNic(String detail);

    List<UserDTO> findUserByIdOrNicLike(String detail);

    void updateUser(UserDTO userDTO,MultipartFile nic1,
                    MultipartFile nic2,MultipartFile pic) throws NotFoundException;
}
