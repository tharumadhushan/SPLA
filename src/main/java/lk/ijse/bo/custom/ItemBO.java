package lk.ijse.bo.custom;

import lk.ijse.Model.PartsDTO;

import java.sql.SQLException;

public interface ItemBO {
     PartsDTO search(String id) throws SQLException;

     boolean save(PartsDTO item) throws SQLException;

     boolean Update(PartsDTO item) throws SQLException;

    boolean delete(String id) throws SQLException;
}
