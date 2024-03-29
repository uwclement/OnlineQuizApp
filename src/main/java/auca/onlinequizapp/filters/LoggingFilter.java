package auca.onlinequizapp.filters;

import jakarta.servlet.*;

import jakarta.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.logging.Logger;
public class LoggingFilter implements Filter {
    private static final Logger logger = Logger.getLogger(LoggingFilter.class.getName());
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) request;
        String requestURI = httpRequest.getRequestURI();
        logger.info("Request received for URI: " + requestURI);

        chain.doFilter(request, response);

        logger.info("Response sent for URI: " + requestURI);
    }
}
