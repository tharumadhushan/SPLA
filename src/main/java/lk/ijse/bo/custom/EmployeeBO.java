package lk.ijse.bo.custom;

import lk.ijse.Model.EmployeeDTO;
import lk.ijse.bo.SuperBo;

public interface EmployeeBO extends SuperBo {
    boolean save(EmployeeDTO employee);

    EmployeeDTO search(String id);

    boolean Update(EmployeeDTO employee);

    boolean delete(String id);
}
