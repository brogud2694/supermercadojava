package Data;

import Domain.Employee;
import Domain.Job;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author kenne
 */
public class EmployeeData {

    //   private Connection conn;
    private Database databaseConn;

    public EmployeeData() throws ClassNotFoundException, SQLException {
        databaseConn = new Database();

    }

    public Employee[] getAllEmployes() throws SQLException {
        this.databaseConn.openConnection();
        Connection conn = databaseConn.getConnection();
        Statement statment;
        ResultSet resultSet;

        statment = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        resultSet = statment.executeQuery("SELECT * FROM Empleado");

        int rowCount = 0;

        try {
            resultSet.last();
            rowCount = resultSet.getRow();
            resultSet.beforeFirst();
        } catch (Exception ex) {

        }

        Employee[] employeArray = new Employee[rowCount];
        Employee currentEmployee;
        int index = 0;

        while (resultSet.next()) {
            currentEmployee = new Employee();
            currentEmployee.setDNI(resultSet.getInt(1));
            currentEmployee.setName(resultSet.getString(2));
            currentEmployee.setLastName(resultSet.getString(3));
            currentEmployee.setJob(new Job(resultSet.getInt(4)));
            currentEmployee.setGender(resultSet.getString(5).charAt(0));
            currentEmployee.setF_nac(resultSet.getDate(6));
            currentEmployee.setTel_1(resultSet.getString(7));
            currentEmployee.setTel_2(resultSet.getString(8));
            currentEmployee.setDirection(resultSet.getString(9));
            employeArray[index++] = currentEmployee;
            System.out.println(currentEmployee.toString());
            System.out.println(resultSet.getDate(6).toString());
        }

        if (resultSet
                != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
            }
        }
        if (statment
                != null) {
            try {
                statment.close();
            } catch (SQLException e) {
            }
        }
        if (conn != null) {
            this.databaseConn.closeConnection();
        }
        return employeArray;
    }

    public Employee getEmployee(int idEmployee) throws SQLException {
        this.databaseConn.openConnection();
        Connection conn = databaseConn.getConnection();
        Statement statment;
        ResultSet resultSet;

        statment = conn.createStatement();
        resultSet = statment.executeQuery("SELECT * FROM Empleado WHERE dni=" + idEmployee);

        Employee newEmployee = new Employee();
        resultSet.next();
        if (resultSet.getRow() != 0) {
            newEmployee.setDNI(resultSet.getInt(1));
            newEmployee.setName(resultSet.getString(2));
            newEmployee.setLastName(resultSet.getString(3));
            newEmployee.setJob(new Job(resultSet.getInt(4)));
            newEmployee.setGender(resultSet.getString(5).charAt(0));
            newEmployee.setF_nac(resultSet.getDate(6));
            newEmployee.setTel_1(resultSet.getString(7));
            newEmployee.setTel_2(resultSet.getString(8));
            newEmployee.setDirection(resultSet.getString(9));
        }
        System.out.println(resultSet.getRow());

        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
            }
        }
        if (statment != null) {
            try {
                statment.close();
            } catch (SQLException e) {
            }
        }
        if (conn != null) {
            this.databaseConn.closeConnection();
        }
        return newEmployee;
    }

    public void insertEmployee(Employee employeeToInsert) throws SQLException {

        this.databaseConn.openConnection();
        Connection conn = databaseConn.getConnection();

        CallableStatement call = conn.prepareCall("{call sp_insertar_empleado(?,?,?,?,?,?,?,?,?,?)}");

        call.setInt(1, employeeToInsert.getDNI());
        call.setString(2, employeeToInsert.getName());
        call.setString(3, employeeToInsert.getLastName());
        call.setInt(4, employeeToInsert.getJob().getIdJob());
        call.setString(5, employeeToInsert.getGender() + "");
        call.setDate(6, employeeToInsert.getF_nac());
        call.setString(7, employeeToInsert.getTel_1());
        call.setString(8, employeeToInsert.getTel_2());
        call.setString(9, employeeToInsert.getDirection());
        call.setString(10, employeeToInsert.getPass());

        try {
            call.execute();
        } catch (SQLException e) {
            System.err.println(e);
        } finally {
            if(conn != null){
               this.databaseConn.closeConnection(); 
            }
            
        }
    }

    public Employee login(int dni, String pass) {

        return null;
    }
}
