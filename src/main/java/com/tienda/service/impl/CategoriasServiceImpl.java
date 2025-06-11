
package com.tienda.service.impl;

import com.tienda.dao.CategoriaDao;
import com.tienda.domain.Categoria;
import com.tienda.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// Define la lógica de los métodos de la interfaz que implementa
@Service
public class CategoriasServiceImpl implements CategoriaService {
    
    //Inyección
    @Autowired
    private CategoriaDao categoriaDao;

    @Override
    public List<Categoria> getCategorias(boolean activos) {
        List<Categoria> lista = categoriaDao.findAll();
        
        // Filtrar solo los activos
        if (activos) {
            lista.removeIf(cat -> !cat.isActivo());
        }
        
        return lista;
    }
    
}
