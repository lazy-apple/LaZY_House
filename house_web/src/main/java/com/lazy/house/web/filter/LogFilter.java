package com.lazy.house.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author LaZY(李志一)
 * @create 2019-06-05 18:08
 */
public class LogFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

    }
//     Logger logger = LoggerFactory.getLogger(LogFilter.class);
////
////    @Override
////    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
////        logger.info("=================Request--coming==========================");
////        filterChain.doFilter(servletRequest,servletResponse);
    }

