<%@page import="models.Emp"%>
<%
    Emp employer=(Emp)request.getAttribute("Emp");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Bienvenue</title>
</head>
<body>
        <h1>Bienvenue <%out.print(employer.getprenom()+" "+employer.getnom());%> </h1>
</body>
</html>