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
                                    <a href="${pageContext.request.contextPath}/writer/${opo.writer_link}">${opo.writer_name }</a>
                                </c:forEach>
                            </p>
                            <p><b>Художник:</b>
                                <c:forEach items="${pop.painters }" var="p">
                                    <a href="${pageContext.request.contextPath}/painter/${p.painter_link}">${p.painter_name }</a>
                                </c:forEach>
                            </p>
                            <c:if test="${!empty comics.comics_colorist }">
                                <p><b>Колорист:</b> ${comics.comics_colorist }</p>
                            </c:if>
                            <p><b>Тип:</b> ${comics.comics_type }</p>
                            <p><b>Издатель:</b> <a href="${pageContext.request.contextPath}/pub/${comics.publisher.pub_link}">${comics.publisher.pub_name }</a> <b>Издатель локализации:</b> <a href="${pageContext.request.contextPath}/localpub/${comics.localpublisher.lpub_link}">${comics.localpublisher.lpub_name }</a></p>
                            <p><b>Год выхода:</b> ${comics.comics_date_world_pub } <b>Год локализации:</b> ${comics.comics_date_ru_pub }</p>
                            <p>${comics.comics_format }/ ${comics.comics_num_pages } страниц</p>
                            <p><b>Переплет: </b>${comics.comics_binding }</p>
                            <p><b>ISBN: </b>${comics.comics_isbn }</p>
                            <p><b>Тираж: </b>${comics.comics_numCopies } копий, <b>Вес: </b>${comics.comics_weight } грамм</p>
                        </div>
                    </div>
                    <p>${comics.comics_description}</p>
                    <p><b>Обзоры:</b></p>
                    <iframe width="448" height="252" src="${comics.comics_videos }" frameborder="0" allowfullscreen></iframe>
                    <p><b>Similar comics</b></p>
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