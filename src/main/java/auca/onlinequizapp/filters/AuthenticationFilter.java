//package auca.onlinequizapp.filters;
//
//import java.util.logging.Filter;
//import jakarta.servlet.*;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import jakarta.servlet.http.HttpSession;
//
//import java.io.IOException;
//import java.util.logging.LogRecord;
//
//public  class AuthenticationFilter implements Filter {
//    @Override
//    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
//        HttpServletRequest httpRequest = (HttpServletRequest) request;
//        HttpServletResponse httpResponse = (HttpServletResponse) response;
//        HttpSession session = httpRequest.getSession(false);
//
//        String requestURI = httpRequest.getRequestURI();
//
//        if (requestURI.endsWith("/login") || requestURI.endsWith("/register") || (session != null && session.getAttribute("user") != null)) {
//            chain.doFilter(request, response);
//        } else {
//            httpResponse.sendRedirect(httpRequest.getContextPath() + "/login");
//        }
//    }
//
//
//    @Override
//    public boolean isLoggable(LogRecord record) {
//        return false;
//    }
//}
