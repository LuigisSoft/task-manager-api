package com.luigisback.task_manager_api.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Tarea {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private Long id;
private String titulo;
private String descripcion;
private LocalDateTime fechaCreacion=LocalDateTime.now();
@Enumerated(EnumType.STRING)
private EstadoTarea estado=EstadoTarea.PENDIENTE;
@Enumerated(EnumType.STRING)
private Prioridad prioridad=Prioridad.MEDIA;


//getter setter

    public Long getId() {
        return id;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDateTime getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(LocalDateTime fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public EstadoTarea getEstado() {
        return estado;
    }

    public void setEstado(EstadoTarea estado) {
        this.estado = estado;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }




}
