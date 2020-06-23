<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<!-- 加入jstl的核心标签库 -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="<%=basePath%>/css/pintuer.css">
<link rel="stylesheet" href="<%=basePath%>/css/admin.css">
<script src="<%=basePath%>/js/jquery.js"></script>
<script src="<%=basePath%>/js/pintuer.js"></script>
</head>
<body>


	<form method="post" action="" id="listform">
		<div class="panel admin-panel">
			<div class="panel-head">
				<strong class="icon-reorder"> 内容列表</strong> <a href=""
					style="float: right; display: none;">添加字段</a>
			</div>
			<div class="padding border-bottom">
				<ul class="search" style="padding-left: 10px;">
					<li><a class="button border-main icon-plus-square-o"
						href="<%=basePath %>/view/system/main/update.jsp"> 增加</a></li>
					<li>搜索：</li>

					<if condition="$iscid eq 1">
					<li><select name="cid" class="input"
						style="width: 200px; line-height: 17px;" onchange="changesearch()">
							<option value="">请选择分类</option>
							<option value="">小说</option>
							<option value="">文学</option>
							<option value="">传记</option>
							<option value="">历史</option>
							<option value="">经济</option>
					</select></li>
					</if>
					<li><input type="text" placeholder="请输入搜索关键字" name="keywords"
						class="input"
						style="width: 250px; line-height: 17px; display: inline-block" />
						<a href="javascript:void(0)"
						class="button border-main icon-search" onclick="changesearch()">
							搜索</a></li>
				</ul>
			</div>
			<!-- 数据显示的表格开始 -->
			<table class="table table-hover text-center">
				<tr>
					<th width="100" style="text-align: left; padding-left: 20px;">ID</th>
					<th>是否借出</th>
					<th>图书名称</th>
					<th>图书类型</th>
					<th>作者</th>

					<th width="10%">发行时间</th>
					<th>出版社</th>
					<th>价格</th>
					<th>注册时间</th>
					<th width="310">操作</th>
				</tr>
				<!--每一行的数据 items 的值是后端传递数据的key值   var :是从后端传递的集合中获取的对象起了个名字  -->
				<%-- <h1>name:${name1 }</h1> --%>
				<c:forEach items="${book1}" var="book">

					<tr>
						<td style="text-align: left; padding-left: 20px;">
							${book.book_id }</td>
						<td>${book.is_borrow }</td>
						<td width="10%">${book.book_name }</td>
						<td>${book.book_type }</td>
						<td><font color="#00CC99">${book.author }</font></td>
						<td>${book.publish_date}</td>
						<td>${book.press}</td>
						<td>${book.price}</td>
						<td>${book.register_time}</td>
						<td><div class="button-group">
								<a class="button border-main" href="add.html"><span
									class="icon-edit"></span> 修改</a> <a class="button border-red"
									href="javascript:void(0)" onclick="return del(1,1,1)"><span
									class="icon-trash-o"></span> 删除</a>
							</div>
						</td>
					</tr>

				</c:forEach>




				<tr>
					<td colspan="8"><div class="pagelist">
							<a href="">上一页</a> <span class="current">1</span><a href="">2</a><a
								href="">3</a><a href="">下一页</a><a href="">尾页</a>
						</div></td>
				</tr>
			</table>
			<!-- 数据显示表格结束 -->
		</div>
	</form>
	<script type="text/javascript">
		//搜索
		function changesearch() {

		}

		//单个删除
		function del(id, mid, iscid) {
			if (confirm("您确定要删除吗?")) {

			}
		}

		//全选
		$("#checkall").click(function() {
			$("input[name='id[]']").each(function() {
				if (this.checked) {
					this.checked = false;
				} else {
					this.checked = true;
				}
			});
		})

		//批量删除
		function DelSelect() {
			var Checkbox = false;
			$("input[name='id[]']").each(function() {
				if (this.checked == true) {
					Checkbox = true;
				}
			});
			if (Checkbox) {
				var t = confirm("您确认要删除选中的内容吗？");
				if (t == false)
					return false;
				$("#listform").submit();
			} else {
				alert("请选择您要删除的内容!");
				return false;
			}
		}

		//批量排序
		function sorts() {
			var Checkbox = false;
			$("input[name='id[]']").each(function() {
				if (this.checked == true) {
					Checkbox = true;
				}
			});
			if (Checkbox) {

				$("#listform").submit();
			} else {
				alert("请选择要操作的内容!");
				return false;
			}
		}

		//批量首页显示
		function changeishome(o) {
			var Checkbox = false;
			$("input[name='id[]']").each(function() {
				if (this.checked == true) {
					Checkbox = true;
				}
			});
			if (Checkbox) {

				$("#listform").submit();
			} else {
				alert("请选择要操作的内容!");

				return false;
			}
		}

		//批量推荐
		function changeisvouch(o) {
			var Checkbox = false;
			$("input[name='id[]']").each(function() {
				if (this.checked == true) {
					Checkbox = true;
				}
			});
			if (Checkbox) {

				$("#listform").submit();
			} else {
				alert("请选择要操作的内容!");

				return false;
			}
		}

		//批量置顶
		function changeistop(o) {
			var Checkbox = false;
			$("input[name='id[]']").each(function() {
				if (this.checked == true) {
					Checkbox = true;
				}
			});
			if (Checkbox) {

				$("#listform").submit();
			} else {
				alert("请选择要操作的内容!");

				return false;
			}
		}

		//批量移动
		function changecate(o) {
			var Checkbox = false;
			$("input[name='id[]']").each(function() {
				if (this.checked == true) {
					Checkbox = true;
				}
			});
			if (Checkbox) {

				$("#listform").submit();
			} else {
				alert("请选择要操作的内容!");

				return false;
			}
		}

		//批量复制
		function changecopy(o) {
			var Checkbox = false;
			$("input[name='id[]']").each(function() {
				if (this.checked == true) {
					Checkbox = true;
				}
			});
			if (Checkbox) {
				var i = 0;
				$("input[name='id[]']").each(function() {
					if (this.checked == true) {
						i++;
					}
				});
				if (i > 1) {
					alert("只能选择一条信息!");
					$(o).find("option:first").prop("selected", "selected");
				} else {

					$("#listform").submit();
				}
			} else {
				alert("请选择要复制的内容!");
				$(o).find("option:first").prop("selected", "selected");
				return false;
			}
		}
	</script>
</body>
</html>