package lk.ijse.bo.custom;

import lk.ijse.Model.EmployeeDTO;

public interface EmployeeBO {
    boolean save(EmployeeDTO employee);

    EmployeeDTO search(String id);

    boolean Update(EmployeeDTO employee);

    boolean delete(String id);
}
