package org.jboss.web.filter;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class LoggingFilter
 */
//@WebFilter(filterName = "all", urlPatterns = { "/*" })
public class LoggingFilter implements Filter {

	private static final Logger LOG = Logger.getLogger(LoggingFilter.class.getName());
	
    /**
     * Default constructor. 
     */
    public LoggingFilter() {
        LOG.info("LoggingFilter created");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		LOG.info("Before log processing");

		// pass the request along the filter chain
		chain.doFilter(request, response);

		LOG.info("After log processing");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
