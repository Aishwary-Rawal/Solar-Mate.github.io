<%@include file="customerheader.jsp" %>
<%@page import="dto.Product" %>
<%@page import="dao.ProductDao" %>
<%@page import="java.util.*" %>
<%@page import="java.lang.Math" %>
	<div id="page">
		<div id="">
			<div class="contentbg">
				<div class="post">
					<h2 class="">Product Comparison</h2>
                                        <%
                                    double load = (Double)session.getAttribute("load");
                                        load = Math.round(load*100d)/100d;%>
                                    <h3 class="">Showing product comparison for  <%= load %> KW requirment</h3>
					<div class="entry">

                                            <table border="1" cellpadding="10">
                                                <thead>
                                                    <tr>
                                                        <th>Product<br>Id</th>
                                                        <th>Product<br>Name</th>
                                                        <th>Company<br>Name</th>
                                                        <th>Output</th>
                                                        <th>Price</th>
                                                    </tr>
                                                </thead>
                                                <tbody>
                                                    <%
                                                            
                                                            ProductDao pd = new ProductDao();
                                                            List<Product> list = pd.getProductList();
                                                            for(Product rt : list)
                                                            { 
                                                              String Id =rt.getId();
                                                              String Product_name =rt.getProduct_name();
                                                              String Company_name =rt.getCompany_name();
                                                              String Output =rt.getOutput();
                                                              double Price =(Integer.parseInt(rt.getPrice()))*load;

                                                    %>
                                                    <tr>
                                                        <td><%=Id %></td>
                                                        <td><%=Product_name %></td>
                                                        <td><%=Company_name %></td>
                                                        <td><%=Output %></td>
                                                        <td><%=Price %></td>
                                                    </tr>
                                                    <%}%>
                                                </tbody>
                                                
                                            </table>                                            
                                            
                                        </div>
				</div>
				
				<div style="clear: both;">&nbsp;</div>
			</div>
		</div>
		<div style="clear: both;">&nbsp;</div>
	</div>
	<!-- end #page -->
</div>
<div id="footer">
    <p>2021 | All Rights Reserved |  &copy;Design by Aditi Aishwary Ambika &trade;</p>
</div>
<!-- end #footer -->
</body>
</html>
