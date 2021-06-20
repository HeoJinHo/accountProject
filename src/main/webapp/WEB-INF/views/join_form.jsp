<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="imports/libs.jsp" flush="true"/>
</head>
<body>

    <div class="container">
        <form action="/member/join" method="post">  <!--onsubmit="confirm('저장 하시겠습니까?')">-->
            <h1>회원가입</h1>

            <label for="memberId">아이디</label>
            <input type="text" name="memberId" id="memberId" class="form-control">

            <label for="memberPwd">비밀번호</label>
            <input type="password" name="memberPwd" id="memberPwd" class="form-control">

            <label for="memberName">이름</label>
            <input type="text" name="memberName" id="memberName" class="form-control">

            <label for="memberEName">영문명</label>
            <input type="text" name="memberEName" id="memberEName" class="form-control">

            <label for="memberCompany">회사명</label>
            <input type="text" name="memberCompany" id="memberCompany" class="form-control">

            <label for="memberPhone">핸드폰번호</label>
            <input type="tel" name="memberPhone" id="memberPhone" class="form-control">

            <label for="memberZipCode">우편번호</label>
            <input type="text" name="memberDetail.memberZipCode" id="memberZipCode" class="form-control">

            <label for="memberAddress">주소</label>
            <input type="text" name="memberDetail.memberAddress" id="memberAddress" class="form-control">

            <label for="memberAddressDetail">상세주소</label>
            <input type="text" name="memberDetail.memberAddressDetail" id="memberAddressDetail" class="form-control">

            <label for="memberAuth">권한</label>
            <select name="memberAuth" id="memberAuth" class="form-control">
                <option value="A">Admin</option>
                <option value="M">Member</option>
                <option value="T">Tester</option>
            </select>

            <br>

            <button type="submit" class="btn btn-primary">저장</button>
        </form>
    </div>

<%--    <a href="/member/getMember">찾기</a>--%>


</body>
</html>
