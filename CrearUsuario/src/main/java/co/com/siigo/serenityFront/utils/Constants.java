package co.com.siigo.serenityFront.utils;

public enum Constants {
    USER("user"),
    PASSWORD("pass");

    private String constants;

    Constants(String constants) {
        this.constants = constants;
    }

    public String getConstants(){
        return constants;
    }
}
