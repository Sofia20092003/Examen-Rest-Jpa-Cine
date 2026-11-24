package edu.sofia.ExamenRestJpaCine.dtos.response;

import java.util.List;

public record PeliculaDetalleDTO(Long id, String titulo, String director, Integer anio, Integer duracion, List<RepartoDTO> reparto) {

}
