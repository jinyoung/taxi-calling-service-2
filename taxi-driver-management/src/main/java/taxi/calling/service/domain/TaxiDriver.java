package taxi.calling.service.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import taxi.calling.service.TaxiDriverManagementApplication;
import taxi.calling.service.domain.TaxiDriverRegistered;

@Entity
@Table(name = "TaxiDriver_table")
@Data
//<<< DDD / Aggregate Root
public class TaxiDriver {

    @Id
    private String driverId;

    private String name;

    private String phoneNumber;

    @PostPersist
    public void onPostPersist() {
        TaxiDriverRegistered taxiDriverRegistered = new TaxiDriverRegistered(
            this
        );
        taxiDriverRegistered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static TaxiDriverRepository repository() {
        TaxiDriverRepository taxiDriverRepository = TaxiDriverManagementApplication.applicationContext.getBean(
            TaxiDriverRepository.class
        );
        return taxiDriverRepository;
    }

    //<<< Clean Arch / Port Method
    public void updateTaxiDriverInfo() {
        //implement business logic here:

        TaxiDriverInfoUpdated taxiDriverInfoUpdated = new TaxiDriverInfoUpdated(
            this
        );
        taxiDriverInfoUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
