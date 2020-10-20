package main.java.lesson8;

public class AccountsReceivable {

    private  Accounting transactionObject;

    public AccountsReceivable(CustomerTransaction aTransaction){
        transactionObject = aTransaction;
    }

    public void postPayment(){
        transactionObject.chargeCustomer();
    }

    public void sendInvoice(){
        transactionObject.prepareInvoice();
    }
}
