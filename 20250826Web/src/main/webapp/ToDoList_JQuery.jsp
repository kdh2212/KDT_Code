<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action= "">
		<label for = "subject" class ="hidden"> 주제</label>
		<input type = "text" id = "subject" autofocus/>
		<button id = "addBtn">추가</button>
	</form>
	<hr>
	<ul id ="itemList"></ul>
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
	<script>
	$(document).ready(function(){
		$('#addBtn').click(function(e){
			e.preventDefault();
			const text = $('#subject').val();
			const itemlist = $('#itemList').append('<li>'+text+'</li>');
			$('#subject').val(''); // 다음 입력을 위해 텍스트 필드 비움
		});
			$('#itemList').click(function(event){
				if(event.target.tagName === "LI"){		 // 확인 대화상자 표시
					if(confirm("삭제하시겠습니까?")){			 // 클릭한 요소 삭제
						event.target.remove();
					}
				}
				
				
			});
		
		

	});
	
	
	</script>
</body>
</html>