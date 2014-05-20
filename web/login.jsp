<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>GTS</title>
    <style>
        <%@include file='css/style.css' %>
    </style>
</head>
<body>
    <div class="all">
        <div class="out">
            <div class="central">
                <div class="inner">
                    <form method="post" action="login_servlet">
                        <h2>LOG  IN</h2>
                        <div>
                            <input type="text" name="username" value="" placeholder="username" />
                        </div>
                        <div>
                            <input type="text" placeholder="password" name="password" value="" />
                        </div>
                        <div>
                            <input type="submit" value="GO!" name="command" />
                        </div>
                    </form>
                    <div class="reg">
                        <a href="">REGISTRATION</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
