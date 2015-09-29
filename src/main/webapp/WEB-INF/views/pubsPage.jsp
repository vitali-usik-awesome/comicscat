<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html;charset=UTF-8" language="java"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=utf8">
        <title>${comics.comics_title }</title>
        <link href="${pageContext.request.contextPath}/resources/css/test_style.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
        <div class="wrapper">
        <!-- header -->
        <%@ include file="jspf/header.jspf" %>  
        <!-- /header -->
        <c:if test="${!empty pub}">
            <c:forEach items="${pub}" var = "p">
                <div class="pubs_page">
                    <h3>Издательство ${p.lpub_name }</h3>
                    <h4>${p.lpub_country }, ${p.lpub_city }</h4>
                    <div class="pubs_page_wrapper">
                        <div class="pub_img">
                            <img src="${p.lpub_logo_url }"/>
                        </div>
                        <div class="pubs_desc">
                            <p><b>Образовано:</b> ${p.lpub_founded }</p>
                            <p><b>Статус:</b> ${p.lpub_status }</p>
                            <p><b>Cайт:</b> <a href="${p.lpub_site }">${p.lpub_site }</a></p>
                            <p><b>VK:</b> <a href="${p.lpub_vk }">${p.lpub_vk }</a></p>
                            <p><b>pr e-mail:</b> ${p.lpub_mail_pr }</p>
                            <p><b>sales e-mail:</b> ${p.lpub_mail_sales }</p>
                            <p><b>Адрес:</b> ${p.lpub_address }</p>
                            <p><b>Телефон:</b> ${p.lpub_phone }</p>
                        </div>
                    </div>
                    <p>${p.lpub_desc }</p>
                </div>
            </c:forEach>
        </c:if>
    </div>
    </body>
</html>