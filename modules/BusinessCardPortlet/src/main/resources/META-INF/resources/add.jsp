<%@ include file="/init.jsp" %>

<h1>Add Businesscard</h1>

<portlet:actionURL name="addBusinesscard" var="addBusinesscardURL"></portlet:actionURL>

<liferay-ui:header backURL="<%=ParamUtil.getString(request, "backURL")%>" title="Back" />

<aui:form action="${addBusinesscardURL}">
<aui:input name="name" label="businesscard.name"></aui:input>
<aui:input name="position" label="businesscard.position"></aui:input>
<aui:input name="email" label="businesscard.email"></aui:input>
<aui:input name="phone" label="businesscard.phone"></aui:input>
<aui:input name="company" label="businesscard.company"></aui:input>
<aui:button value="businesscard.button.add" primary="true" type="submit"></aui:button>
</aui:form>