package meetup.service;

import meetup.model.Issue;
import meetup.repository.IssueCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by EggiFace on 6/7/2017.
 */

@Service
public class IssueService {

    @Autowired
    private IssueCrudRepository issueCrudRepository;

    @Transactional
    public void delete(long id){
        issueCrudRepository.delete(id);
    }

    @Transactional
    public void save(Issue issue){
        issueCrudRepository.save(issue);
    }

    public Iterable<Issue> findAll(){
        return issueCrudRepository.findAll();
    }

    public Issue findOne(long id){
        return issueCrudRepository.findOne(id);
    }

}
