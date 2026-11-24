package edu.sofia.ExamenRestJpaCine.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import edu.sofia.ExamenRestJpaCine.dtos.request.PeliculaRequestDTO;
import edu.sofia.ExamenRestJpaCine.dtos.response.PeliculaDetalleDTO;
import edu.sofia.ExamenRestJpaCine.entities.Pelicula;
import edu.sofia.ExamenRestJpaCine.repository.IPeliculaRepository;
import edu.sofia.ExamenRestJpaCine.service.interfaces.IPeliculaService;

@Service 
public class PeliculaServiceImpl implements IPeliculaService{

    @Autowired 
    private IPeliculaRepository peliculaRepo;

    @Override
    @Transactional 
    public PeliculaDetalleDTO crear(PeliculaRequestDTO dto) {

        Pelicula r = new Pelicula(dto.titulo(), dto.director(), dto.anio(), dto.duracion());
        peliculaRepo.save(r);

        return PeliculaDetalleDTO(r.getPelicula_id(), r.getTitulo(), r.getDirector(), r.getAnio(), r.getDuracion(), r.getReparto());
    }

    @Override
    public PeliculaDetalleDTO guardar(PeliculaRequestDTO dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'guardar'");
    }

    

}
