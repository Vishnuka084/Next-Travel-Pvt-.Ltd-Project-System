package lk.NextTravelPvt.Ltd.vishnuka084.userservice.repository;


import lk.NextTravelPvt.Ltd.vishnuka084.userservice.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    User findUserByUserIdOrUserIdNum(String userId,String userNic);

    List<User> findUserByUserIdLikeOrUserIdNumLike(String userId, String Nic);
}
