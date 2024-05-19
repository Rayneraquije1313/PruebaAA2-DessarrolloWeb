package com.certus.model;


import javax.persistence.*;

@Entity
@Table(name ="comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre",nullable= false)
    private String nombre;

    @Column(name="comentario",nullable= false)
    private String comentario;

    public Comentario() {

    }

    public Comentario(String comentario, String nombre, Long id) {
        super();
        this.comentario = comentario;
        this.nombre = nombre;
        this.id = id;
    }

    public Comentario(String comentario, String nombre) {
        super();
        this.comentario = comentario;
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

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    @Override
    public String toString() {
        return "Comentario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", comentario='" + comentario + '\'' +
                '}';
    }
}
