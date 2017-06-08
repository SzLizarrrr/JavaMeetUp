package meetup.repository;

import meetup.domain.Issue;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by szlizarrrr on 4/4/16.
 */

public interface IssueCrudRepository extends CrudRepository<Issue, Long>{

}
