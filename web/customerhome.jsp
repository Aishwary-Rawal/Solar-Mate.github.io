<%@include file="customerheader.jsp" %>

	<div id="page">
		<div id="content">
			<div class="contentbg">
				<div class="post">
                                    <%
                                    String email = (String)session.getAttribute("email");%>
					<h2 class="">Welcome <%= email %></h2>
					<div class="entry">
                                            <p>Welcome to <strong>Solar-Mate</strong> family.<br><strong>Solar-Mate</strong> brings all your energy requirements to you on just one click.<br> We are the most trusted brand of this quarter.</P>	
                                        </div>
				</div>
				
				<div style="clear: both;">&nbsp;</div>
			</div>
		</div>
		<!-- end #content -->
		<div id="sidebar-bg">
			<div id="sidebar">
				<ul>
					<li>
						<h2>Top Sellers</h2>
						<ul>
							<li><a href="https://www.waaree.com">Waaree Solar</a></li>
							<li><a href="https://www.luminousindia.com/solar-package">Luminous</a></li>
							<li><a href="https://www.adanisolar.com/">Adani Solar</a></li>
							<li><a href="https://www.tatapowersolar.com/">Tata Power Solar</a></li>
							<li><a href="https://www.vikramsolar.com/">Vikram Solar</a></li>
						</ul>
					</li>
				
				</ul>
			</div>
		</div>
		<!-- end #sidebar -->
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
