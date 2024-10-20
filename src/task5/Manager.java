package task5;

public class Manager extends Approver {

    @Override
    public void processRequest(ExpenseRequest request) {
        if (request.getAmount() <= 2000) {
            System.out.println("Manager approved the expense request of " + request.getAmount() + " for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }
}
