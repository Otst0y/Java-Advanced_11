<html>
<body>
    <jsp:include page="header.jsp"></jsp:include>

    <h2>Registration form.</h2>

    <form action="registration" method="post">
      <label for="name">First name:</label><br>
      <input type="text" name="name"><br>
      <label for="lastName">Last name:</label><br>
      <input type="text" name="lastName"><br>
      <label for="email">Email:</label><br>
      <input type="text" name="email"><br>
      <label for="password">Password:</label><br>
      <input type="password" name="password"><br>
      <input type="submit" value="Submit">
    </form>

    <jsp:include page="footer.jsp"></jsp:include>
</body>
</html>
