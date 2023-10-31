package lk.ijse.vishnuka084.user_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@RequiredArgsConstructor
public class User {

    @Id
    private String userId;
    private String userFullName;
    private String username;
    private String userPassword;
    private String userIdNum;
    private String userIdType;
    private String userEmail;
    private String userAddress;
    private String userDob;
    private String userGender;
    private String nicImage1;
    private String nicImage2;
    private String profileImage;


    /*-------------------------*/
    private boolean isAccountNonExpired;
    private boolean isCredentialNonExpired;
    private boolean isAccountNonLocked;
    private boolean isEnabled;


    @OneToMany(mappedBy = "user")
    private Set<UserRoleHasUser> userRoleHasUsers;

}
