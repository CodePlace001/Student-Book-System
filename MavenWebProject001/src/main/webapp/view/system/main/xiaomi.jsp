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
<link rel="stylesheet" type="text/css" href="css/xiaomi.css" />
<link rel="stylesheet" type="text/css" href="css/public.css" />
<link rel="stylesheet"
	href="https://at.alicdn.com/t/font_1763291_xuecxsdnzdq.css" />

</head>
<body>
	<!-- ********************************导航栏************************************ -->
	<div class="heard">
		<div class="heard-up">
			<div class="nav">
				<div class="nav-left">
					<a href="#">小米商城</a>
					<p>|</p>
					<a href="#">MUI</a>
					<p>|</p>
					<a href="#">IoT</a>
					<p>|</p>
					<a href="#">云服务</a>
					<p>|</p>
					<a href="#">金融</a>
					<p>|</p>
					<a href="#">有品</a>
					<p>|</p>
					<a href="#">小爱开放平台</a>
					<p>|</p>
					<a href="#">企业团购</a>
					<p>|</p>
					<a href="#">资质证照</a>
					<p>|</p>
					<a href="#">协议规则</a>
					<p>|</p>
					<a href="#" class="download"> 下载app
						<p class="iconfont icon-shangsanjiaoxing"></p>
						<div class="app">
							<div>
								<img src="img2/download.png">
							</div>
						</div>
					</a>
					<p>|</p>
					<a href="#">Select Location</a>
				</div>
				<div class="nav-right">
					<a href="#">登录</a>
					<p>|</p>
					<a href="#">注册</a>
					<p>|</p>
					<a href="#">消息通知</a>
					<div class="car">
						<span class="iconfont icon-icon8"></span> <span>购物车（0）</span>
						<div>购物车还没有商品，赶紧选购！！</div>
					</div>
				</div>
			</div>
		</div>
		<div class="heard-down">
			<div class="box1">
				<div class="box1-left">
					<div class="bg">
						<ul>
							<li><img src="./img2/mi-logo.png"></li>
							<li><img src="./img2/mi-home.png"></li>
						</ul>
					</div>
				</div>
				<div class="box1-center">
					<div class="a1">
						<a href="#" class="phone">小米手机</a>
						<div class="showmore1"></div>
					</div>
					<div class="a2">
						<a href="#" class="dianji Redmi">Redmi红米</a>
						<div class="showmore2">
							<!-- <div class="xiangqing">
								</div> -->
						</div>
					</div>
					<div class="a3">
						<a href="#" class="dianji TV">电视</a>
						<div class="showmore3">
							<!-- <div class="xiangqing">
								</div> -->
						</div>
					</div>
					<div class="a4">
						<a href="#" class="dianji notbook">笔记本</a>
						<div class="showmore4">
							<!-- <div class="xiangqing">
								</div> -->
						</div>
					</div>
					<div class="a5">
						<a href="#" class="dianji wiring">家电</a>
						<div class="showmore5">
							<!-- <div class="xiangqing">
								</div> -->
						</div>
					</div>
					<div class="a6">
						<a href="#" class="dianji router">路由器</a>
						<div class="showmore6">
							<!-- <div class="xiangqing">
								</div> -->
						</div>
					</div>
					<div class="a7">
						<a href="#" class="dianji AI">智能硬件</a>
						<div class="showmore7">
							<!-- <div class="xiangqing">
								</div> -->
						</div>
					</div>
					<a href="#">服务</a> <a href="#">社区</a>
				</div>
				<div class="box1-right">
					<input type="text" class="search" /> <a href="#" class="button1">
						<span class="iconfont icon-sousuo1"></span>
					</a>
					<div class="text-center">
						<a href="#">小米10</a> <a href="#">Redmi K30 Por</a>
					</div>
					<div class="search-more"></div>
				</div>
			</div>
		</div>

	</div>
	<!-- *********************************主要展示内容main******************************************** -->
	<div class="main">
		<div class="main-top">
			<div class="box-son">
				<ul>
					<li><img src="img2/01.jpg"></li>
					<li><img src="img2/02.jpg"></li>
					<li><img src="img2/04.jpg"></li>
				</ul>
			</div>
			<div class="menu-left">
				<div class="menu-list">
					<a href="#" class="a1"> <span>手机 电话卡</span>
						<p class="iconfont icon-you"></p>
						<div class="information-paeg1"></div>
					</a> <a href="#" class="a2"> <span>手机 电话卡</span>
						<p class="iconfont icon-you"></p>
						<div class="information-paeg2"></div>
					</a> <a href="#" class="a3"> <span>手机 电话卡</span>
						<p class="iconfont icon-you"></p>
						<div class="information-paeg3"></div>
					</a> <a href="#" class="a4"> <span>手机 电话卡</span>
						<p class="iconfont icon-you"></p>
						<div class="information-paeg4"></div>
					</a> <a href="#" class="a5"> <span>手机 电话卡</span>
						<p class="iconfont icon-you"></p>
						<div class="information-paeg5"></div>
					</a> <a href="#" class="a6"> <span>手机 电话卡</span>
						<p class="iconfont icon-you"></p>
						<div class="information-paeg6"></div>
					</a> <a href="#" class="a7"> <span>手机 电话卡</span>
						<p class="iconfont icon-you"></p>
						<div class="information-paeg7"></div>
					</a> <a href="#" class="a8"> <span>手机 电话卡</span>
						<p class="iconfont icon-you"></p>
						<div class="information-paeg8"></div>
					</a> <a href="#" class="a9"> <span>手机 电话卡</span>
						<p class="iconfont icon-you"></p>
						<div class="information-paeg9"></div>
					</a> <a href="#" class="a10"> <span>手机 电话卡</span>
						<p class="iconfont icon-you"></p>
						<div class="information-paeg10"></div>
					</a>
				</div>
			</div>
		</div>
		<div class="main-low">
			<div class="main-low-left">
				<ul>
					<li><img src="img2/05.png">
						<p>充话费</p></li>
					<li><img src="img2/05.png">
						<p>充话费</p></li>
					<li><img src="img2/05.png">
						<p>充话费</p></li>
					<li><img src="img2/05.png">
						<p>充话费</p></li>
					<li><img src="img2/05.png">
						<p>充话费</p></li>
					<li><img src="img2/05.png">
						<p>充话费</p></li>
				</ul>
			</div>
			<div class="main-low-right">
				<img src="img2/06.jpg"> <img src="img2/07.jpg"> <img
					src="img2/08.jpg">
			</div>
		</div>
	</div>
</body>
</html>