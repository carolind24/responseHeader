<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<style>

body{
	background-color: grey;
}
p{
	text-align:center;
	color:purple
}
</style>


<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>






<form action="export" method="post">
	
	<p>
	<label for="secim">Indirme Turu Seciniz </label>
	<select id="secim" name = "secim">
		<option value = "Pdf">Pdf	</option>
		<option value = "Excel">Excel	</option>
		<option value = "Word">Word	</option>
	</select>
	</p>
	
	<p> Ogrenci No <input type="text" name="p1" style="background-color:yellow" > <br> </p>
	
	<p>Ad <input type="text" name="p2" style="background-color:yellow" > <br>	</p>
	
	<p>Soyad <input type="text" name="p3" style="background-color:yellow"> <br>	</p>
		
		<p><input type="Submit"> </p>

</form>


</body>
</html>