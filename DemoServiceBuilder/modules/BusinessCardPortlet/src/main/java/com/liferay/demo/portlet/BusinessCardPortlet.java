package com.liferay.demo.portlet;

import com.liferay.demo.constants.BusinessCardPortletKeys;
import com.liferay.demo.model.businesscard;
import com.liferay.demo.service.businesscardLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;


/**
 * @author jverweij
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=BusinessCardPortlet Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + BusinessCardPortletKeys.BusinessCard,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class BusinessCardPortlet extends MVCPortlet {
	
	private Log _log = LogFactoryUtil.getLog(BusinessCardPortlet.class.getName());	
	
	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		renderRequest.setAttribute("businesscards", businesscardLocalServiceUtil.getbusinesscards(-1, -1));
		
		super.doView(renderRequest, renderResponse);
	}
	
	
	@ProcessAction(name="addBusinesscard")
	 public void addBusinesscard(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException {	  
		
		String name = ParamUtil.getString(actionRequest,"name");
		String position = ParamUtil.getString(actionRequest,"position");
		String phone = ParamUtil.getString(actionRequest,"phone");
		String email = ParamUtil.getString(actionRequest,"email");
		String company = ParamUtil.getString(actionRequest,"company");
		businesscardLocalServiceUtil.saveBusinesscard(name, position, phone, email, company);
		
		
		_log.info("#################Shareholder Added Successfully#########################");
	 }	
}