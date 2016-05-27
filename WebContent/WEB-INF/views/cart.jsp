<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart</title>
<link rel="stylesheet" href="../resources/css/bootstrap.min.css">
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
</head>
<body>
	<section>
		<div class="jumbotron">
			<div class="container">
				<h1 style="border: none;">Cart</h1>
				<p>All the selected products in your cart</p>
			</div>
		</div>
	</section>

	<section class="container" ng-app="cartApp">
		<div ng-controller="cartController" ng-init="initCartId('${cartId}')">
			<div>
				<a class="btn btn-danger pull-left" ng-click="clearCart()"> <span
					class="glyphicon glyphicon-remove-sign"></span> Clear Cart
				</a> <a href="#" class="btn btn-success pull-right"> <span
					class="glyphicon-shopping-cart glyphicon"></span> Check out
				</a>
			</div>
			<table class="table table-hover">
				<tr>
					<th></th>
					<th>Product</th>
					<th class="text-center">Quantity</th>
					<th class="text-center">Unit price</th>
					<th class="text-center">Price</th>
					<th class="text-center">Action</th>
				</tr>
				<tr ng-repeat="item in cart.cartItems">
					<td><img class="thumbnail active"
						ng-src='<spring:url value="/resource/images/{{item.product.imageSource[0]}}"></spring:url>'></td>
					<td class="text-uppercase"><em><strong>{{item.product.name}}</strong></em></td>
					<td class="text-center ">{{item.quantity}}</td>
					<td class="text-center">{{item.product.unitPrice}}</td>
					<td class="text-center">{{item.totalPrice}}</td>
					<td class="text-center"><a href="#" class="label label-danger"
						style="margin-right: 4px;"
						ng-click="removeFromCart(item.product.productId)"> <span
							class="glyphicon glyphicon-remove" /></span> Remove
					</a> <a
						href='<spring:url value="/products/product?id={{item.product.productId}}" />'
						class="label label-primary"><span
							class="glyphicon glyphicon-info-sign"></span> View details</a></td>
				</tr>
				<tr>
					<th></th>
					<th></th>
					<th class="text-center">Grand Total</th>
					<th class="text-center">{{cart.grandTotal}}</th>
					<th></th>
					<th></th>
				</tr>

			</table>
			<a href="<spring:url value="/products" />" class="btn btn-success"
				style="margin-bottom: 30px;"> <span
				class="glyphicon-circle-arrow-left glyphicon"></span> continue
				shopping
			</a>
		</div>
		<div></div>
	</section>
	
</body>
</html>