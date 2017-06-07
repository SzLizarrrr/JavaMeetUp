package meetup.repository;

import meetup.model.Issue;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by szlizarrrr on 4/4/16.
 */
@Transactional
public interface IssueCrudRepository extends CrudRepository<Issue, Long>{

}
