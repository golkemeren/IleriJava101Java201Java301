<%@page import="org.apache.tomcat.jakartaee.commons.lang3.RegExUtils"%>
<%@page import="java.nio.file.spi.FileSystemProvider"%>
<%@page import="jakarta.servlet.ServletConfig"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
public void jspInit(){
ServletConfig sC = getServletConfig();
String bilgi = sC.getInitParameter("bilgi");
int sayi1 = Integer.parseInt(sC.getInitParameter("sayi1"));
int sayi2 = Integer.parseInt(sC.getInitParameter("sayi2"));
System.out.println ("SAYI 1 : " +sayi1 + "SAYI 2 : " + sayi2);
}
public void jspDestroy () {
System.out.println ("hesapMakinesi.jsp sonlandi!!");
}
%>
<%
int sayi1 =0 ,sayi2=0;
try {
sayi1 = Integer.parseInt(request.getParameter("sayi1"));
}
catch(Exception e) {
}
try{
sayi2 = Integer.parseInt(request.getParameter("sayi2"));
}
catch(Exception e ) {
}
ServletConfig sC = getServletConfig();
String bilgi = sC.getInitParameter("bilgi");
int sayi3 = Integer.parseInt(sC.getInitParameter("sayi1"));
int sayi4 = Integer.parseInt(sC.getInitParameter("sayi2"));
%>
<p> Request Parametreleri </p>
Sayi 1 : <%= sayi1 %>
<br>
Sayi 2 : <%= sayi2 %>
<p> Init Parametreleri</p>
Sayi 3 : <%=sayi3 %> 
<br>
Sayi 4 : <%= sayi4 %>
<br>
<%
int s1= 30;
int s2=50;
bilgi = " s1 ile s2 toplami : " + (s1+s2);
Double kilo = 95.5;
Integer boy = 181;
pageContext.setAttribute("sayi1",s1 );
pageContext.setAttribute("sayi2",s2);
pageContext.setAttribute("boy",boy);
pageContext.setAttribute("bilgi",bilgi);
out.println("sayi 1 : ");
out.println(pageContext.getAttribute("sayi1"));
out.println("sayi2 : ");
out.println(pageContext.getAttribute("sayi2"));
pageContext.setAttribute("bilgi",bilgi, pageContext.SESSION_SCOPE);
pageContext.setAttribute("kilo",kilo, pageContext.APPLICATION_SCOPE);
pageContext.setAttribute("bilg",bilgi);
request.setAttribute("bilgi", bilgi);
//session.setAttribute("bilg", bilgi);
application.setAttribute("bilgi",bilgi);
bilgi += "VIA SESSION OBJECT";
session.setAttribute("bilgi2",bilgi);
application.setAttribute("kilo2", kilo);
out.println("<br> PageContext sayi 1 :" + pageContext.getAttribute("sayi1"));
out.println ("<br> PageContext sayi 2 : " + pageContext.getAttribute("sayi2"));
out.println("<br> PageContext boy :" + pageContext.getAttribute("boy"));
out.println("<br> PageContext bilgi :" + pageContext.getAttribute("bilgi"));
out.println("<br>Session Scope bilgi : " + pageContext.getAttribute("bilgi",pageContext.SESSION_SCOPE));
out.println("<br>Seisson Scope bilgi : " + session .getAttribute("bilgi"));
out. println("<br>Session Scope bilgi2 :" + pageContext.getAttribute("bilgi2",pageContext.SESSION_SCOPE));
out.println("<br>Session Scope bilgi2 :" + session.getAttribute("bilgi2"));
out.println("<br> Aplication Scope Kilo :" + pageContext.getAttribute("kilo",pageContext.APPLICATION_SCOPE));
out.println("<br> Aplication Scope Kilo : "+ application.getAttribute("kilo"));
out.println ("<br> Aplication Scope Kilo2 : " + pageContext.getAttribute("kilo2" , pageContext.APPLICATION_SCOPE));
out. println ("<br> Aplication Scope Kilo2 :" + application.getAttribute("kilo2"));
String isim ;
isim= "PAGECONTEXT Gölkem EREN";
//pageContext.setAttribute("isim",isim);
isim = "REQUEST Gölkem EREN";
request.setAttribute("isim",isim);
isim = "SESSION Gölkem EREN";
session.setAttribute("isim",isim);
isim = "APPLICATION Gölkem EREN";
application.setAttribute("isim",isim);
// pageContext -> request ->session -> application sırasında ilerliyorlar 
// aynı isimde attribute varsa bu sıralama ile gerçekleşiyor 
out.println("<br> PAGECONTEXT isim : " + pageContext.getAttribute("isim"));
out.println("<br> REQUEST isim : " + request.getAttribute("isim"));
out.println("<br> SEISSON isim : " + session.getAttribute("isim"));
out.println("<br> APPLICATION isim : " +application.getAttribute("isim"));
// findAttribute metodu scopeları tarar yani scopeların içerisinde veri oluşturmayı sağlar 
out.println ("<br>FIND ATTRIBUTE : " + pageContext.findAttribute("isim"));%>
</body>
</html>
