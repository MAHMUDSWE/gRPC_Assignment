package server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import service.Service;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class GRPCServer {

    private static final Logger logger = Logger.getLogger(GRPCServer.class.getName());

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Starting GRPC Server.....");

        Server server = ServerBuilder.forPort(8080).addService(new Service()).build();
        server.start();

        logger.info("Server started at port : " + server.getPort());

        server.awaitTermination(60, TimeUnit.SECONDS);
    }
}
