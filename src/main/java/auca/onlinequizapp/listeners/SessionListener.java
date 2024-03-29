package auca.onlinequizapp.listeners;

import jakarta.servlet.http.HttpSessionListener;
import jakarta.servlet.http.HttpSessionEvent;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SessionListener implements HttpSessionListener {
    private static final Logger logger = LoggerFactory.getLogger(SessionListener.class);

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        logger.info("Session created: " + se.getSession().getId());
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        logger.info("Session destroyed: " + se.getSession().getId());
    }
}
