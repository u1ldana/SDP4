package task5;

public class ApprovalChain {

    public static Approver getApprovalChain() {
        Approver teamLead = new TeamLead();
        Approver manager = new Manager();
        Approver director = new Director();
        Approver ceo = new CEO();

        // Set the chain of responsibility
        teamLead.setNextApprover(manager);
        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        return teamLead;
    }
}
