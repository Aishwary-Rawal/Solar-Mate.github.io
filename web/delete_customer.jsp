<%@page import="dao.CustomerDao" %>
<%
    String email = (String)session.getAttribute("email");
    
    
    CustomerDao ad = new CustomerDao();
    int i = ad.deleteCustomer(email);
    if(i>0)
    {
        
%>
<script>alert("Account Deleted")</script>
<jsp:include page="index.jsp"></jsp:include>
<%}else{%>
<script>alert("Error occured")</script>
<jsp:include page="customerhome.jsp"></jsp:include>
<%}%>