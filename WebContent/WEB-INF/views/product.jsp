<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Product - ${product.name}</title>
<link rel="stylesheet"
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href='<c:url value="/resource/css/styles.css" />'
	type="text/css" />
<link rel="stylesheet" href='<c:url value="/resource/css/app.css" />'
	type="text/css" media="screen" />
<link rel="stylesheet"
	href='<c:url value="/resource/css/animations.css" />' type="text/css"
	media="screen" />
<script
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.0-rc.2/angular.min.js"></script>
<script
	src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.0-rc.2/angular-animate.js"></script>

<script src='<c:url value="/resource/js/controllers.js" />'></script>
<script src='<c:url value="/resource/js/scripts.js" />'></script>
<script src='<c:url value="/resource/js/animations.js" />'></script>
<script src='<c:url value="/resource/js/dirPagination.js" />'></script>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1 style="border-bottom: none;">Products</h1>
			</div>
		</div>
	</section>

	<section class="container" ng-app="cartApp"
		ng-controller="cartController"
		ng-init="initProductId( '${product.productId }')">

		<div class="row ">
			<div class="col-md-6  ">
				<div class="phone-images">
					<img ng-repeat="img in images" class="phone single-img"
						ng-class="{active: mainImageUrl==img}"
						ng-src='<spring:url value="/resource/images/{{img}}"></spring:url>'>
				</div>
				<div class="row">
					<ul class="phone-thumbs">

						<li ng-repeat="img in images"><img ng-click="setImage(img)"
							src='<c:url value="/resource/images/{{img}}" />'
							class="single-img col-sm-2" alt="image" /></li>

					</ul>

				</div>
			</div>

			<div class="col-md-6 ">

				<div class="row">
					<h1>${product.name}</h1>
					<p>${product.description}</p>
					<p>
						<strong>Item Code : </strong><span class="label label-warning">${product.productId}</span>
					</p>
					<p>
						<strong>manufacturer</strong> : ${product.manufacturer}
					</p>
					<p>
						<strong>category</strong> : ${product.category}
					</p>
					<p>
						<strong>Availble units in stock </strong> :
						${product.unitsInStock}
					</p>
					<h4>${product.unitPrice}USD</h4>
					<p>
						<a href="<spring:url value="/products" />" class="btn btn-success">
							<span class="glyphicon-circle-arrow-left glyphicon"></span> back
						</a> <a href="#" ng-click="addToCart('${product.productId}')"
							class="btn btn-warning btn-large"> <span
							class="glyphicon-shopping-cart glyphicon"> </span> Order Now
						</a>
					</p>
				</div>
				<div class="row">
					<div style="padding-top: 20%;">

						<p ng-repeat="img in images">
							<img
								ng-src='<spring:url value="/resource/images/{{img}}"></spring:url>'
								class="single-img " alt="image" />
						</p>
					</div>
				</div>
			</div>
		</div>


		<%-- ${imgSource} --%>
	</section>

</body>
</html>