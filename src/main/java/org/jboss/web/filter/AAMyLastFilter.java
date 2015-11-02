package org.jboss.web.filter;

import java.io.IOException;
import java.util.logging.Logger;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class MyLastFilter
 */
public class AAMyLastFilter implements Filter {
	
	private static final Logger LOG = Logger.getLogger(AAMyLastFilter.class.getName());

    /**
     * Default constructor. 
     */
    public AAMyLastFilter() {
        LOG.info("MyLastFilter created");
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
		LOG.info("Before LAST");

		// pass the request along the filter chain
		chain.doFilter(request, response);
		
		LOG.info("After LAST");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	}

}
