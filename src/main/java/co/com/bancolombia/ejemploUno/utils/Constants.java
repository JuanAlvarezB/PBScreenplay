package co.com.bancolombia.ejemploUno.utils;

public enum Constants {
    USER("user"),
    PASSWORD("password"),
    MESSAGE("mensaje"),
    NOMBRE("nombre"),
    APELLIDO("apellido"),
    CODIGO_POSTAL("codigo_postal"),

    ;
private String constants;

    Constants(String constants) {
        this.constants = constants;
    }

    public String getConstants() {
        return constants;
    }

}
