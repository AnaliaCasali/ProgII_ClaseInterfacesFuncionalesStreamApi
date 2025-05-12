package com.progII.model;

import java.util.Objects;

public class Persona  implements Comparable<Persona> {
    private int id;
    private String nombre;
    private int edad;
    private Genero genero;
    public Persona() {}
    public Persona(int id, String nombre, int edad, Genero genero) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    public static void ok(){
        System.out.println("Metodo estatico de la clase persona");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return id == persona.id && edad == persona.edad && Objects.equals(nombre, persona.nombre) && genero == persona.genero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, edad, genero);
    }

    @Override
    public int compareTo(Persona o) {
        if(  this.nombre.equals(o.getNombre())  && this.edad < o.getEdad()  ){
            return 1;
        }
        if(  this.nombre.equals(o.getNombre())  && this.edad == o.getEdad()  ){
            return 0;
        }
        if(  this.nombre.equals(o.getNombre())  && this.edad > o.getEdad()  ){
            return -1;
        }
        return 0;
    }
}
