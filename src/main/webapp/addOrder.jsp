<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
</head>
<script type="text/javascript">
	$(function(){
		
	});
</script>
<body>


	<form action="addOneOrder" method="post">
		接收人:<input type="text" name="oname"/><br><br>
		电话:<input type="text" name="tel"/><br><br>
		送餐时间:<select name="time.tid">
					<c:forEach items="${timeList }" var="time">
						<option value="${time.tid }">${time.tname }</option>
					</c:forEach>
			   </select><br><br>
		送餐地点:<select name="address.aid">
					<c:forEach items="${addressList }" var="address">
						<option value="${address.aid }">${address.aname }</option>
					</c:forEach>
			   </select><br><br>
		精品菜:<c:forEach items="${foodList }" var="food">
				<input type="checkbox" name="fid" value="${food.fid }"/>${food.fname }<br>
			 </c:forEach>
		<br>
		<input type="submit" value="提交订单"/>
	</form>
</body>
</html>



