<%@page import="dao.CompanyDao" %>
<%
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
    CompanyDao ad = new CompanyDao();
    int i = ad.companyLogin(email,password);
    if(i>0)
    {
        session=request.getSession(); 
        session.setAttribute("email", email);
%>
<script>alert("Company Login Successfull")</script>
<jsp:include page="companyhome.jsp"></jsp:include>
<%}else{%>
<script>alert("Error occured")</script>
<jsp:include page="companylogin.jsp"></jsp:include>
<%}%>