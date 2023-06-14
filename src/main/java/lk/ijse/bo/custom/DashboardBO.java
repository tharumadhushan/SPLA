package lk.ijse.bo.custom;

import java.sql.SQLException;

public interface DashboardBO {
    int countCustomers() throws SQLException;

    int countOrders();

    double getTotalOrderSales();

    int countItem();
}
