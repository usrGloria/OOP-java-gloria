package com.dxc.modelos;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@AllArgsConstructor
@Getter
@Setter
@ToString
public class Coche {
    private Integer id;
    private String marca;
    protected double velocidad;
    protected Integer caballos;

}
