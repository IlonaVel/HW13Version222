package data;

public enum UserEnaum {
    VALIDUSER("valid", true), NOVALIDEMAIL ("noemail", false), NOTELEPHONEUSER ("notel", false);

    private String type;
    private boolean result;

    UserEnaum(String type, boolean result) {
        this.type = type;
        this.result = result;
    }

    public String getType(){
        return type;
    }
}
