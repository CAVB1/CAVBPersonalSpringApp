package com.cavb.CAVBPersonalApp.DAO;

import com.cavb.CAVBPersonalApp.ML.Result;
import com.cavb.CAVBPersonalApp.ML.Rol;
import com.cavb.CAVBPersonalApp.ML.User;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAOImplementation implements UserDAO {
    private JdbcTemplate jdbcTemplate;
    private EntityManager entityManager;

    @Autowired
    public UserDAOImplementation(DataSource dataSource, EntityManager entityManager) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
        this.entityManager = entityManager;
    }

    @Override
    public Result GetAllJPA() {
        Result result = new Result();

        try {
            List<com.cavb.CAVBPersonalApp.JPA.User> usersJPA = entityManager.createQuery("FROM User").getResultList();
            List<User> users = new ArrayList<>();
            for (com.cavb.CAVBPersonalApp.JPA.User userJPA : usersJPA) {
                User user = new User();
                user.setIdUser(userJPA.getIdUser());
                user.setUserName(userJPA.getUserName());
                user.setName(userJPA.getName());
                user.setLastName(userJPA.getLastName());
                user.setEmail(userJPA.getEmail());
                user.setPassword(userJPA.getPassword());
                user.setBirthDate(userJPA.getBirthDate());
                user.Rol = new Rol();
                user.Rol.setIdRol(userJPA.Rol.getIdRol());
                user.Rol.setName(userJPA.Rol.getName());

                users.add(user);
            }

            result.Correct = true;
            result.Object = users;
        } catch (Exception e) {
            result.Correct = false;
            result.ErrorMessage = e.getLocalizedMessage();
            result.Ex = e;
        }

        return result;
    }

    @Override
    public Result AddJPA(User user) {
        Result result = new Result();

        try {
            com.cavb.CAVBPersonalApp.JPA.User userJPA = new com.cavb.CAVBPersonalApp.JPA.User();
            userJPA.setUserName(user.getUserName());
            userJPA.setName(user.getName());
            userJPA.setLastName(user.getLastName());
            userJPA.setEmail(user.getEmail());
            userJPA.setPassword(user.getPassword());
            userJPA.setBirthDate(user.getBirthDate());
            userJPA.Rol = new com.cavb.CAVBPersonalApp.JPA.Rol();
            userJPA.Rol.setIdRol(user.Rol.getIdRol());

            entityManager.persist(user);

            result.Correct = true;
        }catch (Exception e){
            result.Correct = false;
            result.ErrorMessage = e.getLocalizedMessage();
            result.Ex = e;
        }

        return result;
    }
}
