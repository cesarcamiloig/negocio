package Modelo;

public class Cliente {

    /*
	 * Funcionalidad F3, asociacion de cliente a una cuenta
	 */
    private long CC;
    private String nombresApellidos;

    public Cliente (long CC, String nombresApellidos) 
    {

        this.CC = CC;
        this.nombresApellidos = nombresApellidos;

    }

    public long getCC() {
        return CC;
    }

    public String getNombresApellidos() {
        return nombresApellidos;
    }

    public void setNombresApellidos(String nombresApellidos) {
        this.nombresApellidos = nombresApellidos;
    }
    
}
