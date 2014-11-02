<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleSendRequestProxyid" scope="session" class="webTest.SendRequestProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleSendRequestProxyid.setEndpoint(request.getParameter("endpoint"));
%>

<%
String method = request.getParameter("method");
int methodID = 0;
if (method == null) methodID = -1;

if(methodID != -1) methodID = Integer.parseInt(method);
boolean gotMethod = false;

try {
switch (methodID){ 
case 2:
        gotMethod = true;
        java.lang.String getEndpoint2mtemp = sampleSendRequestProxyid.getEndpoint();
if(getEndpoint2mtemp == null){
%>
<%=getEndpoint2mtemp %>
<%
}else{
        String tempResultreturnp3 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(getEndpoint2mtemp));
        %>
        <%= tempResultreturnp3 %>
        <%
}
break;
case 5:
        gotMethod = true;
        String endpoint_0id=  request.getParameter("endpoint8");
            java.lang.String endpoint_0idTemp = null;
        if(!endpoint_0id.equals("")){
         endpoint_0idTemp  = endpoint_0id;
        }
        sampleSendRequestProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        webTest.SendRequest getSendRequest10mtemp = sampleSendRequestProxyid.getSendRequest();
if(getSendRequest10mtemp == null){
%>
<%=getSendRequest10mtemp %>
<%
}else{
        if(getSendRequest10mtemp!= null){
        String tempreturnp11 = getSendRequest10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String strToDecrypt_1id=  request.getParameter("strToDecrypt16");
            java.lang.String strToDecrypt_1idTemp = null;
        if(!strToDecrypt_1id.equals("")){
         strToDecrypt_1idTemp  = strToDecrypt_1id;
        }
        java.lang.String decrypt13mtemp = sampleSendRequestProxyid.decrypt(strToDecrypt_1idTemp);
if(decrypt13mtemp == null){
%>
<%=decrypt13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(decrypt13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 18:
        gotMethod = true;
        String strToEncrypt_2id=  request.getParameter("strToEncrypt21");
            java.lang.String strToEncrypt_2idTemp = null;
        if(!strToEncrypt_2id.equals("")){
         strToEncrypt_2idTemp  = strToEncrypt_2id;
        }
        java.lang.String encrypt18mtemp = sampleSendRequestProxyid.encrypt(strToEncrypt_2idTemp);
if(encrypt18mtemp == null){
%>
<%=encrypt18mtemp %>
<%
}else{
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(encrypt18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
}
break;
case 23:
        gotMethod = true;
        String name_3id=  request.getParameter("name26");
            java.lang.String name_3idTemp = null;
        if(!name_3id.equals("")){
         name_3idTemp  = name_3id;
        }
        String address_4id=  request.getParameter("address28");
            java.lang.String address_4idTemp = null;
        if(!address_4id.equals("")){
         address_4idTemp  = address_4id;
        }
        String contact_5id=  request.getParameter("contact30");
            java.lang.String contact_5idTemp = null;
        if(!contact_5id.equals("")){
         contact_5idTemp  = contact_5id;
        }
        String email_6id=  request.getParameter("email32");
            java.lang.String email_6idTemp = null;
        if(!email_6id.equals("")){
         email_6idTemp  = email_6id;
        }
        String username_7id=  request.getParameter("username34");
            java.lang.String username_7idTemp = null;
        if(!username_7id.equals("")){
         username_7idTemp  = username_7id;
        }
        String password_8id=  request.getParameter("password36");
            java.lang.String password_8idTemp = null;
        if(!password_8id.equals("")){
         password_8idTemp  = password_8id;
        }
        java.lang.String acceptRequest23mtemp = sampleSendRequestProxyid.acceptRequest(name_3idTemp,address_4idTemp,contact_5idTemp,email_6idTemp,username_7idTemp,password_8idTemp);
if(acceptRequest23mtemp == null){
%>
<%=acceptRequest23mtemp %>
<%
}else{
        String tempResultreturnp24 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(acceptRequest23mtemp));
        %>
        <%= tempResultreturnp24 %>
        <%
}
break;
}
} catch (Exception e) { 
%>
Exception: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.toString()) %>
Message: <%= org.eclipse.jst.ws.util.JspUtils.markup(e.getMessage()) %>
<%
return;
}
if(!gotMethod){
%>
result: N/A
<%
}
%>
</BODY>
</HTML>