package meetup.dao;

import meetup.model.Comment;
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

/**
 * Created by szlizarrrr on 4/23/16.
 */

@Transactional
public interface CommentDao extends CrudRepository<Comment, Long>{
}
