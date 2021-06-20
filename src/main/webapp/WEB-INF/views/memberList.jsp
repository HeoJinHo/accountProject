<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>



    <table>
        <thead>
            <tr>
               <td>회원 아이디</td>
               <td>회원 비밀번호</td>
               <td>회원 이름</td>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="item" items="${data}">
            <tr>
                <td><a href="/member/getMember">${item.memberId}></a></td>
                <td>${item.memberPwd}</td>
                <td>${item.memberName}</td>
            </tr>
            </c:forEach>
        </tbody>
    </table>



</body>
</html>
