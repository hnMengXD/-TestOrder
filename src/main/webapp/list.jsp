<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="/js/jquery-1.8.2.min.js"></script>
<script type="text/javascript">

	function fenye(page){
		location.href="toOrderList?page="+page;		
	}
</script>
</head>
<body>
	<form action="toAddOneOrder" method="post">
		<input type="submit" value="点餐">
	</form>
	<table>
		<tr>
			<td>接收人</td>
			<td>电话</td>
			<td>送餐时间</td>
			<td>送餐地点</td>
			<td>点餐</td>
		</tr>
		<c:forEach items="${list }" var="order">
			<tr>
				<td>${order.oname }</td>
				<td>${order.tel }</td>
				<td>${order.time.tname }</td>
				<td>${order.address.aname}</td>
				<td>
					<c:forEach items="${order.foodlist }" var="ofood">
						<c:forEach items="${foodList }" var="food">
							<c:if test="${ofood.fid==food.fid }">${food.fname }</c:if>
						</c:forEach>
					</c:forEach>
				</td>
			</tr>
		</c:forEach>
		<tr>
			<td colspan="11">
				<button onclick="fenye(1)">首页</button>
				<button onclick="fenye(${pageUtil.prevPage})">上一页</button>
				<button onclick="fenye(${pageUtil.nextPage})">下一页</button>
				<button onclick="fenye(${pageUtil.lastPage})">尾页</button>
			</td>
		</tr>
	</table>
</body>
</html>