package edu.sofia.ExamenRestJpaCine.service.implement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.sofia.ExamenRestJpaCine.repository.IRepartoRepository;
import edu.sofia.ExamenRestJpaCine.service.interfaces.IRepartoService;

@Service 
public class RepartoServiceImpl implements IRepartoService{

    @Autowired 
    private IRepartoRepository repartoRepo;

}
