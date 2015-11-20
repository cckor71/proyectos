<%--
Views should be stored under the WEB-INF folder so that
they are not accessible except through controller process.

This JSP is here to provide a redirect to the dispatcher
servlet but should be the only JSP outside of WEB-INF.
--%>
<%@page import="java.util.List"%>
<%@page import="pojo.Customer"%>
<%@page import="pojo.Customer"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!--% response.sendRedirect("index.htm"); %> -->
<html>
    <head><title> Hola Customer</title></head>
    <body>
        <h1>Customer</h1>
        <%
            facade.CustomerFacade customerFacade = new facade.CustomerFacade();
            List<Customer> customers = customerFacade.getListaClientes();
        %>
        <%
            for(Customer c:customers){
                out.print("<p>" +c.getName() +"</p>");
            }
        %>
        <%-- 
        <p><%= c.getName() %></p>
        <% } %>
        --%>
    </body>
