package com.proyectodeaula.proyecto_de_aula.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.proyectodeaula.proyecto_de_aula.interfaceService.IempresaService;
import com.proyectodeaula.proyecto_de_aula.interfaces.Interfaz_Empresa;
import com.proyectodeaula.proyecto_de_aula.model.Empresa;

@Service
public class EmpresaService implements IempresaService {

    @Autowired
    private Interfaz_Empresa dataEmp;

    @Override
    public List<Empresa> listar_Emp() {
       return (List<Empresa>)dataEmp.findAll();
    }

    @Override
    public Optional<Empresa> listarId(int id) {
        throw new UnsupportedOperationException("Unimplemented method 'listarId'");
    }

    @Override
    public int save(Empresa E) {
        int res= 0;
        Empresa emp = dataEmp.save(E);
        if(!emp.equals(null)){
            res=1;
        }
        return res;
        
    }

    @Override
    public void delete(int Id) {
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }
    
}
