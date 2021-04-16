<%@page import="dao.RatingDao" %>

<%
    String company_name = request.getParameter("company_name");
    String rating = request.getParameter("rating");
    
    RatingDao cd = new RatingDao();
    int i = cd.addRating(company_name,rating);
    if(i>0)
    {
        
%>
<script>alert("Thank you!!")</script>
<jsp:include page="customerhome.jsp"></jsp:include>
<%}else{%>
<script>alert("Error occured")</script>
<jsp:include page="rate.jsp"></jsp:include>
<%}%>