<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Async</title>
</head>
<body>
	<h1>Async Servlet with JS and XMLHttpRequest</h1>
	<p id = "mla"></p>
	
	<script type="text/javascript">
	
	
	
	function mlaDisp(inputData) {
		document.getElementById("mla").innerHTML = inputData;
		
	}
	
	let yourPromise = new Promise(function(yourResolve, yourReject) {
		let input = 0;
		if(input ==0){
			yourResolve("Success...");
		}
		else{
			yourReject("failed");
		}
	});
	
	yourPromise.then(
		function(value) {
			mlaDisp(value);
		},
		function(error) {
			mlaDisp(error);
		}
	)
	
	
	
	</script>
	
</body>
</html>