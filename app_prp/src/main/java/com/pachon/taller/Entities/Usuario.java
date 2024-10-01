package com.pachon.taller.Entities;
import java.util.Objects;

public class Usuario {
    
    private String nombre;
    private String nameuser;
    private String sal;
    private String passwordEncrypt;

    public Usuario() {
    }

    public Usuario(String nombre, String nameuser, String sal, String passwordEncrypt) {
        this.nombre = nombre;
        this.nameuser = nameuser;
        this.sal = sal;
        this.passwordEncrypt = passwordEncrypt;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNameuser() {
        return this.nameuser;
    }

    public void setNameuser(String nameuser) {
        this.nameuser = nameuser;
    }

    public String getSal() {
        return this.sal;
    }

    public void setSal(String sal) {
        this.sal = sal;
    }

    public String getPasswordEncrypt() {
        return this.passwordEncrypt;
    }

    public void setPasswordEncrypt(String passwordEncrypt) {
        this.passwordEncrypt = passwordEncrypt;
    }

    public Usuario nombre(String nombre) {
        setNombre(nombre);
        return this;
    }

    public Usuario nameuser(String nameuser) {
        setNameuser(nameuser);
        return this;
    }

    public Usuario sal(String sal) {
        setSal(sal);
        return this;
    }

    public Usuario passwordEncrypt(String passwordEncrypt) {
        setPasswordEncrypt(passwordEncrypt);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Usuario)) {
            return false;
        }
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(nameuser, usuario.nameuser) && Objects.equals(sal, usuario.sal) && Objects.equals(passwordEncrypt, usuario.passwordEncrypt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, nameuser, sal, passwordEncrypt);
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", nameuser='" + getNameuser() + "'" +
            ", sal='" + getSal() + "'" +
            ", passwordEncrypt='" + getPasswordEncrypt() + "'" +
            "}";
    }
}
