package org.lognet.springboot.grpc.context;

import io.grpc.Server;
import org.springframework.context.ApplicationContext;

public class GRpcServerInitializedEvent extends GrpcServerEvent {
    private Server server;

    public GRpcServerInitializedEvent(ApplicationContext context,Server server) {
        super(context);
        this.server = server;
    }

    public ApplicationContext getApplicationContext(){
        return (ApplicationContext) getSource();
    }
    public Server getServer(){
        return server;
    }
}
