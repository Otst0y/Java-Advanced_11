<html>
<body>
    <jsp:include page="header.jsp"></jsp:include>

    <h2>Login form.</h2>

    <form action="login" method="post">
      <label for="email">Login:</label><br>
      <input type="text" name="email"><br>
      <label for="password">Password:</label><br>
      <input type="password" name="password"><br>
      <input type="submit" value="Submit">
    </form>

    <jsp:include page="footer.jsp"></jsp:include>
</body>