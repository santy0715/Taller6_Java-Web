package co.edu.sena.project2687351.model.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface Repository <T>{
    List<T> listAllObj() throws SQLException;

    T byIdOBj(Integer id)throws  SQLException;

    Integer saveObj(T t) throws SQLException;

    Void deleteObj(Integer id) throws SQLException;

    T createObj(ResultSet rs) throws SQLException;
}