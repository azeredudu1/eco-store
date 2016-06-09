<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!Doctype html>
<html>
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

<title>Products</title>
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<a href="<spring:url value="/j_spring_security_logout " />"
					class="btn btn-default btn-mini pull-right"> <span
					class="glyphicon-log-out glyphicon"></span> logout
				</a> <a href='<c:url value="/products/add" />'
					class="btn btn-default pull-right"> <span
					class="glyphicon-plus-sign glyphicon"></span> add product
				</a> <a href='<c:url value="/cart" />'
					class="btn btn-default pull-right"> <span
					class="glyphicon-shopping-cart glyphicon"></span> view cart
				</a>
				<h2>Azere Dudu Company</h2>
				<p>All the available products in my store</p>
			</div>
		</div>
	</section>
	<section class="container" ng-app="cartApp"
		ng-controller="cartController">
		<div class="row bar">
			<input ng-model="query" placeholder="Enter your search terms">
			Filter by<select ng-model="orderProp">
				<option value="name">Alphabetical</option>
				<option value="age">Newest</option>

			</select>
		</div>
		<div class="row " >

			<div class="col-sm-6 col-md-3 phone-listing" style="padding-bottom: 15px"
				ng-repeat="product in products | filter:query | orderBy:orderProp">
				<div class="thumbnail">
					<div class="caption">
						<h3 align="center">{{product.name}}</h3>
						<p align="center">
							<a
								href='<spring:url value="/products/product?id={{product.productId}}" />'>
								<img
								src='<c:url value="/resource/images/{{product.imageSource[0]}}" />'
								alt="image" />
							</a>
						</p>
						<%-- <c:set var="description"
								value="${fn:substring(product.description, 0, 100)}" />
							<p id="description">${description}...<a
									href='<spring:url value="/products/product?id=${product.productId }"></spring:url>'>read</a>
							</p> --%>
						<p>
							<strong>Price: </strong><i style="color: #800000;">{{product.unitPrice}}
								USD</i>
						</p>
						<p>
							<strong>Stock: </strong><i style="color: #800000;">{{product.unitsInStock}}
								units</i>
						</p>
						<p ng-controller="cartController">
							<a
								href="<spring:url value="/products/product?id={{product.productId}}" />"
								class="btn btn-primary"> <span
								class="glyphicon-info-sign glyphicon"> </span> Details
							</a> <a href="#" class="btn btn-warning btn-large"
								ng-click="addToCart(product.productId)"
								ng-init="{{product.productId}}"> <span
								class="glyphicon-shopping-cart glyphicon"> </span> Order Now
							</a>
						</p>
					</div>
				</div>
			</div>

		</div>
	</section>

</body>
</html>