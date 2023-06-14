package lk.ijse.bo.custom.impl;

import lk.ijse.Model.EmployeeDTO;
import lk.ijse.bo.SuperBo;
import lk.ijse.bo.custom.EmployeeBO;

public class EmployeeBOImpl implements EmployeeBO, SuperBo {
    @Override
    public boolean save(EmployeeDTO employee) {
        return false;
    }

    @Override
    public EmployeeDTO search(String id) {
        return null;
    }

    @Override
    public boolean Update(EmployeeDTO employee) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }
}
