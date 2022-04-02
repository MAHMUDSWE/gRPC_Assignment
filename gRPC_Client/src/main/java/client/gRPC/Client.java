package client.gRPC;

import com.student.grpc.Student;
import com.student.grpc.studentGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Logger;

public class Client {

    private static final Logger logger = Logger.getLogger(Client.class.getName());

    public static void main(String[] args) throws IOException {

        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 8080).usePlaintext().build();


        studentGrpc.studentBlockingStub studentStub = studentGrpc.newBlockingStub(channel);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter userID: ");
        long userID = Long.parseLong(br.readLine());

        System.out.print("Enter password: ");
        String password = br.readLine();

        Student.LoginRequest request = Student.LoginRequest.newBuilder().setUsername(userID).setPassword(password).build();

        Student.Log_Response response = studentStub.login(request);

        logger.info("\n" + response.getResponseCode() + "\n" + response.getResponse());

    }
}