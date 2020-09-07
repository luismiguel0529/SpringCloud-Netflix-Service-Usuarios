package com.formacionbdi.springboot.app.models.dao;

import com.formacionbdi.springboot.app.models.entity.Usuario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;


@RepositoryRestResource(path = "usuarios")
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {

    @RestResource(path = "searchForUsername")
    public Usuario findByUsername(@Param("usernameParam") String username);

    @Query("select u from Usuario u where u.username =?1")
    public Usuario obtenerPorUsername(String username);


}
