package com.daffo.DataMigrationUtility_New.portlet;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.ResourceBundle;
import java.util.Set;
import java.util.regex.Pattern;
import javax.portlet.ActionRequest;
import com.liferay.document.library.kernel.model.DLFileEntryType;
import com.liferay.document.library.kernel.model.DLFolder;
import com.liferay.document.library.kernel.service.DLAppLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLAppServiceUtil;
import com.liferay.document.library.kernel.service.DLFileEntryTypeLocalServiceUtil;
import com.liferay.document.library.kernel.service.DLFolderLocalServiceUtil;
import com.liferay.dynamic.data.mapping.model.DDMStructure;
import com.liferay.dynamic.data.mapping.service.DDMStructureLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.upload.FileItem;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.LocaleUtil;
import com.liferay.dynamic.data.mapping.storage.Field;
import com.liferay.dynamic.data.mapping.storage.Fields;
import com.liferay.portal.kernel.repository.model.Folder;
import com.liferay.portal.kernel.service.ServiceContext;

public class FileUploadOnDocType {
private final Log logger=LogFactoryUtil.getLog("FileUploadOnDocumentType");
public boolean uploadInfo(ThemeDisplay themeDisplay, String folderId,String folderName,	String docId,String docName,UploadPortletRequest uploadPortletRequest, ActionRequest actionRequest) throws NumberFormatException, PortalException, IOException{
	//System.out.println("Folder Info:-"+folderId+" "+folderName);
	//System.out.println("Documenet Type Info:-"+docId+" "+docName);
	logger.info("{ Folder Info:-"+folderId+" "+folderName+" }");
	logger.info("{ Documenet Type Info:-"+docId+" "+docName+" }");
	DDMStructure ddm=DDMStructureLocalServiceUtil.getDDMStructure(new Long(docId).longValue());
	Set<String> fieldsName=null;
	if(ddm.getNameCurrentValue().equalsIgnoreCase(docName)){
		logger.info("{ Documenet Type Confirmation - Ok } ");
		fieldsName=ddm.getFieldNames();
		logger.info("{ Documenet Type Fields-"+fieldsName+" } ");
	}
	Folder folder=DLAppServiceUtil.getFolder(new Long(folderId).longValue());
	if(folder.getName().equalsIgnoreCase(folderName)){
		logger.info("{ Folder Name Confirmation - Ok }");
	}
	String sfolder=folder.getName().toString();
	if(sfolder.matches("(?i)Procedurre-Doc Az|Documenti di dipartimento"
			+ "|Sicurezza - Rischio|Note Informative|"
			+ "Farmacia|SIECIO_CIO|SPP_MC|Direzioni Mediche|SITRA"
			+ "|HRM|Comitati_Gruppi di Miglioramento|Rapporti e Dati"
			+ "|Accrediatmento e Controlli|Cartella Clinica"
			+ "|Report|Normative|Linee Guida|Codifiche|HLA e Malattie"
			+ "|Accoglienza e Ospitalita |Gestione Beni e Servizi|Abbiategrasso"
			+ "|Cuggiono|Magenta|Legnano"
			+ "|Affari Generali e Legali|Comitato Scientifico"
			+ "|Servizio Risorse Umane"
			+ "|Modulistica in uso|Piano Formativo Annuale|Regolamento"
			+ "|DRG Indicazioni codifica|Pubblicazioni"
			+ "|Monitoraggio Analitico Obbiettivi|Monitoraggio Sintetico Obbiettivi"
			+ "|Giacenze|Acquisti Appalti|Direzioni Mediche|Regole 2016|Regole 2017")){
		Map<String, FileItem[]> files= uploadPortletRequest.getMultipartParameterMap();
		for (Entry<String, FileItem[]> file2 : files.entrySet()) {
			FileItem item[] =file2.getValue();
				for (FileItem fileItem : item) {
					String fileNameW=fileItem.getFileName();
					try{
						if (fileNameW.indexOf(".") > 0){
							fileNameW = fileNameW.substring(0, fileNameW.lastIndexOf("."));
					     }
						//Value Extration from file name
						String val[]=fileNameW.split(Pattern.quote("@"));
						//getting attribute of Document Type
						String typeName[]=new ListOfDocType().getDocType(folderName).split(Pattern.quote(","));
						//Val to type mapping
						Fields fields=new Fields();
						if(val.length<typeName.length){
							for(int i=0;i<val.length;i++){
								if(!typeName[i].equalsIgnoreCase("Titolo")){
									Field f=new Field(ddm.getStructureId(), typeName[i], val[i]);
									fields.put(f);	
								}
							}
						}
						else{
							for(int i=0;i<typeName.length;i++){
								if(!typeName[i].equalsIgnoreCase("Titolo")){
									Field f=new Field(ddm.getStructureId(), typeName[i], val[i]);
									fields.put(f);	
								}	
							}
						}
						if(typeName.length>val.length){
							int i=val.length;
							while(i<typeName.length){
								Field f=new Field(ddm.getStructureId(), typeName[i], "-");
								fields.put(f);
								i++;
							}
						}
						logger.info("{ File Name-"+fileItem.getFileName()+" }");
//				        long userId = themeDisplay.getUserId();
//						long groupId = themeDisplay.getScopeGroupId();
						long repositoryId = themeDisplay.getScopeGroupId();				
						String title = fileItem.getFileName();
						String description = title +" is added via programatically";
						String mimeType = fileItem.getContentType();	
						File file = fileItem.getStoreLocation();
						System.out.println(file.getName());
						System.out.println(file.length());
						String changeLog = "This is By Program";
							DLFileEntryType sp=null;
							try{
							List<DLFileEntryType> dlFileEntryTypes =DLFileEntryTypeLocalServiceUtil.getFileEntryTypes(ddm.getStructureId());
							if(!dlFileEntryTypes.isEmpty()){
								sp=dlFileEntryTypes.get(0);
							}
							}catch(Exception ex){
								logger.error("No Document Type {"+ddm.getName()+"} validation failed. Please Recreate your Document type");
								return false;
							}
							
							InputStream is =fileItem.getInputStream();
							System.out.println(is.available());
							ServiceContext serviceContext = new ServiceContext();
							serviceContext.setAddGuestPermissions(true);
							serviceContext.setAddGroupPermissions(true);
							serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
							serviceContext.setUserId(themeDisplay.getDefaultUserId());
							//Because Default language of DDMStructure id es_US so do when you import document in different Locale
							serviceContext.setLanguageId("es_US");
							serviceContext.setAttribute("fileEntryTypeId", sp.getFileEntryTypeId());
							//Uploading metaData of File
							for(Field f:fields){
								String fieldName=""+ddm.getStructureId()+f.getName();
								serviceContext.setAttribute(fieldName, f.getValue());
								logger.info("Value Mapped {"+f.getName()+"="+f.getValue()+"}");
							}			
							System.out.println(val[1]);
							DLAppLocalServiceUtil.addFileEntry(themeDisplay.getUserId(),repositoryId, folder.getFolderId(), title, mimeType, 
									val[1], description, changeLog, is, file.length(), serviceContext);
						    logger.info("File is Successfully Uploaded-{"+title+"}");
						    
					}catch (Exception e) {
						logger.error(fileNameW+" Not Uploaded and Error Description "+e.getMessage());
					}
				}		
				
		}	
	}
	

	else if(sfolder.matches("Modulistica|Regolamenti"))
	{
		System.out.println( "Numero,Modulo");
		Map<String, FileItem[]> files= uploadPortletRequest.getMultipartParameterMap();
		for (Entry<String, FileItem[]> file2 : files.entrySet()) {
			FileItem item[] =file2.getValue();
				for (FileItem fileItem : item) {
					String fileNameW=fileItem.getFileName();
					try{
						if (fileNameW.indexOf(".") > 0){
							fileNameW = fileNameW.substring(0, fileNameW.lastIndexOf("."));
					     }
						//Value Extration from file name
						String val[]=fileNameW.split(Pattern.quote("@"));
						//getting attribute of Document Type
						String typeName[]=new ListOfDocType().getDocType(folderName).split(Pattern.quote(","));
						//Val to type mapping
						Fields fields=new Fields();
						if(val.length<typeName.length){
							for(int i=0;i<val.length;i++){
								if(!typeName[i].equalsIgnoreCase("Titolo")){
									Field f=new Field(ddm.getStructureId(), typeName[i], val[i]);
									fields.put(f);	
								}
							}
						}
						else{
							for(int i=0;i<typeName.length;i++){
								if(!typeName[i].equalsIgnoreCase("Titolo")){
									Field f=new Field(ddm.getStructureId(), typeName[i], val[i]);
									fields.put(f);	
								}	
							}
						}
						if(typeName.length>val.length){
							int i=val.length;
							while(i<typeName.length){
								Field f=new Field(ddm.getStructureId(), typeName[i], "-");
								fields.put(f);
								i++;
							}
						}
						logger.info("{ File Name-"+fileItem.getFileName()+" }");
//				        long userId = themeDisplay.getUserId();
//						long groupId = themeDisplay.getScopeGroupId();
						long repositoryId = themeDisplay.getScopeGroupId();				
						String title = fileItem.getFileName();
						String description = title +" is added via programatically";
						String mimeType = fileItem.getContentType();	
						File file = fileItem.getStoreLocation();
						System.out.println(file.getName());
						System.out.println(file.length());
						String changeLog = "This is By Program";
							DLFileEntryType sp=null;
							try{
							List<DLFileEntryType> dlFileEntryTypes =DLFileEntryTypeLocalServiceUtil.getFileEntryTypes(ddm.getStructureId());
							if(!dlFileEntryTypes.isEmpty()){
								sp=dlFileEntryTypes.get(0);
							}
							}catch(Exception ex){
								logger.error("No Document Type {"+ddm.getName()+"} validation failed. Please Recreate your Document type");
								return false;
							}
							
							InputStream is =fileItem.getInputStream();
							System.out.println(is.available());
							ServiceContext serviceContext = new ServiceContext();
							serviceContext.setAddGuestPermissions(true);
							serviceContext.setAddGroupPermissions(true);
							serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
							serviceContext.setUserId(themeDisplay.getDefaultUserId());
							//Because Default language of DDMStructure id es_US so do when you import document in different Locale
							serviceContext.setLanguageId("es_US");
							serviceContext.setAttribute("fileEntryTypeId", sp.getFileEntryTypeId());
							//Uploading metaData of File
							for(Field f:fields){
								String fieldName=""+ddm.getStructureId()+f.getName();
								serviceContext.setAttribute(fieldName, f.getValue());
								logger.info("Value Mapped {"+f.getName()+"="+f.getValue()+"}");
							}			
							
							DLAppLocalServiceUtil.addFileEntry(themeDisplay.getUserId(),repositoryId, folder.getFolderId(), title, mimeType, 
									fileNameW, description, changeLog, is, file.length(), serviceContext);
						    logger.info("File is Successfully Uploaded-{"+title+"}");
						    
					}catch (Exception e) {
						logger.error(fileNameW+" Not Uploaded and Error Description "+e.getMessage());
					}
				}		
				
		}	
	}
	else if(sfolder.matches("Customer Satisfaction"))
	{
		System.out.println( "Anno,Sede,UnitaOrganizzativa");
		Map<String, FileItem[]> files= uploadPortletRequest.getMultipartParameterMap();
		for (Entry<String, FileItem[]> file2 : files.entrySet()) {
			FileItem item[] =file2.getValue();
				for (FileItem fileItem : item) {
					String fileNameW=fileItem.getFileName();
					try{
						if (fileNameW.indexOf(".") > 0){
							fileNameW = fileNameW.substring(0, fileNameW.lastIndexOf("."));
					     }
						//Value Extration from file name
						String val[]=fileNameW.split(Pattern.quote("@"));
						//getting attribute of Document Type
						String typeName[]=new ListOfDocType().getDocType(folderName).split(Pattern.quote(","));
						//Val to type mapping
						Fields fields=new Fields();
						if(val.length<typeName.length){
							for(int i=0;i<val.length;i++){
								if(!typeName[i].equalsIgnoreCase("Titolo")){
									Field f=new Field(ddm.getStructureId(), typeName[i], val[i]);
									fields.put(f);	
								}
							}
						}
						else{
							for(int i=0;i<typeName.length;i++){
								if(!typeName[i].equalsIgnoreCase("Titolo")){
									Field f=new Field(ddm.getStructureId(), typeName[i], val[i]);
									fields.put(f);	
								}	
							}
						}
						if(typeName.length>val.length){
							int i=val.length;
							while(i<typeName.length){
								Field f=new Field(ddm.getStructureId(), typeName[i], "-");
								fields.put(f);
								i++;
							}
						}
						logger.info("{ File Name-"+fileItem.getFileName()+" }");
//				        long userId = themeDisplay.getUserId();
//						long groupId = themeDisplay.getScopeGroupId();
						long repositoryId = themeDisplay.getScopeGroupId();				
						String title = fileItem.getFileName();
						String description = title +" is added via programatically";
						String mimeType = fileItem.getContentType();	
						File file = fileItem.getStoreLocation();
						System.out.println(file.getName());
						System.out.println(file.length());
						String changeLog = "This is By Program";
							DLFileEntryType sp=null;
							try{
							List<DLFileEntryType> dlFileEntryTypes =DLFileEntryTypeLocalServiceUtil.getFileEntryTypes(ddm.getStructureId());
							if(!dlFileEntryTypes.isEmpty()){
								sp=dlFileEntryTypes.get(0);
							}
							}catch(Exception ex){
								logger.error("No Document Type {"+ddm.getName()+"} validation failed. Please Recreate your Document type");
								return false;
							}
							
							InputStream is =fileItem.getInputStream();
							System.out.println(is.available());
							ServiceContext serviceContext = new ServiceContext();
							serviceContext.setAddGuestPermissions(true);
							serviceContext.setAddGroupPermissions(true);
							serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
							serviceContext.setUserId(themeDisplay.getDefaultUserId());
							//Because Default language of DDMStructure id es_US so do when you import document in different Locale
							serviceContext.setLanguageId("es_US");
							serviceContext.setAttribute("fileEntryTypeId", sp.getFileEntryTypeId());
							//Uploading metaData of File
							for(Field f:fields){
								String fieldName=""+ddm.getStructureId()+f.getName();
								serviceContext.setAttribute(fieldName, f.getValue());
								logger.info("Value Mapped {"+f.getName()+"="+f.getValue()+"}");
							}			
							
							DLAppLocalServiceUtil.addFileEntry(themeDisplay.getUserId(),repositoryId, folder.getFolderId(), title, mimeType, 
									fileNameW, description, changeLog, is, file.length(), serviceContext);
						    logger.info("File is Successfully Uploaded-{"+title+"}");
						    
					}catch (Exception e) {
						logger.error(fileNameW+" Not Uploaded and Error Description "+e.getMessage());
					}
				}		
				
		}	
	}
	else if(sfolder.matches("Manuali"))
	{
		System.out.println("Applicativo,Spec,Titolo,Lingua,Dimensione");
		System.out.println( "Numero,Modulo");
		Map<String, FileItem[]> files= uploadPortletRequest.getMultipartParameterMap();
		for (Entry<String, FileItem[]> file2 : files.entrySet()) {
			FileItem item[] =file2.getValue();
				for (FileItem fileItem : item) {
					String fileNameW=fileItem.getFileName();
					try{
						if (fileNameW.indexOf(".") > 0){
							fileNameW = fileNameW.substring(0, fileNameW.lastIndexOf("."));
					     }
						//Value Extration from file name
						String val[]=fileNameW.split(Pattern.quote("@"));
						//getting attribute of Document Type
						String typeName[]=new ListOfDocType().getDocType(folderName).split(Pattern.quote(","));
						//Val to type mapping
						Fields fields=new Fields();
						if(val.length<typeName.length){
							for(int i=0;i<val.length;i++){
								if(!typeName[i].equalsIgnoreCase("Titolo")){
									Field f=new Field(ddm.getStructureId(), typeName[i], val[i]);
									fields.put(f);	
								}
							}
						}
						else{
							for(int i=0;i<typeName.length;i++){
								if(!typeName[i].equalsIgnoreCase("Titolo")){
									Field f=new Field(ddm.getStructureId(), typeName[i], val[i]);
									fields.put(f);	
								}	
							}
						}
						if(typeName.length>val.length){
							int i=val.length;
							while(i<typeName.length){
								Field f=new Field(ddm.getStructureId(), typeName[i], "-");
								fields.put(f);
								i++;
							}
						}
						logger.info("{ File Name-"+fileItem.getFileName()+" }");
//				        long userId = themeDisplay.getUserId();
//						long groupId = themeDisplay.getScopeGroupId();
						long repositoryId = themeDisplay.getScopeGroupId();				
						String title = fileItem.getFileName();
						String description = title +" is added via programatically";
						String mimeType = fileItem.getContentType();	
						File file = fileItem.getStoreLocation();
						System.out.println(file.getName());
						System.out.println(file.length());
						String changeLog = "This is By Program";
							DLFileEntryType sp=null;
							try{
							List<DLFileEntryType> dlFileEntryTypes =DLFileEntryTypeLocalServiceUtil.getFileEntryTypes(ddm.getStructureId());
							if(!dlFileEntryTypes.isEmpty()){
								sp=dlFileEntryTypes.get(0);
							}
							}catch(Exception ex){
								logger.error("No Document Type {"+ddm.getName()+"} validation failed. Please Recreate your Document type");
								return false;
							}
							
							InputStream is =fileItem.getInputStream();
							System.out.println(is.available());
							ServiceContext serviceContext = new ServiceContext();
							serviceContext.setAddGuestPermissions(true);
							serviceContext.setAddGroupPermissions(true);
							serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
							serviceContext.setUserId(themeDisplay.getDefaultUserId());
							//Because Default language of DDMStructure id es_US so do when you import document in different Locale
							serviceContext.setLanguageId("es_US");
							serviceContext.setAttribute("fileEntryTypeId", sp.getFileEntryTypeId());
							//Uploading metaData of File
							for(Field f:fields){
								String fieldName=""+ddm.getStructureId()+f.getName();
								serviceContext.setAttribute(fieldName, f.getValue());
								logger.info("Value Mapped {"+f.getName()+"="+f.getValue()+"}");
							}			
							System.out.println(val[2]);
							DLAppLocalServiceUtil.addFileEntry(themeDisplay.getUserId(),repositoryId, folder.getFolderId(), title, mimeType, 
									val[2], description, changeLog, is, file.length(), serviceContext);
						    logger.info("File is Successfully Uploaded-{"+title+"}");
						    
					}catch (Exception e) {
						logger.error(fileNameW+" Not Uploaded and Error Description "+e.getMessage());
					}
				}		
				
		}	
	}
	
	/*Map<String, FileItem[]> files= uploadPortletRequest.getMultipartParameterMap();
	for (Entry<String, FileItem[]> file2 : files.entrySet()) {
		FileItem item[] =file2.getValue();
			for (FileItem fileItem : item) {
				String fileNameW=fileItem.getFileName();
				try{
					if (fileNameW.indexOf(".") > 0){
						fileNameW = fileNameW.substring(0, fileNameW.lastIndexOf("."));
				     }
					//Value Extration from file name
					String val[]=fileNameW.split(Pattern.quote("@"));
					//getting attribute of Document Type
					String typeName[]=new ListOfDocType().getDocType(folderName).split(Pattern.quote(","));
					//Val to type mapping
					Fields fields=new Fields();
					if(val.length<typeName.length){
						for(int i=0;i<val.length;i++){
							if(!typeName[i].equalsIgnoreCase("Titolo")){
								Field f=new Field(ddm.getStructureId(), typeName[i], val[i]);
								fields.put(f);	
							}
						}
					}
					else{
						for(int i=0;i<typeName.length;i++){
							if(!typeName[i].equalsIgnoreCase("Titolo")){
								Field f=new Field(ddm.getStructureId(), typeName[i], val[i]);
								fields.put(f);	
							}	
						}
					}
					if(typeName.length>val.length){
						int i=val.length;
						while(i<typeName.length){
							Field f=new Field(ddm.getStructureId(), typeName[i], "-");
							fields.put(f);
							i++;
						}
					}
					logger.info("{ File Name-"+fileItem.getFileName()+" }");
//			        long userId = themeDisplay.getUserId();
//					long groupId = themeDisplay.getScopeGroupId();
					long repositoryId = themeDisplay.getScopeGroupId();				
					String title = fileItem.getFileName();
					String description = title +" is added via programatically";
					String mimeType = fileItem.getContentType();	
					File file = fileItem.getStoreLocation();
					System.out.println(file.getName());
					System.out.println(file.length());
					String changeLog = "This is By Program";
						DLFileEntryType sp=null;
						try{
						List<DLFileEntryType> dlFileEntryTypes =DLFileEntryTypeLocalServiceUtil.getFileEntryTypes(ddm.getStructureId());
						if(!dlFileEntryTypes.isEmpty()){
							sp=dlFileEntryTypes.get(0);
						}
						}catch(Exception ex){
							logger.error("No Document Type {"+ddm.getName()+"} validation failed. Please Recreate your Document type");
							return false;
						}
						
						InputStream is =fileItem.getInputStream();
						System.out.println(is.available());
						ServiceContext serviceContext = new ServiceContext();
						serviceContext.setAddGuestPermissions(true);
						serviceContext.setAddGroupPermissions(true);
						serviceContext.setScopeGroupId(themeDisplay.getScopeGroupId());
						serviceContext.setUserId(themeDisplay.getDefaultUserId());
						//Because Default language of DDMStructure id es_US so do when you import document in different Locale
						serviceContext.setLanguageId("es_US");
						serviceContext.setAttribute("fileEntryTypeId", sp.getFileEntryTypeId());
						//Uploading metaData of File
						for(Field f:fields){
							String fieldName=""+ddm.getStructureId()+f.getName();
							serviceContext.setAttribute(fieldName, f.getValue());
							logger.info("Value Mapped {"+f.getName()+"="+f.getValue()+"}");
						}			
						System.out.println(val[1]);
						DLAppLocalServiceUtil.addFileEntry(themeDisplay.getUserId(),repositoryId, folder.getFolderId(), title, mimeType, 
								val[1], description, changeLog, is, file.length(), serviceContext);
					    logger.info("File is Successfully Uploaded-{"+title+"}");
					    
				}catch (Exception e) {
					logger.error(fileNameW+" Not Uploaded and Error Description "+e.getMessage());
				}
			}		
			
	}	*/
	return true;
}

}