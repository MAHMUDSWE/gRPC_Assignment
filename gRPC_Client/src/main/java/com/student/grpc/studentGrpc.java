package com.student.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: student.proto")
public final class studentGrpc {

  private studentGrpc() {}

  public static final String SERVICE_NAME = "student";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.student.grpc.Student.LoginRequest,
      com.student.grpc.Student.Log_Response> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = com.student.grpc.Student.LoginRequest.class,
      responseType = com.student.grpc.Student.Log_Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.student.grpc.Student.LoginRequest,
      com.student.grpc.Student.Log_Response> getLoginMethod() {
    io.grpc.MethodDescriptor<com.student.grpc.Student.LoginRequest, com.student.grpc.Student.Log_Response> getLoginMethod;
    if ((getLoginMethod = studentGrpc.getLoginMethod) == null) {
      synchronized (studentGrpc.class) {
        if ((getLoginMethod = studentGrpc.getLoginMethod) == null) {
          studentGrpc.getLoginMethod = getLoginMethod = 
              io.grpc.MethodDescriptor.<com.student.grpc.Student.LoginRequest, com.student.grpc.Student.Log_Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "student", "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.student.grpc.Student.LoginRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.student.grpc.Student.Log_Response.getDefaultInstance()))
                  .setSchemaDescriptor(new studentMethodDescriptorSupplier("login"))
                  .build();
          }
        }
     }
     return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.student.grpc.Student.RegisterRequest,
      com.student.grpc.Student.Reg_Response> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Register",
      requestType = com.student.grpc.Student.RegisterRequest.class,
      responseType = com.student.grpc.Student.Reg_Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.student.grpc.Student.RegisterRequest,
      com.student.grpc.Student.Reg_Response> getRegisterMethod() {
    io.grpc.MethodDescriptor<com.student.grpc.Student.RegisterRequest, com.student.grpc.Student.Reg_Response> getRegisterMethod;
    if ((getRegisterMethod = studentGrpc.getRegisterMethod) == null) {
      synchronized (studentGrpc.class) {
        if ((getRegisterMethod = studentGrpc.getRegisterMethod) == null) {
          studentGrpc.getRegisterMethod = getRegisterMethod = 
              io.grpc.MethodDescriptor.<com.student.grpc.Student.RegisterRequest, com.student.grpc.Student.Reg_Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "student", "Register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.student.grpc.Student.RegisterRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.student.grpc.Student.Reg_Response.getDefaultInstance()))
                  .setSchemaDescriptor(new studentMethodDescriptorSupplier("Register"))
                  .build();
          }
        }
     }
     return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.student.grpc.Student.LogoutRequest,
      com.student.grpc.Student.Log_Response> getLogoutMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Logout",
      requestType = com.student.grpc.Student.LogoutRequest.class,
      responseType = com.student.grpc.Student.Log_Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.student.grpc.Student.LogoutRequest,
      com.student.grpc.Student.Log_Response> getLogoutMethod() {
    io.grpc.MethodDescriptor<com.student.grpc.Student.LogoutRequest, com.student.grpc.Student.Log_Response> getLogoutMethod;
    if ((getLogoutMethod = studentGrpc.getLogoutMethod) == null) {
      synchronized (studentGrpc.class) {
        if ((getLogoutMethod = studentGrpc.getLogoutMethod) == null) {
          studentGrpc.getLogoutMethod = getLogoutMethod = 
              io.grpc.MethodDescriptor.<com.student.grpc.Student.LogoutRequest, com.student.grpc.Student.Log_Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "student", "Logout"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.student.grpc.Student.LogoutRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.student.grpc.Student.Log_Response.getDefaultInstance()))
                  .setSchemaDescriptor(new studentMethodDescriptorSupplier("Logout"))
                  .build();
          }
        }
     }
     return getLogoutMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static studentStub newStub(io.grpc.Channel channel) {
    return new studentStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static studentBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new studentBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static studentFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new studentFutureStub(channel);
  }

  /**
   */
  public static abstract class studentImplBase implements io.grpc.BindableService {

    /**
     */
    public void login(com.student.grpc.Student.LoginRequest request,
        io.grpc.stub.StreamObserver<com.student.grpc.Student.Log_Response> responseObserver) {
      asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     */
    public void register(com.student.grpc.Student.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.student.grpc.Student.Reg_Response> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void logout(com.student.grpc.Student.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.student.grpc.Student.Log_Response> responseObserver) {
      asyncUnimplementedUnaryCall(getLogoutMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getLoginMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.student.grpc.Student.LoginRequest,
                com.student.grpc.Student.Log_Response>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.student.grpc.Student.RegisterRequest,
                com.student.grpc.Student.Reg_Response>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getLogoutMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.student.grpc.Student.LogoutRequest,
                com.student.grpc.Student.Log_Response>(
                  this, METHODID_LOGOUT)))
          .build();
    }
  }

  /**
   */
  public static final class studentStub extends io.grpc.stub.AbstractStub<studentStub> {
    private studentStub(io.grpc.Channel channel) {
      super(channel);
    }

    private studentStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected studentStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new studentStub(channel, callOptions);
    }

    /**
     */
    public void login(com.student.grpc.Student.LoginRequest request,
        io.grpc.stub.StreamObserver<com.student.grpc.Student.Log_Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void register(com.student.grpc.Student.RegisterRequest request,
        io.grpc.stub.StreamObserver<com.student.grpc.Student.Reg_Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void logout(com.student.grpc.Student.LogoutRequest request,
        io.grpc.stub.StreamObserver<com.student.grpc.Student.Log_Response> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class studentBlockingStub extends io.grpc.stub.AbstractStub<studentBlockingStub> {
    private studentBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private studentBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected studentBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new studentBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.student.grpc.Student.Log_Response login(com.student.grpc.Student.LoginRequest request) {
      return blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.student.grpc.Student.Reg_Response register(com.student.grpc.Student.RegisterRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.student.grpc.Student.Log_Response logout(com.student.grpc.Student.LogoutRequest request) {
      return blockingUnaryCall(
          getChannel(), getLogoutMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class studentFutureStub extends io.grpc.stub.AbstractStub<studentFutureStub> {
    private studentFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private studentFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected studentFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new studentFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.student.grpc.Student.Log_Response> login(
        com.student.grpc.Student.LoginRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.student.grpc.Student.Reg_Response> register(
        com.student.grpc.Student.RegisterRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.student.grpc.Student.Log_Response> logout(
        com.student.grpc.Student.LogoutRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getLogoutMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LOGIN = 0;
  private static final int METHODID_REGISTER = 1;
  private static final int METHODID_LOGOUT = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final studentImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(studentImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LOGIN:
          serviceImpl.login((com.student.grpc.Student.LoginRequest) request,
              (io.grpc.stub.StreamObserver<com.student.grpc.Student.Log_Response>) responseObserver);
          break;
        case METHODID_REGISTER:
          serviceImpl.register((com.student.grpc.Student.RegisterRequest) request,
              (io.grpc.stub.StreamObserver<com.student.grpc.Student.Reg_Response>) responseObserver);
          break;
        case METHODID_LOGOUT:
          serviceImpl.logout((com.student.grpc.Student.LogoutRequest) request,
              (io.grpc.stub.StreamObserver<com.student.grpc.Student.Log_Response>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class studentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    studentBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.student.grpc.Student.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("student");
    }
  }

  private static final class studentFileDescriptorSupplier
      extends studentBaseDescriptorSupplier {
    studentFileDescriptorSupplier() {}
  }

  private static final class studentMethodDescriptorSupplier
      extends studentBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    studentMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (studentGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new studentFileDescriptorSupplier())
              .addMethod(getLoginMethod())
              .addMethod(getRegisterMethod())
              .addMethod(getLogoutMethod())
              .build();
        }
      }
    }
    return result;
  }
}
