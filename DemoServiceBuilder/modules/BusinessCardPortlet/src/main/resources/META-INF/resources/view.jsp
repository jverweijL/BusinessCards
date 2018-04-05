<%@ include file="/init.jsp" %>

<portlet:renderURL var="addBusinesscardURL">
	<portlet:param name="jspPage" value="/add.jsp"/>
	<portlet:param name="backURL" value="<%=PortalUtil.getCurrentURL(request)%>" />
</portlet:renderURL>

<aui:button onClick="${addBusinesscardURL}" value="businesscard.button.add" primary="true"></aui:button>

<liferay-ui:search-container deltaConfigurable="false">
	<aui:nav-bar cssClass="collapse-basic-search" markupView="lexicon">
		
			<aui:nav cssClass="navbar-nav">
				<aui:nav-item label="businesscard.caption" selected="<%= true %>" />
			</aui:nav>
					
			<aui:nav-bar-search>
				<aui:form name="search" >
					<liferay-ui:input-search markupView="lexicon" />
				</aui:form>
			</aui:nav-bar-search>
			
	</aui:nav-bar>
	<liferay-ui:search-container-results results="<%=(List) renderRequest.getAttribute("businesscards") %>"/>

	<liferay-ui:search-container-row
		className="com.liferay.demo.model.businesscard"
		modelVar="shareholder"	>
	
		<liferay-ui:search-container-column-text property="name" name="businesscard.name"/>
		<liferay-ui:search-container-column-text property="position" name="businesscard.position"/>
		<liferay-ui:search-container-column-text property="email" name="businesscard.email"/>
		<liferay-ui:search-container-column-text property="phone" name="businesscard.phone"/>
		<liferay-ui:search-container-column-text property="company" name="businesscard.company"/>
		
	</liferay-ui:search-container-row>
	
	<liferay-ui:search-iterator markupView="lexicon"  />
</liferay-ui:search-container>