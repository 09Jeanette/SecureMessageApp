<%-- 
    Document   : output
    Created on : 30 Jun 2024, 4:01:17 PM
    Author     : Jeanette
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>output Page</title>
    </head>
    <body>
         <h1>Encrypted Message</h1>
        
        <%
        String encryptedMessage = (String) request.getAttribute("encrypted_message");
        %>
        
        <p>Your encrypted message is:</p>
        <p><strong><%= encryptedMessage %></strong></p>
        
        <p>Click <a href="input.html">here</a> to encrypt another message.</p>
    </body>
</html>