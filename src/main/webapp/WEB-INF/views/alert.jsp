<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    window.onload = () => {
        alert('${message.message}');
        location.href = '${message.redirectURI}';
    }
</script>
</body>
</html>
