package com.example.usuario.registrationdemo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by USUARIO on 28/02/2017.
 */

public class LoginResponse {

    @SerializedName("apellido")
    @Expose
    private String apellido;
    @SerializedName("nombre")
    @Expose
    private String nombre;
    @SerializedName("fijo")
    @Expose
    private String fijo;
    @SerializedName("direccion")
    @Expose
    private String direccion;
    @SerializedName("idusuario")
    @Expose
    private String idusuario;
    @SerializedName("estado")
    @Expose
    private String estado;
    @SerializedName("idtipousuario")
    @Expose
    private String idtipousuario;
    @SerializedName("foto")
    @Expose
    private String foto;
    @SerializedName("contrasena")
    @Expose
    private String contrasena;
    @SerializedName("correo")
    @Expose
    private String correo;
    @SerializedName("celular")
    @Expose
    private String celular;
    @SerializedName("error")
    @Expose
    private boolean error;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFijo() {
        return fijo;
    }

    public void setFijo(String fijo) {
        this.fijo = fijo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getIdtipousuario() {
        return idtipousuario;
    }

    public void setIdtipousuario(String idtipousuario) {
        this.idtipousuario = idtipousuario;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }
}
