<%-- 
    Document   : arithmeticcalculator
    Created on : Sep 14, 2019, 3:37:12 PM
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
        <h1>Arithmetic Calculator!!!</h1>
        <form method="post">
            Enter your age: <input type="text" name="ageInput"><br>
            <input type="submit" value="Age next birthday">
        </form>
        <div>${curAge}</div>
        <a href="/Week2Lab_Calculators/age">Age Calculator</a>
    </body>
</html>
