package meetup.repository;

import meetup.domain.Comment;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by szlizarrrr on 4/23/16.
 */

public interface CommentCrudRepository extends CrudRepository<Comment, Long>{
}
