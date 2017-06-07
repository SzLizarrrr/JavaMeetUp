package meetup.repository;

import meetup.model.Comment;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by szlizarrrr on 4/23/16.
 */

@Transactional
public interface CommentCrudRepository extends CrudRepository<Comment, Long>{
}
