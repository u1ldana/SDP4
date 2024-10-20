package task5;

public class CEO extends Approver {

    @Override
    public void processRequest(ExpenseRequest request) {
        if (request.getAmount() > 5000) {
            System.out.println("CEO approved the expense request of " + request.getAmount() + " for " + request.getPurpose());
        } else if (nextApprover != null) {
            nextApprover.processRequest(request);
        }
    }
}
