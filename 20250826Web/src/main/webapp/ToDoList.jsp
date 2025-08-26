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
		<button>추가</button>
	</form>
	<hr>
	<ul id ="itemList"></ul>
	
	<script>
	
		function newRegister(){ // <-- 여기는 선언
			const newItem = document.createElement("li"); // 요소 노드 추가 
			//const subject = document.getElementById("subject");
			const subject = document.querySelector('#subject'); // 텍스트 필드 가져옴
			const newText = document.createTextNode(subject.value); // 텍스트 필드의 값을 텍스트 노드로 추가
			
			
			newItem.appendChild(newText); // 텍스트 노드를 요소 노드에 추가
			//const itemList = document.getElementById("itemList");
			const itemList = document.querySelector("#itemList"); // 부모 노드 가져오기
			//itemList.appendChild(newItem); // 새로 만든 요소 노드를 부모 노드에 추가
			itemList.insertBefore(newItem, itemList.childNodes[0]);
			
			subject.value=""; // 다음 입력을 위해 텍스트 필드 비움
			subject.focus();
		}
	
		document.addEventListener("DOMContentLoaded",function(){ // 웹페이지를 로딩하자마자 이 함수를 실행하라
			const button = document.querySelector("button"); // 버튼 요소 가져오기
			button.addEventListener('click', function(event){ // 버튼을 클릭하면 실행
				event.preventDefault(); // 기본 동작을 막음
				newRegister(); // 입력한 내용을  화면에 출력하는 함수 호출
			});
			
			const itemList = document.querySelector("#itemList");
			itemList.addEventListener("click",(event) => {//클릭한 요소가 li 요소이면
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