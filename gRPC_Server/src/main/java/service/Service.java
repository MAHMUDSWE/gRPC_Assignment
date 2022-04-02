package service;

import com.student.grpc.Student;
import com.student.grpc.studentGrpc;
import io.grpc.stub.StreamObserver;

import java.sql.*;
import java.util.logging.Logger;

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
       // long result_ID = resultSet.getLong("registrationID");
       // String result_pass = resultSet.getString("password");

       // System.out.println(result_ID);
        System.out.println(userName);
       // System.out.println(result_pass);
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
        Connection connection = DriverManager.getConnection(url, user, pass);
        Statement statement = connection.createStatement();

        String query = " SELECT EXISTS( SELECT registrationID, password FROM tbl_info WHERE registrationID = '"+userName+"' AND password = '"+password+"');" ;

        return statement.executeQuery(query);
    }

}
