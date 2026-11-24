package edu.sofia.ExamenRestJpaCine.service.interfaces;

import edu.sofia.ExamenRestJpaCine.dtos.request.PeliculaRequestDTO;
import edu.sofia.ExamenRestJpaCine.dtos.response.PeliculaDetalleDTO;

public interface IPeliculaService {

    public PeliculaDetalleDTO crear(PeliculaRequestDTO dto);
    public PeliculaDetalleDTO guardar(PeliculaRequestDTO dto);
}
