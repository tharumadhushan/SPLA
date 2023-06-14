package lk.ijse.bo.custom;

import lk.ijse.Model.CustomerDTO;

public interface CustomerBO {
    boolean delete(String id);

    boolean save(CustomerDTO customer);

    CustomerDTO search(String id);

    boolean Update(CustomerDTO customer);
}
