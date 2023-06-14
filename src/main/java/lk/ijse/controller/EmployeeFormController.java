package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import lk.ijse.Model.EmployeeDTO;
import lk.ijse.bo.custom.EmployeeBO;
import lk.ijse.dao.DAOFactory;


import java.sql.SQLException;

public class EmployeeFormController {

    @FXML
    private TextField empAdress;

    @FXML
    private TextField empContact;

    @FXML
    private TextField empId;

    @FXML
    private TextField empName;

    @FXML
    private TextField empNic;

    EmployeeBO employeeBO = (EmployeeBO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.EMPLOYEE);
    @FXML
    void btnDeleteOnAction(ActionEvent event) {
        if (empId.getText().matches("^[E0-9]{4}$")) {
            String id = empId.getText();

            boolean isDelete = employeeBO.delete(id);
            if (isDelete) {
                new Alert(Alert.AlertType.CONFIRMATION, "ok").show();
            }
        }else {
            new Alert(Alert.AlertType.WARNING,"ID NOT VALIED !!!").show();
        }
    }

    @FXML
    void btnSaveOnAction(ActionEvent event) {
        if (empId.getText().matches("^[E0-9]{4}$")) {
            String name = empName.getText();
            String contact = empContact.getText();
            String id = empId.getText();
            String nic = empNic.getText();
            String adress = empAdress.getText();

            EmployeeDTO employee = new EmployeeDTO(name, contact, id, nic, adress);

            boolean isSave = employeeBO.save(employee);

            if (isSave) {
                new Alert(Alert.AlertType.CONFIRMATION, "Ok").show();
            }

        } else {
            new Alert(Alert.AlertType.WARNING, "ID NOT VALIED !!!").show();
        }
    }

    @FXML
    void btnSearchOnAction(ActionEvent event) {
        if (empId.getText().matches("^[E0-9]{4}$")) {
            String id = empId.getText();
            EmployeeDTO employee = employeeBO.search(id);
            if (employee != null) {
                empName.setText(employee.getEmployeeName());
                empContact.setText(employee.getContact());
                empId.setText(employee.getEmployeeId());
                empNic.setText(employee.getEmployeenic());
                empAdress.setText(employee.getEmployeeAdress());
            }

        } else {
            new Alert(Alert.AlertType.WARNING, "ID NOT VALIED !!!").show();
        }
    }

    @FXML
    void btnUpdateOnAction(ActionEvent event) {
        if (empId.getText().matches("^[E0-9]{4}$")) {
            String name = empName.getText();
            String contact = empContact.getText();
            String id = empId.getText();
            String nic = empNic.getText();
            String adress = empAdress.getText();

            EmployeeDTO employee = new EmployeeDTO(name, contact, id, nic, adress);
            try {
                boolean isUpdate = employeeBO.Update(employee);
                if (isUpdate) {
                    new Alert(Alert.AlertType.CONFIRMATION, "OK").show();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            new Alert(Alert.AlertType.WARNING, "ID NOT VALIED !!!").show();
        }
    }

    public void btnClearOnAction(ActionEvent actionEvent) {
        empName.setText("");
        empContact.setText("");
        empId.setText("");
        empNic.setText("");
        empAdress.setText("");
    }
}