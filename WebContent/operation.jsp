<%--
  Created by IntelliJ IDEA.
  User: Skander
  Date: 28-Feb-21
  Time: 6:03 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Operation</title>
    <link rel="stylesheet" href="css/bootstrap.css" type="text/css">
    <script type="text/javascript" src="js/bootstrap.js"></script>
</head>
<body>
    <div class="container" style="width: 50%; height: 50%; margin: auto; position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    border-radius: 20px;
    border-width: 2px;">
    <b>Votre solde bancaire contient 300TND</b>
        <form method="post" action="TransactionServlet">
			<div class="custom-control custom-radio">
			  <input type="radio" id="virement" name="customRadio" class="custom-control-input">
			  <label class="custom-control-label" for="virement"">Un Virement</label>
			</div>
			<div class="custom-control custom-radio">
			  <input type="radio" id="retrait" name="customRadio" class="custom-control-input">
			  <label class="custom-control-label" for="retrait"retrait"">un retrait</label>
			</div>
            <div class="input-group form-group">
                <input type="text" class="form-control" aria-label="Amount" name="montant" id="montant">
                <div class="input-group-append">
                    <span class="input-group-text">TND</span>
                    <span class="input-group-text">0.00</span>
                </div>
<br>
            <div class="row">
                <button type="submit" name="lancer" class="btn btn-success">Lancer la transaction</button>
                <button type="reset" name="reset" class="btn btn-danger">Effacer</button>
            </div>
        </form>
    </div>
</body>
</html>
