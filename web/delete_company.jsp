<%@page import="dao.CompanyDao" %>
<%
    String email = (String)session.getAttribute("email");
    
    
    CompanyDao ad = new CompanyDao();
    int i = ad.deleteCompany(email);
    if(i>0)
    {
        
%>
<script>alert("Account Deleted")</script>
<jsp:include page="index.jsp"></jsp:include>
<%}else{%>
<script>alert("Error occured")</script>
<jsp:include page="companyhome.jsp"></jsp:include>
<%}%>