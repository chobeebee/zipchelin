<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"
         isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.contextPath}"/>
<%
    request.setCharacterEncoding("utf-8");
%>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, shrink-to-fit=no">
    <meta http-equiv="x-ua-compatible" content="IE=edge">
    <meta name="keywords" content="레시피, 혼밥, 요리">
    <meta name="description" content="요리에 관한 모든 정보를 한 번에 보세요">

    <meta property="og:type" content="website">
    <meta property="og:title" content="집슐랭">
    <meta property="og:description" content="요리에 관한 모든 정보를 한 번에 보세요">
    <meta property="og:image" content="">
    <meta property="og:url" content="">

    <!-- favicon-->
    <link rel="shortcut icon" type="text/css" href="">
    <link rel="icon" type="text/css" href="">

    <!-- google icon CDN -->
    <link href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined" rel="stylesheet">
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">

    <!-- basic CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/reset.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/base.css">
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/common.css">

    <!-- plugin CSS -->
    <link rel="stylesheet" href="/front/css/swiper-bundle.css">

    <!-- page CSS -->
    <link rel="stylesheet" type="text/css" href="${contextPath}/resource/css/community.css">

    <title>나만의 레시피</title>
</head>
<body>
<!-- 헤더 -->
<header class="header">
    <jsp:include page="/WEB-INF/views/main/header.jsp"/>
</header>

<!-- 메인 -->
<main>
    <section class="post-section">
        <article class="post-article">
            <div>
                <div class="post-top">
                    <h1 class="post-title">${myrecipe.myreTitle}</h1>
                    <div class="post-info">
                        <div class="comment-profile">
                            <img class="comment-img" src="${contextPath}/resource/images/icon/profile.jpg" alt="">
                        </div>
                        <strong class="post-id">${member.userId}</strong>
                        <span class="post-date"><fmt:parseDate value="${myrecipe.myreDate}" pattern="yyyy-MM-dd'T'HH:mm" var="parseDateTime" />
                                    <fmt:formatDate pattern="yyyy-MM-dd" value="${parseDateTime}" /></span>
                        <div class="comment_writeracc">
                            <button class="comment_update">
                                <a href="${contextPath}/myrecipe/update/${myrecipe.myreNum}">수정</a>
                            </button>
                            <button class="comment_delete">
                                <a href="${contextPath}/myrecipe/delete/${myrecipe.myreNum}">삭제</a>
                            </button>
                        </div>
                    </div>
                </div>
                <div class="post-content">
                    <p class="content">${myrecipe}</p><br>
                    <img src="/front/images/food/sample.jpg" alt="">
                    <img src="/front/images/food/sample.jpg" alt="">
                    <p class="content">${myrecipe.myreContent}</p><br>
                </div>
                <a href="${contextPath}/community/myrecipe">
                    <div class="btnGroup lg btn_list">
                        <button class="btnBgGray btn_list">목록</button>
                    </div>
                </a>
            </div>
        </article>

        <div class="comment-section">
            <div class="commentwrite-box disabled">
                <a href="/front/html/member/login.html" class="login-link">로그인</a> 후 댓글을 남겨보세요.
            </div>
        </div>
        <!-- 로그인 후 댓글입력창 보이기
            <form class="comment-section post_comment" id="aftLogin_comment">
            <input type="text" class="commentwrite-box aft_lgn" placeholder="주제에 무관한 댓글이나 악플은 삭제될 수 있습니다."></input>
            <input type="submit" class="comment_post_btn" value="등록"/>
            </form>
        -->
        <div class="commentWrap">
            <ul class="comment">
                <li class="commentbox bestcomment">
                    <img class="comment-img" src="${contextPath}/resource/images/icon/profile.jpg" alt="">
                    <div>
                        <div class="comment-contentbox">
                            <strong class="comment-id">해징어</strong>
                            <p class="comment-content">진짜 맛있어 보이는 음식이네요! 금손 인정! 대박 도라방스 부럽다!대박 도라방스 부럽다!대박 도라방스 부럽다!대박
                                도라방스 부럽다!대박 도라방스 부럽다!대박 도라방스 부럽다!대박 도라방스 부럽다!</p>
                        </div>
                        <div class="comment-info">
                            <span class="comment_date">2023.10.26 10:02</span>
                            <button class="comment_logo comment_acc">
                                <span class="material-symbols-outlined" onclick="goodAction(this)">thumb_up</span>
                                <!--<span class="material-icons">thumb_up</span>-->
                                <span>11</span>
                            </button>
                            <button class="comment_reply comment_acc replyWrite">
                                <span>답글 달기</span>
                            </button>
                            <button class="comment_reply comment_acc replyCancle">
                                <span>답글 취소</span>
                            </button>
                            <button class="comment_declaration comment_acc" id="modalAlert">
                                <span>신고</span>
                            </button>
                        </div>
                    </div>
                </li>
            </ul>
            <ul class="comment replyWrap">
                <li class="replybox">
                    <span class="material-symbols-outlined comment_re">subdirectory_arrow_right</span>
                    <div class="comment_replybox">
                        <form class="comment-section post_comment">
                            <input type="text" class="commentwrite-box aft_lgn_reply"
                                   placeholder="주제에 무관한 댓글이나 악플은 삭제될 수 있습니다."></input>
                            <input type="submit" class="comment_post_btn btnBg" value="등록"/>
                        </form>
                    </div>
                </li>
            </ul>
            <ul class="comment">
                <li class="commentbox">
                    <span class="material-symbols-outlined comment_re">subdirectory_arrow_right</span>
                    <img class="comment-img" src="${contextPath}/resource/images/icon/profile.jpg" alt="">
                    <div>
                        <div class="comment-contentbox">
                            <strong class="comment-id">해징어</strong>
                            <div class="post_writer">작성자</div>
                            <p class="comment-content">의외로 쉬운 요리입니다요 따라해 보시던가요</p>
                        </div>
                        <div class="comment-info">
                            <span class="comment_date">2023.10.26 10:02</span>
                            <button class="comment_logo comment_acc">
                                <span class="material-symbols-outlined" onclick="goodAction(this)">thumb_up</span>
                                <!--<span class="material-icons">thumb_up</span>-->
                                <span>0</span>
                            </button>
                            <button class="comment_reply comment_acc replyWrite">
                                <span>답글 달기</span>
                            </button>
                            <button class="comment_reply comment_acc replyCancle">
                                <span>답글 취소</span>
                            </button>
                            <button class="comment_declaration comment_acc">
                                <span>신고</span>
                            </button>
                        </div>
                    </div>
                </li>
            </ul>
            <ul class="comment replyWrap">
                <li class="replybox">
                    <span class="material-symbols-outlined comment_re">subdirectory_arrow_right</span>
                    <div class="comment_replybox">
                        <form class="comment-section post_comment">
                            <input type="text" class="commentwrite-box aft_lgn_reply"
                                   placeholder="주제에 무관한 댓글이나 악플은 삭제될 수 있습니다."></input>
                            <input type="submit" class="comment_post_btn btnBg" value="등록"/>
                        </form>
                    </div>
                </li>
            </ul>
            <ul class="comment">
                <li class="commentbox">
                    <img class="comment-img" src="${contextPath}/resource/images/icon/profile.jpg" alt="">
                    <div>
                        <div class="comment-contentbox">
                            <strong class="comment-id">해징어</strong>
                            <p class="comment-content">진짜 맛있어 보이는 음식이네요! 금손 인정! 대박 도라방스 부럽다!대박 도라방스 부럽다!대박 도라방스 부럽다!대박
                                도라방스 부럽다!대박 도라방스 부럽다!대박 도라방스 부럽다!대박 도라방스 부럽다!</p>
                        </div>
                        <div class="comment-info">
                            <span class="comment_date">2023.10.26 10:02</span>
                            <button class="comment_logo comment_acc">
                                <span class="material-symbols-outlined" onclick="goodAction(this)">thumb_up</span>
                                <!--<span class="material-icons">thumb_up</span>-->
                                <span>2</span>
                            </button>
                            <button class="comment_reply comment_acc replyWrite">
                                <span>답글 달기</span>
                            </button>
                            <button class="comment_reply comment_acc replyCancle">
                                <span>답글 취소</span>
                            </button>
                            <button class="comment_declaration comment_acc">
                                <span>신고</span>
                            </button>
                        </div>
                    </div>
                </li>
            </ul>
            <ul class="comment replyWrap">
                <li class="replybox">
                    <span class="material-symbols-outlined comment_re">subdirectory_arrow_right</span>
                    <div class="comment_replybox">
                        <form class="comment-section post_comment">
                            <input type="text" class="commentwrite-box aft_lgn_reply"
                                   placeholder="주제에 무관한 댓글이나 악플은 삭제될 수 있습니다."></input>
                            <input type="submit" class="comment_post_btn btnBg" value="등록"/>
                        </form>
                    </div>
                </li>
            </ul>
            <ul class="comment">
                <li class="commentbox">
                    <img class="comment-img" src="${contextPath}/resource/images/icon/profile.jpg" alt="">
                    <div>
                        <div class="comment-contentbox">
                            <strong class="comment-id">해징어</strong>
                            <p class="comment-content">금손 인정!대박 도라방스 부럽다!대박 도라방스 부럽다!대박 도라방스 부럽다!</p>
                        </div>
                        <div class="comment-info">
                            <span class="comment_date">2023.10.26 10:02</span>
                            <button class="comment_logo comment_acc">
                                <span class="material-symbols-outlined" onclick="goodAction(this)">thumb_up</span>
                                <!--<span class="material-icons">thumb_up</span>-->
                                <span>6</span>
                            </button>
                            <button class="comment_reply comment_acc replyWrite">
                                <span>답글 달기</span>
                            </button>
                            <button class="comment_reply comment_acc replyCancle">
                                <span>답글 취소</span>
                            </button>
                            <button class="comment_declaration comment_acc">
                                <span>신고</span>
                            </button>
                        </div>
                    </div>
                </li>
            </ul>
            <ul class="comment replyWrap">
                <li class="replybox">
                    <span class="material-symbols-outlined comment_re">subdirectory_arrow_right</span>
                    <div class="comment_replybox">
                        <form class="comment-section post_comment">
                            <input type="text" class="commentwrite-box aft_lgn_reply"
                                   placeholder="주제에 무관한 댓글이나 악플은 삭제될 수 있습니다."></input>
                            <input type="submit" class="comment_post_btn btnBg" value="등록"/>
                        </form>
                    </div>
                </li>
            </ul>
            <ul class="comment">
                <li class="commentbox">
                    <img class="comment-img" src="${contextPath}/resource/images/icon/profile.jpg" alt="">
                    <div>
                        <div class="comment-contentbox">
                            <strong class="comment-id">해징어</strong>
                            <p class="comment-content">진짜 맛있어 보이는 음식이네요!</p>
                        </div>
                        <div class="comment-info">
                            <span class="comment_date">2023.10.26 10:02</span>
                            <button class="comment_logo comment_acc">
                                <span class="material-symbols-outlined" onclick="goodAction(this)">thumb_up</span>
                                <!--<span class="material-icons">thumb_up</span>-->
                                <span>5</span>
                            </button>
                            <button class="comment_reply comment_acc replyWrite">
                                <span>답글 달기</span>
                            </button>
                            <button class="comment_reply comment_acc replyCancle">
                                <span>답글 취소</span>
                            </button>
                            <button class="comment_declaration comment_acc">
                                <span>신고</span>
                            </button>
                        </div>
                    </div>
                </li>
            </ul>
            <ul class="comment replyWrap">
                <li class="replybox">
                    <span class="material-symbols-outlined comment_re">subdirectory_arrow_right</span>
                    <div class="comment_replybox">
                        <form class="comment-section post_comment">
                            <input type="text" class="commentwrite-box aft_lgn_reply"
                                   placeholder="주제에 무관한 댓글이나 악플은 삭제될 수 있습니다."></input>
                            <input type="submit" class="comment_post_btn btnBg" value="등록"/>
                        </form>
                    </div>
                </li>
            </ul>
        </div>
        <div class="paging">
            <ul>
                <!-- li에 .disabled가 있으면 화살표에 클릭방지 생김 -->
                <li class="arrow prev disabled">
                    <button disabled><span class="material-symbols-outlined">navigate_before</span></button>
                </li>
                <li class="active"><a href="javascript:">1</a></li>
                <li><a href="javascript:">2</a></li>
                <li><a href="javascript:">3</a></li>
                <li><a href="javascript:">4</a></li>
                <li><a href="javascript:">5</a></li>
                <li class="arrow next">
                    <button><span class="material-symbols-outlined">navigate_next</span></button>
                </li>
            </ul>
        </div>
    </section>
</main>

<!-- 푸터 -->
<footer id="footer">
    <jsp:include page="/WEB-INF/views/main/footer.jsp"/>
</footer>

<div id="modal">
    <div class="modalBox">
        <div class="modalCont">
            <h6>댓글 신고</h6>
            <p>신고 시 관리자 확인 후<br> 적절한 조치가 이루어집니다.</p>
        </div>
        <div class="btnGroup">
            <button type="button" class="btnBd" onclick="modalHide()">취소</button>
            <button type="button" class="btnBg" onclick="location.href=''">신고</button>
        </div>
    </div>
</div>


<!— js —>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script src="${contextPath}/resource/js/common.js"></script>
<script src="${contextPath}/resource/js/community.js"></script>

</body>
</html>
