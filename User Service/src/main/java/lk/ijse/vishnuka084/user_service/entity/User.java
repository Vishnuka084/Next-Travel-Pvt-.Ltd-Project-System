package lk.ijse.vishnuka084.user_service.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
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
}
