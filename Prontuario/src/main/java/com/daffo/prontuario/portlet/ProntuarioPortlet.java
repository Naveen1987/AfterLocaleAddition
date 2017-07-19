package com.daffo.prontuario.portlet;

import com.daffo.prontuario_drugservice.model.prontuario_drug;
import com.daffo.prontuario_drugservice.service.prontuario_drugLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;

import org.osgi.service.component.annotations.Component;

/**
 * @author Administrator
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=Naveen Apps-UnitaOperative",
		"javax.portlet.init-param.add-process-action-success-action=false",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=Prontuario Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ProntuarioPortlet extends MVCPortlet {
	@ProcessAction(name="formSubmit_drug")
	 public void formSubmit_drug(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException {
		prontuario_drug pd=prontuario_drugLocalServiceUtil.createprontuario_drug(CounterLocalServiceUtil.increment());
		pd.setCodice(ParamUtil.getString(actionRequest, "Codice"));
		pd.setGruppo(ParamUtil.getString(actionRequest, "Gruppo"));
		pd.setSottoGruppo(ParamUtil.getString(actionRequest, "SottoGruppo"));
		pd.setPrincipio_Attivo(ParamUtil.getString(actionRequest, "Principio_Attivo"));
		pd.setNome_Commerciale(ParamUtil.getString(actionRequest, "Nome_Commerciale"));
		prontuario_drugLocalServiceUtil.addprontuario_drug(pd);
		SessionMessages.add(actionRequest, "success");
		
	}
	
	@ProcessAction(name="editSubmit_drug")
	 public void editSubmit_drug(ActionRequest actionRequest, ActionResponse actionResponse)
	   throws IOException, PortletException, PortalException {
		System.out.println("Ok");
		prontuario_drug pd=prontuario_drugLocalServiceUtil.getprontuario_drug(new Long(ParamUtil.getString(actionRequest, "drug_id")).longValue());
		pd.setCodice(ParamUtil.getString(actionRequest, "Codice"));
		pd.setGruppo(ParamUtil.getString(actionRequest, "Gruppo"));
		pd.setSottoGruppo(ParamUtil.getString(actionRequest, "SottoGruppo"));
		pd.setPrincipio_Attivo(ParamUtil.getString(actionRequest, "Principio_Attivo"));
		pd.setNome_Commerciale(ParamUtil.getString(actionRequest, "Nome_Commerciale"));
		prontuario_drugLocalServiceUtil.updateprontuario_drug(pd);
		actionRequest.setAttribute("data", pd.getDrug_id());
		SessionMessages.add(actionRequest, "success");
		
	}
	
	
}