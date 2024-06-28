package pojo;

public class Root{
    public String value;
    public String unrestricted_value;
    public Data data;

    public String getValue() {
        return value;
    }

    public String getUnrestricted_value() {
        return unrestricted_value;
    }

    public Data getData() {
        return data;
    }

    public Root(){}

    public Root(String value, String unrestricted_value, Data data) {
        this.value = value;
        this.unrestricted_value = unrestricted_value;
        this.data = data;
    }
}