package Template;

public abstract class Task {


    private AuditTrail auditTrail;

    public Task(){
        auditTrail = new AuditTrail();
    }

    public Task(AuditTrail auditTrail) {
        this.auditTrail = auditTrail;
    }

    public void execute(){
        auditTrail.record();
        doExecute();
    }

    //if it stays public, so we can call it from main class and skip the auditTrail
    //if we make it private,the child can not inheritate it
    //so we can make it protected.
    protected abstract void  doExecute();
}
