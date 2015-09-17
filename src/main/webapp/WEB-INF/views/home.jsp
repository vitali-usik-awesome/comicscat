<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
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
        <h1>Hello, World! Comicscat is here!</h1>
        <c:if test="${!empty comicsList}">
            <c:forEach items="${comicsList}" var="pop">
                <div class="comics_item">
                    <h3>${pop.comics_title }</h3>
                    <h4>${pop.comics_title_origin }</h4>
                    <div class="comics_desc_wrapper">
                        <div class="comics_img">
                            <img src="${pop.comics_cover_url }" height="150px" />
                        </div>
                        <div class="comics_desc">
                            <p><b>Писатель:</b> ${pop.comics_writer }</p>
                            <p><b>Художник:</b> ${pop.comics_painter }</p>
                            <c:if test="${!empty pop.comics_colorist }">
                                <p><b>Колорист:</b> ${pop.comics_colorist }</p>
                            </c:if>
                            <p><b>Тип:</b> ${pop.comics_type }</p>
                            <p><b>Издатель:</b> ${pop.comics_publisher_origin } <b>Издатель локализации:</b> ${pop.comics_publisher_ru }</p>
                        </div>
                    </div>
                    <p>${pop.comics_description}</p>
                    <!-- <p>${pop.comics_videos }</p> -->
                    <p></p>
                    
                </div>
            </c:forEach>
        </c:if>
    </div>
    </body>
</html>