<%@include file="customerheader.jsp" %>

	<div id="page">
		<div id="">
			<div class="contentbg">
				<div class="post">
					<h2 class="" align-text="middle">Calculate Load</h2>
                                        <p>**Note- Enter readings in KW or KWH</p>
					<div class="entry">
<div id="splash"><img src="images/electricitybill.PNG" width="600" height="610" alt="" /></div>
<form action="calculate_load_db.jsp" align="middle">
<p style="font-size : 16px;">Enter Sanctioned Load</p>
            <input style="height:30px; width:300px;" required type="text" name="sanction_load" placeholder="Enter Sanction Load">
<p style="font-size : 16px;">Enter consumption 1</p>
            <input style="height:30px; width:300px;" required type="text" name="consumption1" placeholder="Enter consumption 1">
<p style="font-size : 16px;">Enter consumption 2</p>
            <input style="height:30px; width:300px;" required type="text" name="consumption2" placeholder="Enter consumption 2">
<p style="font-size : 16px;">Enter consumption 3</p>
            <input style="height:30px; width:300px;" required type="text" name="consumption3" placeholder="Enter consumption 3">
<p style="font-size : 16px;">Enter consumption 4</p>
            <input style="height:30px; width:300px;" required type="text" name="consumption4" placeholder="Enter consumption 4">           
<p style="font-size : 16px;">Enter consumption 5</p>
            <input style="height:30px; width:300px;" required type="text" name="consumption5" placeholder="Enter consumption 5">
<p style="font-size : 16px;">Enter consumption 6</p>
            <input style="height:30px; width:300px;" required type="text" name="consumption6" placeholder="Enter consumption 6">            
            <br>
            <br>
            <br>
            <input style="height:30px; width:300px;" type="submit" value="Calculate Load and Compare">
           
            
           </form>
                                            
                                        
                                        
                                        
                                        
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
