
package com.tienda.service;

import com.tienda.domain.Categoria;
import java.util.List;

// Define los métodos a exponer a consumidores
public interface CategoriaService {
    
    public List<Categoria> getCategorias(boolean activos);
    
}
