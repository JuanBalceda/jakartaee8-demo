package com.balceda.demo.interceptor;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;
import java.time.LocalDateTime;
import java.util.logging.Level;
import java.util.logging.Logger;

@Logged
@Interceptor
@Priority(Interceptor.Priority.APPLICATION) // @Priority activates de Interceptor
public class LoggedInterceptor {

    @Inject
    private Logger logger;

    private String user = "Juan";

    @AroundInvoke
    public Object logMethodCall(InvocationContext context) throws Exception {
        logger.log(Level.INFO, "User {0} invoked {1}.{2} method at {3}", new Object[]{user, context.getClass().getName(), context.getMethod().getName(), LocalDateTime.now()});

        return context.proceed();
    }
}
