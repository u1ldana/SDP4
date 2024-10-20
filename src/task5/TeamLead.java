package task5;

public class TeamLead extends Approver {

    @Override
    public void processRequest(ExpenseRequest request) {
        if (request.getAmount() <= 500) {
            System.out.println("Team Lead approved the expense request of " + request.getAmount() + " for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }
}
