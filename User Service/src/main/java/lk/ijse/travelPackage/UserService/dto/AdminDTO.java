package lk.ijse.travelPackage.UserService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * Created by Vishnuka Yahan
 *
 * @author  : Vishnuka Yahan
 * @data    : 10/17/2023
 * @project : Next TravelPvt. Ltd
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class AdminDTO {
    private String loginEmail;
    private String loginPassword;
}
