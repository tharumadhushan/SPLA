package lk.ijse.bo.custom.impl;

import lk.ijse.bo.custom.DashboardBO;
import lk.ijse.dao.custom.CustomerDAO;
import lk.ijse.dao.custom.impl.CustomerDAOImpl;

import java.sql.SQLException;

public class DashboardBOImpl implements DashboardBO {

    CustomerDAO customerDAO =new CustomerDAOImpl();
    @Override
    public int countCustomers() throws SQLException {
        return customerDAO.countCustomers();
    }

    @Override
    public int countOrders() {
        return 0;
    }

    @Override
    public double getTotalOrderSales() {
        return 0;
    }

    @Override
    public int countItem() {
        return 0;
    }
}
