package HWparam13;

public enum Certikenam {
    VALIDCERT("valid1", true),
    NOVALIDCERT ("novalid", false),
    LITERCERT ("liter", false),
    FIGURECERT("figure", false);


    private String type1;
    private boolean result1;

    Certikenam (String type1, boolean result1) {
        this.type1 = type1;
        this.result1 = result1;
    }

    public String getType1(){
        return type1;
    }
}


