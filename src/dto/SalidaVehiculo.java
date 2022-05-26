package dto;

public class SalidaVehiculo {
    private String placa;

    public String obtenerPlaca() {
        return placa;
    }

    public void modificarPlaca(String placa) {
        this.placa = placa;
    }
    public static int sumarCupo() {
        int a = 20 + 1;
        return a;
    }
}
