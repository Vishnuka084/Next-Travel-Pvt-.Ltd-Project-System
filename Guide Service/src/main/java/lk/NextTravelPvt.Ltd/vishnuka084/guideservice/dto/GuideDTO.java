package lk.NextTravelPvt.Ltd.vishnuka084.guideservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * Created by Vishnuka Yahan
 *
 * @author  : Vishnuka Yahan
 * @data    : 11/1/2023
 * @project : Next TravelPvt. Ltd
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class GuideDTO {
    private String guideId;
    private String guideDob;
    private String guideAddress;
    private String guideName;
    private double guideManDay_value;
    private String guideExperience;
    private String guideContact;
    private String guideEmail;
    private String guideGender;
    private String guideStatus;
    private byte[] guideIDImage;
    private byte[] guideNICImage;
    private byte[] guideImage;
}
