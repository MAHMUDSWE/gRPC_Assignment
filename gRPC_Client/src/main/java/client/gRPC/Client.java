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

        int choice;
        do
        {
            System.out.println("Press 1 to Register.");
            System.out.println("Already have an Account?\nPress 2 to Log in. ");

            System.out.print("Choose: ");
            choice = Integer.parseInt(br.readLine());

            switch (choice)
            {
                case 2:
                {
                    System.out.print("Enter userID: ");
                    long userID = Long.parseLong(br.readLine());

                    System.out.print("Enter password: ");
                    String loginPassword = br.readLine();

                    Student.LoginRequest loginRequest = Student.LoginRequest.newBuilder().setUsername(userID).setPassword(loginPassword).build();

                    Student.Log_Response loginResponse = studentStub.login(loginRequest);

                    //logger.info("\n" + loginResponse.getResponseCode() + "\n" + loginResponse.getResponse());
                    System.out.println(loginResponse.getResponseCode()+ "\n" + loginResponse.getResponse() +"\n");

                    if (loginResponse.getResponseCode() == 200)
                    {
                        choice = 3;
                    }
                }

                break ;

                case 1:
                {
                    System.out.print("Enter RegistrationID: ");
                    long regID = Long.parseLong(br.readLine());

                    System.out.print("Enter Name: ");
                    String studentName = br.readLine();

                    System.out.print("Enter Email: ");
                    String email = br.readLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = br.readLine();

                    System.out.print("Enter Password: ");
                    String password = br.readLine();

                    Student.RegisterRequest regRequest = Student.RegisterRequest.newBuilder().setRegistrationID(regID).setStudentName(studentName)
                            .setEmail(email).setPhoneNumber(phone).setPassword(password).build();

                    Student.Reg_Response regResponse =  studentStub.register(regRequest);

                    //logger.info("\n" + regResponse.getResponseCode() + "\n" + regResponse.getResponse() );
                    System.out.println(regResponse.getResponseCode()+ "\n" + regResponse.getResponse() +"\n") ;
                }
                break;

                default:
                {

                }
                break;
        }
        }while(choice != 3 );

    }
}