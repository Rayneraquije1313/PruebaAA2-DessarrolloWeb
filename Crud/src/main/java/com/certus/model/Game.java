package com.certus.model;


import javax.persistence.*;

@Entity
@Table(name ="game")
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre",nullable= false)
    private String nombre;

    @Column(name="creador",nullable= false)
    private String creador;

    @Column(name="genero",nullable= false)
    private String genero;

    @Column(name="consola",nullable= false, unique= true)
    private String consola;

    public Game() {

    }

    public Game(String genero, String consola, String creador, String nombre, Long id) {
        super();
        this.genero = genero;
        this.consola = consola;
        this.creador = creador;
        this.nombre = nombre;
        this.id = id;
    }

    public Game(String genero, String consola, String creador, String nombre) {
        super();
        this.genero = genero;
        this.consola = consola;
        this.creador = creador;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {return genero;}

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getConsola() {
        return consola;
    }

    public void setConsola(String consola) {
        this.consola = consola;
    }

    @Override
    public String toString() {
        return "Usuario [id=" + id + ", nombre=" + nombre + ", creador=" + creador + ", genero=" + genero + ", consola="
                + consola + "]";
    }
}
