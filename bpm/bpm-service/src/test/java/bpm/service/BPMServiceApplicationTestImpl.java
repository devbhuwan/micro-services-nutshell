package bpm.service;

import org.activiti.engine.RepositoryService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertNotNull;

public class BPMServiceApplicationTestImpl extends BPMServiceApplicationTest {

    @Autowired
    private RepositoryService repositoryService;

    @Test
    public void test() {
        assertNotNull(repositoryService);
    }

}
