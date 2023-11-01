package lk.NextTravelPvt.Ltd.vishnuka084.guideservice.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
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
@Entity
@Table(name = "guide")
public class Guide {
    @Id
    private String guideId;

    @Column(nullable = false)
    private String guideName;

    @Column(nullable = false,columnDefinition = "DATE")
    private String guideDob;

    @Column(nullable = false,columnDefinition = "TEXT")
    private String guideAddress;

    @Column(nullable = false)
    private double guideManDay_value;

    @Column(nullable = false,columnDefinition = "TEXT")
    private String guideExperience;

    @Column(nullable = false)
    private String guideContact;

    @Column(nullable = false)
    private String guideEmail;

    @Column(nullable = false)
    private String guideGender;

    @Column(nullable = false)
    private String guideStatus;

    @Column(nullable = false)
    private String guideIDImage;

    @Column(nullable = false)
    private String guideNICImage;

    @Column(nullable = false)
    private String guideImage;
}
