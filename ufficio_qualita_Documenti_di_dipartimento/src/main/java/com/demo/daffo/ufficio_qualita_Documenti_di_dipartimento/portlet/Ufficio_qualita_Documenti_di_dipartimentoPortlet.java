package com.demo.daffo.ufficio_qualita_Documenti_di_dipartimento.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

/**
 * @author Administrator
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Naveen Apps-ProcedureAO",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=ufficio_qualita_Documenti_di_dipartimento",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class Ufficio_qualita_Documenti_di_dipartimentoPortlet extends MVCPortlet {
}