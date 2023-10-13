package taxi.calling.service.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import taxi.calling.service.MapDataProviderApplication;

@Entity
@Table(name = "MapDataProvider_table")
@Data
//<<< DDD / Aggregate Root
public class MapDataProvider {

    @Id
    private String providerId;

    private String name;

    private String phoneNumber;

    public static MapDataProviderRepository repository() {
        MapDataProviderRepository mapDataProviderRepository = MapDataProviderApplication.applicationContext.getBean(
            MapDataProviderRepository.class
        );
        return mapDataProviderRepository;
    }

    //<<< Clean Arch / Port Method
    public void updateProviderInfo() {
        //implement business logic here:

        ProviderInfoUpdated providerInfoUpdated = new ProviderInfoUpdated(this);
        providerInfoUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
