<%@ page import="bean.pojo.Ogrenci" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">



<title>Öğrenciler</title>
</head>
<body>

ŞU ANDA ÖĞRENCİLER SAYFASINDAYIZ !!!!
 
 <br>
 <% Ogrenci o = (Ogrenci)request.getAttribute("ogrenci"); %>
 <%=   "Adı Soyad : " + o.getAd() + " " + o.getSoyad()+ "<br>" %> 
 <%=   "Okul Numarası :" + o.getNo() + "<br>"  %>
 <%=  " Sınıf / Şube :" + o.getSinif() + " /" +o.getSube() %>


<h1> ÖĞRENCİ 1 BİLGİLERİ </h1>
<jsp:useBean id="ogrenci" type= "bean.pojo.Ogrenci" class = "bean.pojo.DershaneOgrenci" scope = "request">
 <jsp:setProperty property = "no" name = "ogrenci" value = "0000"/>
 <jsp:setProperty property = "ad" name = "ogrenci" value = "ADI_YOK" />
 <jsp:setProperty property = "soyad" name = "ogrenci" value = "SOYADI_YOK"/>
 <jsp:setProperty property = "sinif" name = "ogrenci" value = "0"/>
 <jsp:setProperty property = "sube" name = "ogrenci" value = 'X'/>

</jsp:useBean>

<jsp:setProperty property="no" name="ogrenci" value = "7854"/>

<jsp:getProperty property="no" name="ogrenci"/>
<jsp:getProperty property="ad" name="ogrenci"/>
<jsp:getProperty property="soyad" name="ogrenci"/>
<jsp:getProperty property="sinif" name="ogrenci"/>
<jsp:getProperty property="sube" name="ogrenci"/>


<h1>ÖĞRENCİ 2 BİLGİLERİ </h1>

<jsp:useBean id="ogrenci2"  type="bean.pojo.Ogrenci" class="bean.pojo.DershaneOgrenci" scope= "request">

  <jsp:setProperty property = "no" name = "ogrenci2" value = "0000"/>
 <jsp:setProperty property = "ad" name = "ogrenci2" value = "ADI_YOK" />
 <jsp:setProperty property = "soyad" name = "ogrenci2" value = "SOYADI_YOK"/>
  <jsp:setProperty property = "sinif" name = "ogrenci2" value = "0"/>
 <jsp:setProperty property = "sube" name = "ogrenci2" value = 'X'/>
</jsp:useBean>
<jsp:getProperty property="no" name="ogrenci2"/>
<jsp:getProperty property="ad" name="ogrenci2"/>
<jsp:getProperty property="soyad" name="ogrenci2"/>
<jsp:getProperty property="sinif" name="ogrenci2"/>
<jsp:getProperty property="sube" name="ogrenci2"/>



</body> 

</html>