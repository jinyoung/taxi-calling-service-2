package taxi.calling.service.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import taxi.calling.service.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "taxiDrivers",
    path = "taxiDrivers"
)
public interface TaxiDriverRepository
    extends PagingAndSortingRepository<TaxiDriver, String> {}
