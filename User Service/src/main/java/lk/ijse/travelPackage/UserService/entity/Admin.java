package lk.ijse.travelPackage.UserService.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
/**
 * Created by Vishnuka Yahan
 *
 * @author  : Vishnuka Yahan
 * @data    : 10/17/2023
 * @project : Next TravelPvt. Ltd
 *
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Admin {
    @Id
    private String loginEmail;
    private String loginPassword;
}
