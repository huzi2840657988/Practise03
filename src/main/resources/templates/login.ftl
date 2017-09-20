<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
    <title>Hello World!</title>
</head>
    <body>
    <br>
    <br>
    Welcome ${username}!
    <br>
    <br>
    <form method="POST" action="/login">
        <label>Username</label><input type="input" name="username" /><br>
        <label>Password</label><input type="password" name="password" /><br>
        <button type="submit">提交</button><br>
    </form>
    <#list  list as item>
        ${item.id}+"\t"+${item.password}+"\t"+${item.name}
    <#if item_has_next>
        there has next <br>
    </#if>
    </#list>

    </body>
</html>