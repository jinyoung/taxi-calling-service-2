package taxi.calling.service.domain;

import taxi.calling.service.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

//<<< PoEAA / Repository
@RepositoryRestResource(collectionResourceRel="mapDataProviders", path="mapDataProviders")
public interface MapDataProviderRepository extends PagingAndSortingRepository<MapDataProvider, >{
}