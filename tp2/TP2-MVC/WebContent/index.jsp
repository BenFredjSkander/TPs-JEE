<%@ page contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Insert title here</title>
    <link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
    <script type="text/javascript" src="js/bootstrap.js"></script>
  </head>
  <body>
      <h1 style="text-align: center;">Espace Authentifaction Clients de la banque</h1>
    <div  style="width: 50%; height: 50%; margin: auto; position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    border-radius: 20px;
    border-width: 2px;">
      <form action="AuthentificationServlet" method="post">
        <div class="form-group">
          <label for="emailinput">Email</label>
          <input type="email" name="emailinput" id="emailinput" class="form-control"/>
        </div>
        <div class="form-group">
          <label for="passwordinput">Password</label>
          <input type="password" name="passwordinput" id="passwordinput" class="form-control"/>
        </div>
        <button type="submit" class="btn btn-primary">Sign in</button>
      </form>
    </div>
  </body>
</html>
