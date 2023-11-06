package lk.ijse.travelPackage.GuideService.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
/**
 * Created by Vishnuka Yahan
 *
 * @author  : Vishnuka Yahan
 * @data    : 10/29/2023
 * @project : Next TravelPvt. Ltd
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class GuideDTO {
    private Integer guideId;
    private String guideName;
    private String guideAddress;
    private String guideDob;
    private String guideGender;
    private String guideContact;
    private String guideExperience;
    private double guideManDay_value;
    private String guideEmail;
    private String guideStatus;

    private byte[] guideNICImageFront;
    private byte[] guideNICImageRear;
    private byte[] guideIDImageFront;
    private byte[] guideIDImageRear;
    private byte[] guideImage;
}
