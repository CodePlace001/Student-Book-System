<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
		
			table {
			width: 100%;
			height: 300px;
			border: 1px solid cadetblue;
			box-sizing: border-box;
			}
			
			table img {
			width: 80px;
			height: 80px;
			}
		</style>
</head>
<body>
	<table>
		<tr>
			<th>商品图片</th>
			<th>商品名称</th>
			<th>价格</th>
			<th>数量</th>
		</tr>
	</table>

	<script type="text/javascript">
			let list = [
				{
					pic:"./img/01.jpg",
					productName:"荣耀X10",
					price:1999,
					number:1,
				},
				{
					pic:"./img/02.jpg",
					productName:"荣耀X10por",
					price:2199,
					number:2,
				},
				{
					pic:"./img/01.jpg",
					productName:"荣耀X10",
					price:1999,
					number:3,
				},
				{
					pic:"./img/01.jpg",
					productName:"荣耀X10por+",
					price:2699,
					number:10,
				}
			]
			
			for(i = 0;i < list.length;i++){
				
			  let arr = list[i];
			  
				console.log(arr);
				(()=>{
					let tr = document.createElement("tr");
						
						let td1 = document.createElement("td");
						let img = document.createElement("img");
						img.src = arr.pic;
						img.alt = "图片加载错误！！";
						td1.appendChild(img);
						tr.appendChild(td1);
						
						let td2 = document.createElement("td");
						let span1 = document.createElement("span");
						span1.innerHTML = arr.productName;
						td2.appendChild(span1);
						tr.appendChild(td2);
						
						
						let td3 = document.createElement("td");
						let span2 = document.createElement("span");
						span2.innerHTML = arr.price;
						td3.appendChild(span2);
						tr.appendChild(td3);
						
						
						let td4 = document.createElement("td");
						let delbtn = document.createElement("button");
						delbtn.innerHTML = "删除";
						td4.appendChild(delbtn);
						tr.appendChild(td4);
						
						document.getElementsByTagName("table")[0].appendChild(tr);
				})();
			}
			</script>
</body>
</html>