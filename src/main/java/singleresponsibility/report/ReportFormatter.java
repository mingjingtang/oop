package main.java.singleresponsibility.report;

public class ReportFormatter {

    String formattedOutput;

    public ReportFormatter(Object object, FormatType formatType){
        switch (formatType){
            case XML:
                formattedOutput = convertObjectToXML(object);
                break;
            case CSV:
                formattedOutput = converObjectToCSV(object);
                break;
        }
    }

    public String convertObjectToXML(Object object){
        return "converted object to xml "+ object.toString();
    }

    public String converObjectToCSV(Object object){
        return "convert object to csv " + object.toString();
    }

    protected String getFormattedValue(){
        return formattedOutput;
    }
}
