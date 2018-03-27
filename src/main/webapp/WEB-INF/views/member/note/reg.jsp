<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>노트 등록 폼</title>
</head>
<body>
	<main>
		<section>
			<h1>노트 등록 폼</h1>
			<form method="post">
				<table>
					<tr>
						<th>제목</th>
						<td><input type="text" name="title" value=""/></td>
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