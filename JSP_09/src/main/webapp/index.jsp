<%@page import="java.util.Date,java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ana Sayfa</title>
</head>
<body>
<h1 style = "color:red;"> JAVA DERSLERİ </h1>
<%
final float PI = 3.14159f;
out.println("PI Sayısı : " + Math.PI);
out.println("<br>");
out.println("PI Sayısı : " +PI);
%>
<br>
<%
int sayi1 = 50,sayi2=30;
int sonuc = sayi1+sayi2;
out.println("Sayı 1 : " + sayi1 + "<br>"+ "Sayı 2 : " + sayi2 +"<br>" );
out.println(String.format("Toplama : %f<br>", topla((double)sayi1,(double)sayi2)));
out.println("Çıkarma: " + cikar ( (double)sayi1 , (double)sayi2)+ "<br>");
out.println("Çarpma: " + carp ((double)sayi1,(double)sayi2)+ "<br>");
out.println("Bölme : "+ bol((double)sayi1,(double)sayi2)+ "<br>");
%>
Gölkem EREN
<br>
<%!
public String isim = "Gölkem Eren";
public double topla (double s1 , double s2){
return s1+s2;
}
public double cikar (double s1, double s2) {
return s1-s2;
}
public double carp (double s1,double s2 ) {
return s1*s2;
}
public double bol (double s1 ,double s2 ) {
return s1*s2;
}
%>
<%
out.println(isim+"<br>");
%>
<%=
isim+"<br>"
%>
<%
for(int i=1;i<=10;i++) {
if(i%2==0){
out.println ("<span style = 'color:red'>" + i + "</span>");
}else {
out.println("<span style = 'color:black'>" + i + "</span>");
}
}
%>
<br>
<%
Date bugununTarihi = new Date();
SimpleDateFormat tarihFormati = new SimpleDateFormat("dd.MM.yyyy");
out.println("Tarih : " + tarihFormati.format(bugununTarihi));
%>
<jsp:include page="partialViews/bilgi.html"></jsp:include>
<a href = "hesapmakinesi"> Hesap Makinesi </a>
<br>
<a href = "korunanParametreler.jsp"> Korunan Parametreler </a>
</body>
</html>
