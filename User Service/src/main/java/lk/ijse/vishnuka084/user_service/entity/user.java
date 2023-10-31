package lk.ijse.vishnuka084.user_service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "user")
public class user {
    @Id
    private String userId;
    @Column(nullable = false)
    private String userFullName;
    @Column(nullable = false)
    private String username;
    @Column(nullable = false)
    private String userPassword;
    @Column(nullable = false,unique = true)
    private String userIdNum;
    @Column(nullable = false)
    private String userIdType;
    @Column(nullable = false)
    private String userEmail;
    @Column(nullable = false)
    private String userAddress;
    @Column(nullable = false)
    private String userDob;
    @Column(nullable = false)
    private String userGender;
    @Column(columnDefinition = "TEXT")
    private String nicImage1;
    @Column(columnDefinition = "TEXT")
    private String nicImage2;
    @Column(columnDefinition = "TEXT")
    private String profileImage;
}
