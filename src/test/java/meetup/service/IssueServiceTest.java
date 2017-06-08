package meetup.service;

import meetup.domain.Issue;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

/**
 * Created by EggiFace on 6/8/2017.
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class IssueServiceTest {

    @Autowired
    private IssueService issueService;

    @Test
    public void findOne() throws Exception {
        Issue issue = issueService.findOne(1);
        Assert.assertEquals(new String("shishi"), issue.getTitle());
    }

}