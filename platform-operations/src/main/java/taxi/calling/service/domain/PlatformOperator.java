package taxi.calling.service.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import taxi.calling.service.PlatformOperationsApplication;
import taxi.calling.service.domain.PlatformOperatorRegistered;

@Entity
@Table(name = "PlatformOperator_table")
@Data
//<<< DDD / Aggregate Root
public class PlatformOperator {

    @Id
    private String operatorId;

    private String name;

    private String phoneNumber;

    @PostPersist
    public void onPostPersist() {
        PlatformOperatorRegistered platformOperatorRegistered = new PlatformOperatorRegistered(
            this
        );
        platformOperatorRegistered.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static PlatformOperatorRepository repository() {
        PlatformOperatorRepository platformOperatorRepository = PlatformOperationsApplication.applicationContext.getBean(
            PlatformOperatorRepository.class
        );
        return platformOperatorRepository;
    }

    //<<< Clean Arch / Port Method
    public void updatePlatformOperatorInfo() {
        //implement business logic here:

        PlatformOperatorInfoUpdated platformOperatorInfoUpdated = new PlatformOperatorInfoUpdated(
            this
        );
        platformOperatorInfoUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
