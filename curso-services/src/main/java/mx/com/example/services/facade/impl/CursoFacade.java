package mx.com.example.services.facade.impl;

import mx.com.example.commons.to.UserTO;
import mx.com.example.services.facade.ICursoFacade;
import mx.com.example.services.service.ICursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class CursoFacade implements ICursoFacade {

    @Autowired
    private ICursoService cursoService;

    public List<UserTO> getAllUsers() {
        return this.cursoService.getUsers();
    }
}
