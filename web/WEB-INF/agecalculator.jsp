<%-- 
    Document   : agecalculator
    Created on : Sep 13, 2019, 2:38:44 PM
    Author     : 657306
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Week 2 Lab - Calculators</title>
    </head>
    <body>
        <h1>Age Calculator!!!</h1>
        <form method="post">
            Enter your age: <input type="text"><br>
            <input type="submit" value="Age next birthday">
        </form>
        <div>${userAge}</div>
    </body>
</html>
