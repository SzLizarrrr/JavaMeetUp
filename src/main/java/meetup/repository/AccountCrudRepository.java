package meetup.repository;

import meetup.domain.Account;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by EggiFace on 7/6/2017.
 */
public interface AccountCrudRepository extends CrudRepository<Account, Long>{
}
