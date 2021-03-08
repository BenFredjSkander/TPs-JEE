<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="css/bootstrap.css" type="text/css" />
    <script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body>
<div style="width: 400px; height: 50%; margin: auto; position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    border-radius: 20px;
    border-width: 2px;">
    <h1>Inscription</h1>
    <form method="post" action="" style="border: 3px solid #2fb74e;
    padding: 10px;
    box-shadow:5px 5px 5px #4e555b;
    border-radius: 15px">
    	<div class="form-group">
    	<input type="email" placeholder="E-mail" id="email" name="email" class="form-control" required>
    	</div>
        <div class="form-row">
            <div class="col">
                <label>
                    <input type="password" name="pass1" id="pass" placeholder="Password" required class="form-control">
                </label>
            </div>
            <div class="col">
                <label>
                    <input type="password" name="pass2"  id="pass2" placeholder="Retype your password" required class="form-control">
                </label>
            </div>

        </div>
        <div class="form-group">
        	<input type="text" placeholder="name" id="name" class="form-control">
        </div>
        <button type="submit" class="btn btn-success" style="width: 40%; margin-left: 30%; margin-right: 30%;">Inscription</button>
    </form>
</div>
</body>
</html>
