<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sform"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html;charset=UTF-8" language="java"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf8">
        <title>comicscat</title>
        <link href="${pageContext.request.contextPath}/resources/css/test_style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div class="wrapper">
        <!-- header -->
        <%@ include file="../jspf/header.jspf" %>  
        <!-- /header -->
        <!-- content -->
        <div class="content">
            <h2>Create a new user account</h2>
            <sform:form method="POST" modelAttribute="user">
                <fieldset>
                    <table>
                        <tr>
                            <td><!-- id --></td>
                            <td><sform:input path="user_id" type="hidden" id="user_id"/></td>
                        </tr>
                        <tr>
                            <td><label for="user_login">Login: </label></td>
                            <td>
                                <sform:input path="user_login" size="15" maxlength="15" id="user_login"/>
                                <small id="login_msg">No spaces, please. Only english letters please!</small>
                                <sform:errors path="user_login" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td><label for="user_pass">Password: </label></td>
                            <td>
                                <sform:input path="user_pass" size="30" showPassword="true" id="user_pass"/>
                                <small id="pass_msg">5 characters or more</small>
                                <sform:errors path="user_pass" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td><label for="user_name">Name: </label></td>
                            <td>
                                <sform:input path="user_name" size="30" id="user_name"/>
                                <sform:errors path="user_name" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td><label for="user_surname">Surname: </label></td>
                            <td>
                                <sform:input path="user_surname" size="30" id="user_surname"/>
                                <sform:errors path="user_surname" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td><label for="user_mail">E-mail: </label></td>
                            <td>
                                <sform:input path="user_mail" size="50" id="user_mail"/>
                                <small>In case you forget something</small>
                                <sform:errors path="user_mail" cssClass="error" />
                            </td>
                        </tr>
                        <tr>
                            <td><label for="user_register_date">Дата регистрации: </label></td>
                            <td>
                                <sform:input path="user_register_date" id="user_register_date"/>
                            </td>
                        </tr>
                        <tr>
                            <td><label for="user_role">Role: </label></td>
                            <td>
                                <sform:select path="user_role" id="user_role">
                                    <option value="user">User</option>
                                    <option value="admin">Admin</option>
                                </sform:select>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td><input name="commit" type="submit" value="Create new account." /></td>
                        </tr>
                    </table>
                </fieldset>
            </sform:form>
        </div>
        <!-- /content -->
        </div>
    </body>
</html>