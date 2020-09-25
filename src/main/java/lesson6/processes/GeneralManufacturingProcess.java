package main.java.lesson6.processes;

public abstract class GeneralManufacturingProcess {
    private String processName;
    public GeneralManufacturingProcess(String name){
        processName = name;
    }

    protected abstract void assembly();
    protected abstract void testing();
    protected abstract void packaging();
    protected abstract void storage();

    //template method
    public void launchProcess(){
        if(processName != null && !processName.isEmpty()){
            assembly();
            testing();
            packaging();
            storage();
        }
        else{
            System.out.println("no process name was specified");
        }
    }
}
