<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, user-scalable=1">
 <!-- initial-scale=1 <== 장치의 가로길이를 1밀도로 맞춰라 -->
 <!-- minimum-scale=1 <== 최소 크기를 1밀도 이하로 지정 안돼도록 설정 -->
 <!-- user-scalable=1 <== 줌기능 안되도록 설정 -->
<title>노트 등록 폼</title>
</head>
<body>
	<main>
		<section>
			<h1>노트 등록 폼</h1>
			<form method="post" enctype="multipart/form-data">
				<table>
					<tr>
						<th>제목</th>
						<td><input type="text" name="title" value=""/></td>
					</tr>
					<tr>
						<th>첨부파일</th>
						<td><input type="file" name="file"/></td>
					</tr>
					<tr>
						<th>내용</th>
						<td>
							<textarea name="content" rows="10" cols="40"></textarea>
						</td>
					</tr>
				</table>
				<div>
					<input type="submit" value="등록"/>
				</div>
			</form>
		</section>
	</main>
</body>
</html>

<script>
	window.addEventListener("load",function(){
		var submitButton = document.querySelector("input[value='등록']");
		submitButton.onclick = function(e){
			
			var request = new XMLHttpRequest();
			request.onload = function(evt){
				alert(request.responseText);
			}
			request.open("GET", "data");
			request.send();

			//e.preventDefault();
		}
	});
</script>