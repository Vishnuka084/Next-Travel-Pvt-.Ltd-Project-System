package lk.NextTravelPvt.Ltd.vishnuka084.travelpackageservice.entity;

import lk.NextTravelPvt.Ltd.vishnuka084.travelpackageservice.embeded.RoomCount;
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
 * @data    : 11/2/2023
 * @project : Next TravelPvt. Ltd
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Entity
@Table(name = "travelPackage")
public class TravelPackage {
    @Id
    private String travelPackage_Id;

    @Column(nullable = false)
    private String travelPackage_Category;

    @Column(nullable = false,columnDefinition = "TEXT")
    private String travelPackage_Areas;

    @Column(nullable = false)
    private String guide_id;

    @Column(nullable = false)
    private String vehicle_id;

    @Column(nullable = false)
    private String hotel_id;

    @Column(nullable = false)
    private String customer_id;

    @Column(nullable = false)
    private double travelPackage_Value;

    @Column(nullable = false)
    private double travelPackage_PaidValue;

    @Column(nullable = false)
    private String travelPackage_NeedGuide;

    @Column(nullable = false)
    private String travelPackage_WithPet;

    @Column(nullable = false)
    private int travelPackage_HeadCount;

    @Column()
    private int travelPackage_No_Child;

    @Column()
    private int travelPackage_No_Adult;

    @Column
    private RoomCount roomCount;

    @Column(nullable = false,columnDefinition = "DATE")
    //@JsonFormat(pattern = "yyyy-mm-dd")
    private String travelPackage_StartDate;

    @Column(nullable = false,columnDefinition = "DATE")
    //@JsonFormat(pattern = "yyyy-mm-dd")
    private String travelPackage_EndDate;

    @Column(nullable = false,columnDefinition = "DATE")
    //@JsonFormat(pattern = "yyyy-mm-dd")
    private String travelPackage_PacedDate;
}
