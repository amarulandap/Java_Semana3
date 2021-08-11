package Practicas_JFrames;
//@author Andres Marulanda

public class Usuario {
    
    private String email;
    private String nombreUsuario;
    private String contrasegna;

    public Usuario(String email, String nombreUsuario, String contrasegna) {
        this.email = email;
        this.nombreUsuario = nombreUsuario;
        this.contrasegna = contrasegna;
    }
    
    //El usuario siempre tendrá la misma cuenta de correo
    public String getEmail() {
        return email;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasegna() {
        return contrasegna;
    }

    public void setContrasegna(String contrasegna) {
        this.contrasegna = contrasegna;
    }
    
    
    
}
