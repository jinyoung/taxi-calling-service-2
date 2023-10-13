package taxi.calling.service.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import taxi.calling.service.domain.*;

//<<< PoEAA / Repository
@RepositoryRestResource(
    collectionResourceRel = "platformOperators",
    path = "platformOperators"
)
public interface PlatformOperatorRepository
    extends PagingAndSortingRepository<PlatformOperator, String> {}
