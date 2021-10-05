package homework5.task3;

public class SomeClass {
    private int intField = 5;
    protected double doubleField = 11.11;
    public String stringField = "String";

    public SomeClass(int intField) {
        this.intField = intField;
    }

    public SomeClass(double doubleField) {
        this.doubleField = doubleField;
    }

    public SomeClass(String stringField) {
        this.stringField = stringField;
    }

    private SomeClass(int intField, double doubleField) {
        this.intField = intField;
        this.doubleField = doubleField;
    }

    private SomeClass(double doubleField, String stringField) {
        this.doubleField = doubleField;
        this.stringField = stringField;
    }

    private SomeClass(int intField, String stringField) {
        this.intField = intField;
        this.stringField = stringField;
    }

    SomeClass(int intField, double doubleField, String stringField) {
        this.intField = intField;
        this.doubleField = doubleField;
        this.stringField = stringField;
    }

    public int getIntField() {
        return intField;
    }

    public void setIntField(int intField) {
        this.intField = intField;
    }

    public double getDoubleField() {
        return doubleField;
    }

    public void setDoubleField(double doubleField) {
        this.doubleField = doubleField;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }
}
