<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Öğrenci Ekle</title>


<style >.button{

background-color:green;
border : none ; 
color :white;
padding : 15px 30px ;
text-align:center ;
text-decoration:none ;
font-size:16px;
transition : background-color 1s ease;
} 
.button:hover {
background-color:red;
cursor:pointer;
}
.table {
border-collapse : collapse;
white :100%;
}
.td,.th{
border:1px solid black ; 
text-allign:left;
padding:10px;
}

</style>
</head>
<body>

<form action="ogrenciEkle" method = "post">
<table class="table">
<tr class ="tr">
<th class ="th">Numara class </th>
<th class ="th">Adı</th>
<th class ="th">Soyadı</th>
<th class ="th">Sınıf</th>
<th class ="th">Şube</th>
</tr>

<tr class = "tr">
<td class = "td"><input type = "text" name="no" ></td>
<td class = "td"><input type = "text" name="ad"></td>
<td class = "td"><input type = "text" name="soyad"></td>
<td class = "td"><input type = "text" name="sinif"></td>
<td class = "td"><input type = "text" name="sube"></td>
</tr>
</table>
<input type = "submit" class = "button" value="Öğrenci Ekle"></form>

<jsp:useBean id="eklenenOgrenci" type="bean.pojo.Ogrenci" class="bean.pojo.DershaneOgrenci">
  <jsp:setProperty property="no" name="eklenenOgrenci" value="NO_YOK"  />
    <jsp:setProperty property="ad" name="eklenenOgrenci" value="AD_YOK"/>
    <jsp:setProperty property="soyad" name="eklenenOgrenci" value="SOYADI_YOK"/>
    <jsp:setProperty property="sinif" name="eklenenOgrenci" value="0"/>
    <jsp:setProperty property="sube" name="eklenenOgrenci"  value="X"/>
</jsp:useBean>

<table class = "table"> 
<tr class = "tr">
<th class ="th">
Numara
</th>
<th class ="th">
Adı Soyadı
</th>
<th class ="th">
Sınıf/Şube
</th>
</tr>
<tr class ="tr">
<td class ="td"> <jsp:getProperty property="no" name="eklenenOgrenci"/>   </td>
<td class ="td">  <jsp:getProperty property="ad" name="eklenenOgrenci"/>
<jsp:getProperty property="soyad" name="eklenenOgrenci"/> 
  </td>
<td class ="td"> 
<jsp:getProperty property="sinif" name="eklenenOgrenci"/>/
<jsp:getProperty property="sube" name="eklenenOgrenci"/>
 </td>
</tr>

</table>

</body>
</html>