<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

</head>
<body>
    <div class ="container">
    <img alt = "" src="images/cat.jpg" id = "cat">
    <h1 onclick="method()" id="test">안녕</h1>
       <h1 id="heading">에디오피아 게뎁</h1>
       <img src = "images/coffee-pink.jpg" alt="커피잔" id="cup" width="200" height="200">
    </div>

    <script type = "text/javascript">
    	const cat = document.querySelector('#cat');
    	cat.onclick = () => alert("클릭");
    	//cat.onclick = changePic;
    	//function changePic(){
    		//cat.src = "images/kitty-2.png";
    	//}
    	
        let heading = document.querySelector('#heading');
        let cup = document.querySelector('#cup');
        heading.onclick = () => heading.innerText = '추천! 오늘의 커피';
        cup.onclick = () => cup.src = "images/coffee-blue.jpg";
        
        let test = document.querySelector('#test');
        function method(){
        	test.innerText ='나온다!';
        }
    </script>
</body>
</html>