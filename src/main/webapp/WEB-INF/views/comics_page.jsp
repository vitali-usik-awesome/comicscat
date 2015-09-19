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
        <h1><a href="${pageContext.request.contextPath}">Hello, World! Comicscat is here!</a></h1>
        <c:if test="${!empty comics}">
                <div class="comics_page">
                    <h3>${comics.comics_title }</h3>
                    <h4>${comics.comics_title_origin }</h4>
                    <div class="comics_page_wrapper">
                        <div class="comics_img">
                            <img src="${comics.comics_cover_url }" height="250px" />
                        </div>
                        <div class="comics_desc">
                            <p><b>Писатель:</b>
                            <c:forEach items="${comics.writers }" var="opo">
                                ${opo.writer_name }
                            </c:forEach>
                            </p>
                            <p><b>Художник:</b> ${comics.comics_painter }</p>
                            <c:if test="${!empty comics.comics_colorist }">
                                <p><b>Колорист:</b> ${comics.comics_colorist }</p>
                            </c:if>
                            <p><b>Тип:</b> ${comics.comics_type }</p>
                            <p><b>Издатель:</b> ${comics.comics_publisher_origin } <b>Издатель локализации:</b> ${comics.comics_publisher_ru }</p>
                            <p><b>Год выхода:</b> ${comics.comics_date_world_pub } <b>Год локализации:</b> ${comics.comics_date_ru_pub }</p>
                        </div>
                    </div>
                    <p>${comics.comics_description}</p>
                    <p><b>Обзоры:</b></p>
                    <iframe width="448" height="252" src="${comics.comics_videos }" frameborder="0" allowfullscreen></iframe>
                    <p>Similar comics</p>
                    <c:forEach items="${comics.writers }" var="opo">
                        <c:forEach items="${opo.listComics }" var="comics">
                            <p>${comics.comics_title }</p>
                        </c:forEach>
                    </c:forEach>
                </div>
        </c:if>
    </div>
    </body>
</html>