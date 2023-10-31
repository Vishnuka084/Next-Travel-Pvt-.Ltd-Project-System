package lk.ijse.vishnuka084.user_service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserRoleHasUser {
    @EmbeddedId
    private UserRoleHasUserKey id = new UserRoleHasUserKey();

    @ManyToOne
    @MapsId("user")

    @JoinColumn(name = "user_id",nullable = false)
    private User user;

    @ManyToOne
    @MapsId("userRole")

    @JoinColumn(name = "role_id",nullable = false)
    private UserRole userRole;


}
