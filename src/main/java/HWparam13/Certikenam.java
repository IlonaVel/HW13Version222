package HWparam13;

public enum Certikenam {
    VALIDCERT("valid1", true),
    NOVALIDCERT ("novalid1", false),
    LITERCERT ("liter", false),
    FIGURECERT("figure", false);


    private String type1;
    private boolean bol;

    Certikenam (String type1, boolean bol) {
        this.type1 = type1;
        this.bol = bol;
    }

    public String getType1(){
        return type1;
    }
}


