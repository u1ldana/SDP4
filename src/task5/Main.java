package task5;

public class Main {

    public static void main(String[] args) {
        Approver approverChain = ApprovalChain.getApprovalChain();

        ExpenseRequest request1 = new ExpenseRequest(500, "Office Supplies");
        ExpenseRequest request2 = new ExpenseRequest(2000, "Team Outing");
        ExpenseRequest request3 = new ExpenseRequest(4500, "New Laptops");
        ExpenseRequest request4 = new ExpenseRequest(6800, "Office Renovation");

        approverChain.processRequest(request1);
        approverChain.processRequest(request2);
        approverChain.processRequest(request3);
        approverChain.processRequest(request4);
    }
}
