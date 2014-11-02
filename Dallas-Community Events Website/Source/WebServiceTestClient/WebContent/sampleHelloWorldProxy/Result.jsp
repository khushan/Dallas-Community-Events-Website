<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleHelloWorldProxyid" scope="session" class="webTest.HelloWorldProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleHelloWorldProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleHelloWorldProxyid.getEndpoint();
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
        sampleHelloWorldProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        webTest.HelloWorld getHelloWorld10mtemp = sampleHelloWorldProxyid.getHelloWorld();
if(getHelloWorld10mtemp == null){
%>
<%=getHelloWorld10mtemp %>
<%
}else{
%>
<TABLE>
<TR>
<TD COLSPAN="3" ALIGN="LEFT">returnp:</TD>
</TABLE>
<%
}
break;
case 15:
        gotMethod = true;
        String strToDecrypt_1id=  request.getParameter("strToDecrypt18");
            java.lang.String strToDecrypt_1idTemp = null;
        if(!strToDecrypt_1id.equals("")){
         strToDecrypt_1idTemp  = strToDecrypt_1id;
        }
        java.lang.String decrypt15mtemp = sampleHelloWorldProxyid.decrypt(strToDecrypt_1idTemp);
if(decrypt15mtemp == null){
%>
<%=decrypt15mtemp %>
<%
}else{
        String tempResultreturnp16 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(decrypt15mtemp));
        %>
        <%= tempResultreturnp16 %>
        <%
}
break;
case 20:
        gotMethod = true;
        String user_2id=  request.getParameter("user23");
            java.lang.String user_2idTemp = null;
        if(!user_2id.equals("")){
         user_2idTemp  = user_2id;
        }
        String pwd_3id=  request.getParameter("pwd25");
            java.lang.String pwd_3idTemp = null;
        if(!pwd_3id.equals("")){
         pwd_3idTemp  = pwd_3id;
        }
        boolean insertLoginData20mtemp = sampleHelloWorldProxyid.insertLoginData(user_2idTemp,pwd_3idTemp);
        String tempResultreturnp21 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertLoginData20mtemp));
        %>
        <%= tempResultreturnp21 %>
        <%
break;
case 27:
        gotMethod = true;
        String eventName_4id=  request.getParameter("eventName30");
            java.lang.String eventName_4idTemp = null;
        if(!eventName_4id.equals("")){
         eventName_4idTemp  = eventName_4id;
        }
        String eventDesc_5id=  request.getParameter("eventDesc32");
            java.lang.String eventDesc_5idTemp = null;
        if(!eventDesc_5id.equals("")){
         eventDesc_5idTemp  = eventDesc_5id;
        }
        String eventVenue_6id=  request.getParameter("eventVenue34");
            java.lang.String eventVenue_6idTemp = null;
        if(!eventVenue_6id.equals("")){
         eventVenue_6idTemp  = eventVenue_6id;
        }
        String eventDate_7id=  request.getParameter("eventDate36");
            java.lang.String eventDate_7idTemp = null;
        if(!eventDate_7id.equals("")){
         eventDate_7idTemp  = eventDate_7id;
        }
        String eventTime_8id=  request.getParameter("eventTime38");
            java.lang.String eventTime_8idTemp = null;
        if(!eventTime_8id.equals("")){
         eventTime_8idTemp  = eventTime_8id;
        }
        sampleHelloWorldProxyid.insertHostEventData(eventName_4idTemp,eventDesc_5idTemp,eventVenue_6idTemp,eventDate_7idTemp,eventTime_8idTemp);
break;
case 40:
        gotMethod = true;
        String name_9id=  request.getParameter("name43");
            java.lang.String name_9idTemp = null;
        if(!name_9id.equals("")){
         name_9idTemp  = name_9id;
        }
        java.lang.String sayHello40mtemp = sampleHelloWorldProxyid.sayHello(name_9idTemp);
if(sayHello40mtemp == null){
%>
<%=sayHello40mtemp %>
<%
}else{
        String tempResultreturnp41 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(sayHello40mtemp));
        %>
        <%= tempResultreturnp41 %>
        <%
}
break;
case 45:
        gotMethod = true;
        String email_10id=  request.getParameter("email48");
            java.lang.String email_10idTemp = null;
        if(!email_10id.equals("")){
         email_10idTemp  = email_10id;
        }
        String eventName_11id=  request.getParameter("eventName50");
            java.lang.String eventName_11idTemp = null;
        if(!eventName_11id.equals("")){
         eventName_11idTemp  = eventName_11id;
        }
        sampleHelloWorldProxyid.sendEmail(email_10idTemp,eventName_11idTemp);
break;
case 52:
        gotMethod = true;
        java.lang.String[] getEventsData52mtemp = sampleHelloWorldProxyid.getEventsData();
if(getEventsData52mtemp == null){
%>
<%=getEventsData52mtemp %>
<%
}else{
        String tempreturnp53 = null;
        if(getEventsData52mtemp != null){
        java.util.List listreturnp53= java.util.Arrays.asList(getEventsData52mtemp);
        tempreturnp53 = listreturnp53.toString();
        }
        %>
        <%=tempreturnp53%>
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