package lk.ijse.travelPackage.UserService.embeded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;
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
@Embeddable
public class RoomOption {
    private double hotelRoom_Opt_1;
    private double hotelRoom_Opt_2;
    private double hotelRoom_Opt_3;
    private double hotelRoom_Opt_4;
}
