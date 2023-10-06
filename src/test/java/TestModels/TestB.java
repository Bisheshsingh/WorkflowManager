package TestModels;

import org.workflow.manager.annotations.Run;
import org.workflow.manager.exceptions.ServiceException;
import org.workflow.manager.models.Service;
import org.workflow.manager.models.WorkflowResponse;

public class TestB extends Service<TestContext> {
    @Override
    protected WorkflowResponse performAction(TestContext input) throws ServiceException {
        input.setTxt2(String.format("%sing", input.getTxt1()));

        return TestResponses.SuccessfulResponses.B_PASSED;
    }

    @Run(level = "DryRun")
    public WorkflowResponse dryRun(TestContext input) {
        input.setTxt2(String.format("%sning", input.getTxt1()));

        return TestResponses.SuccessfulResponses.B_PASSED;
    }
}