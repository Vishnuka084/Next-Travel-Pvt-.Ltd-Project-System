package lk.ijse.travelPackage.UserService.repository;


import lk.ijse.travelPackage.UserService.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 * Created by Vishnuka Yahan
 *
 * @author  : Vishnuka Yahan
 * @data    : 10/17/2023
 * @project : Next TravelPvt. Ltd
 *
 */
public interface UserRepository extends JpaRepository<User,Integer> {
    boolean existsByEmail(String email);
    boolean existsByNic(String nic);
    User getByEmail(String email);
    User getByNic(String nic);
    User getUserByAddress(String address);
    User getUserByNic(String nic);
    User getUsersByUserName(String userName);

}
