<html>
<body>
    <jsp:include page="header.jsp"></jsp:include>

    <h2>Login form.</h2>

    <form action="cabinet.jsp" method="post">
      <label for="login">Login:</label><br>
      <input type="text" name="login"><br>
      <label for="password">Password:</label><br>
      <input type="password" name="password"><br>
      <input type="submit" value="Submit">
    </form>

    <jsp:include page="footer.jsp"></jsp:include>
</body>