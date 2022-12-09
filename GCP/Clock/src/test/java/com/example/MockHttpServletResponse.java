package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.Principal;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Locale;
import java.util.Map;


import jakarta.servlet.AsyncContext;
import jakarta.servlet.DispatcherType;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpUpgradeHandler;
import jakarta.servlet.http.Part;

/**
 * This mock class is created to enable basic unit testing of the
 * {@link HelloAppEngine} class. Only methods used in the unit test
 * have a non-trivial implementation.
 * 
 * Feel free to change this class or replace it using other ways for testing
 * {@link HttpServlet}s, e.g. Spring MVC Test or Mockito to suit your needs.
 */
class MockHttpServletResponse implements HttpServletRequest {

  private String contentType;
  private String encoding;
  private StringWriter writerContent = new StringWriter();
  private PrintWriter writer = new PrintWriter(writerContent);

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public String getContentType() {
    return contentType;
  }

  public PrintWriter getWriter() throws IOException {
    return writer;
  }

  public StringWriter getWriterContent() {
    return writerContent;
  }

  // anything below is the default generated implementation

  public void flushBuffer() throws IOException {
  }

  public int getBufferSize() {
    return 0;
  }

  public String getCharacterEncoding() {
    return encoding;
  }

  public Locale getLocale() {
    return null;
  }

  public jakarta.servlet.ServletOutputStream getOutputStream() throws IOException {
    return null;
  }

  public boolean isCommitted() {
    return false;
  }

  public void reset() {
  }

  public void resetBuffer() {
  }

  public void setBufferSize(int size) {
  }

  public void setCharacterEncoding(String encoding) {
    this.encoding = encoding;
  }

  public void setContentLength(int length) {
  }

  public void setLocale(Locale locale) {
  }

  public void addCookie(jakarta.servlet.http.Cookie cookie) {
  }

  public void addDateHeader(String name, long date) {
  }

  public void addHeader(String name, String value) {
  }

  public void addIntHeader(String name, int value) {
  }

  public boolean containsHeader(String name) {
    return false;
  }

  public String encodeRedirectURL(String url) {
    return null;
  }

  @Deprecated
  public String encodeRedirectUrl(String url) {
    return null;
  }

  public String encodeURL(String url) {
    return null;
  }

  @Deprecated
  public String encodeUrl(String url) {
    return null;
  }

  public void sendError(int statusCode) throws IOException {
  }

  public void sendError(int statusCode, String message) throws IOException {
  }

  public void sendRedirect(String url) throws IOException {
  }

  public void setDateHeader(String name, long date) {
  }

  public void setHeader(String name, String value) {
  }

  public void setIntHeader(String name, int value) {
  }

  public void setStatus(int statusCode) {
  }

  @Deprecated
  public void setStatus(int statusCode, String message) {
  }

  // Servlet API 3.0 and 3.1 methods
  public void setContentLengthLong(long length) {
  }

  public int getStatus() {
    return 0;
  }

  public String getHeader(String name) {
    return null;
  }

  public Collection<String> getHeaders1(String name) {
    return null;
  }

  public Collection<String> getHeaderNames1() {
    return null;
  }

@Override
public AsyncContext getAsyncContext() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Object getAttribute(String arg0) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Enumeration<String> getAttributeNames() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int getContentLength() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public long getContentLengthLong() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public DispatcherType getDispatcherType() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public ServletInputStream getInputStream() throws IOException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getLocalAddr() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getLocalName() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int getLocalPort() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public Enumeration<Locale> getLocales() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getParameter(String arg0) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Map<String, String[]> getParameterMap() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Enumeration<String> getParameterNames() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String[] getParameterValues(String arg0) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getProtocol() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public BufferedReader getReader() throws IOException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getRealPath(String arg0) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getRemoteAddr() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getRemoteHost() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int getRemotePort() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public RequestDispatcher getRequestDispatcher(String arg0) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getScheme() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getServerName() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int getServerPort() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public ServletContext getServletContext() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean isAsyncStarted() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isAsyncSupported() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isSecure() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void removeAttribute(String arg0) {
	// TODO Auto-generated method stub
	
}

@Override
public void setAttribute(String arg0, Object arg1) {
	// TODO Auto-generated method stub
	
}

@Override
public AsyncContext startAsync() throws IllegalStateException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public AsyncContext startAsync(ServletRequest arg0, ServletResponse arg1) throws IllegalStateException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean authenticate(jakarta.servlet.http.HttpServletResponse arg0) throws IOException, ServletException {
	// TODO Auto-generated method stub
	return false;
}

@Override
public String changeSessionId() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getAuthType() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getContextPath() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public jakarta.servlet.http.Cookie[] getCookies() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public long getDateHeader(String arg0) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public Enumeration<String> getHeaderNames() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Enumeration<String> getHeaders(String arg0) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public int getIntHeader(String arg0) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public String getMethod() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Part getPart(String arg0) throws IOException, ServletException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Collection<Part> getParts() throws IOException, ServletException {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getPathInfo() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getPathTranslated() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getQueryString() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getRemoteUser() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getRequestURI() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public StringBuffer getRequestURL() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getRequestedSessionId() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public String getServletPath() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public HttpSession getSession() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public HttpSession getSession(boolean arg0) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Principal getUserPrincipal() {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean isRequestedSessionIdFromCookie() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isRequestedSessionIdFromURL() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isRequestedSessionIdFromUrl() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isRequestedSessionIdValid() {
	// TODO Auto-generated method stub
	return false;
}

@Override
public boolean isUserInRole(String arg0) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public void login(String arg0, String arg1) throws ServletException {
	// TODO Auto-generated method stub
	
}

@Override
public void logout() throws ServletException {
	// TODO Auto-generated method stub
	
}

@Override
public <T extends HttpUpgradeHandler> T upgrade(Class<T> arg0) throws IOException, ServletException {
	// TODO Auto-generated method stub
	return null;
}
}
