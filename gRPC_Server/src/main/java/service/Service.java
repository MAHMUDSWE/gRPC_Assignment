package service;

import com.student.grpc.Student;
import com.student.grpc.studentGrpc;
import io.grpc.stub.StreamObserver;

import java.sql.*;
import java.util.logging.Logger;

import static java.sql.DriverManager.getConnection;

public class Service extends studentGrpc.studentImplBase {

    private static final Logger logger = Logger.getLogger(studentGrpc.class.getName());

    String url = "jdbc:mysql://localhost:3306/grpcassignment";
    String user = "root";
    String pass = "";

    @Override
    public void login(Student.LoginRequest request, StreamObserver<Student.Log_Response> responseObserver) throws SQLException {

        long  userName = request.getUsername();
        String password = request.getPassword();

        ResultSet resultSet = checkLoginInfo(userName, password);
        resultSet.next();

        int exists = resultSet.getInt(1);

        System.out.println(userName);

        System.out.println(password);

        Student.Log_Response.Builder response = new Student.Log_Response.Builder();

        if (exists == 1)
        {
                response.setResponseCode(200).setResponse("Successfully Logged in");
                logger.info("Login Successful for user " + userName);
        }
        else
        {
            response.setResponseCode(400).setResponse("Invalid username or password. Try again.");
            logger.info("Login failed for user " + userName);
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();

    }

    private ResultSet checkLoginInfo(long userName, String password) throws SQLException
    {
        Connection connection = getConnection(url, user, pass);
        Statement statement = connection.createStatement();

        String query = " SELECT EXISTS( SELECT registrationID, password FROM tbl_info WHERE registrationID = '"+userName+"' AND password = '"+password+"');" ;

        return statement.executeQuery(query);
    }

    @Override
    public void register(Student.RegisterRequest request, StreamObserver<Student.Reg_Response> responseObserver) throws SQLException {

        long regID = request.getRegistrationID();
        String studentName = request.getStudentName();

        String email = request.getEmail();
        String phone = request.getPhoneNumber();
        String password = request.getPassword();

        System.out.println(regID);
        ResultSet resultSet = checkRegInfo(regID);
        resultSet.next();

        int exists = resultSet.getInt(1);
        System.out.println(exists);

        Student.Reg_Response.Builder regResponse = new Student.Reg_Response.Builder();

            if(exists == 1)
            {
                regResponse.setResponse("Registration ID " + regID + " is already registered.").setResponseCode(500);
                System.out.println("User with registration ID " +regID + " is already registered. ");
            }

            else
            {
                Connection connection = getConnection(url, user, pass);

                Statement statement = connection.createStatement();
                String query = "INSERT INTO tbl_info VALUES ('"+regID+"', '"+studentName+"', '"+email+"', '"+phone+"', '"+password+"'); ";

                statement.executeUpdate(query);

                regResponse.setResponse(studentName + " with registration ID " + regID + " registered successfully").setResponseCode(300);
                System.out.println("Registration Successful for new user with registration ID " + regID);
            }



        responseObserver.onNext(regResponse.build());
        responseObserver.onCompleted();
    }

    private ResultSet checkRegInfo(long regID) throws SQLException {

        Connection connection = getConnection(url, user, pass);
        Statement statement = connection.createStatement();

        System.out.println("ChekingRegInfo....");

        String query = " SELECT EXISTS( SELECT registrationID FROM tbl_info WHERE registrationID = '"+regID+"'); " ;

        System.out.println("Done checking");

        return statement.executeQuery(query);
    }

    @Override
    public void logout(Student.LogoutRequest request, StreamObserver<Student.Log_Response> responseObserver) {
    }
}
