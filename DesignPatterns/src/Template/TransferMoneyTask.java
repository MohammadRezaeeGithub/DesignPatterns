package Template;

public class TransferMoneyTask extends Task{

    //if this part is repetitv so we can add a default constructr to TASK class.
    public TransferMoneyTask(AuditTrail auditTrail) {
        super(auditTrail);
    }

    //for the same reason that is explained in TASK class, we make this method protected.
    @Override
    protected void doExecute() {
        System.out.println("Transfering Money");
    }
}
