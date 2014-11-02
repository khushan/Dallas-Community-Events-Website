<%@page contentType="text/html;charset=UTF-8"%>
<% request.setCharacterEncoding("UTF-8"); %>
<HTML>
<HEAD>
<TITLE>Result</TITLE>
</HEAD>
<BODY>
<H1>Result</H1>

<jsp:useBean id="sampleCallServiceProxyid" scope="session" class="webTest.CallServiceProxy" />
<%
if (request.getParameter("endpoint") != null && request.getParameter("endpoint").length() > 0)
sampleCallServiceProxyid.setEndpoint(request.getParameter("endpoint"));
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
        java.lang.String getEndpoint2mtemp = sampleCallServiceProxyid.getEndpoint();
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
        sampleCallServiceProxyid.setEndpoint(endpoint_0idTemp);
break;
case 10:
        gotMethod = true;
        webTest.CallService getCallService10mtemp = sampleCallServiceProxyid.getCallService();
if(getCallService10mtemp == null){
%>
<%=getCallService10mtemp %>
<%
}else{
        if(getCallService10mtemp!= null){
        String tempreturnp11 = getCallService10mtemp.toString();
        %>
        <%=tempreturnp11%>
        <%
        }}
break;
case 13:
        gotMethod = true;
        String name_1id=  request.getParameter("name16");
            java.lang.String name_1idTemp = null;
        if(!name_1id.equals("")){
         name_1idTemp  = name_1id;
        }
        java.lang.String hello13mtemp = sampleCallServiceProxyid.hello(name_1idTemp);
if(hello13mtemp == null){
%>
<%=hello13mtemp %>
<%
}else{
        String tempResultreturnp14 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(hello13mtemp));
        %>
        <%= tempResultreturnp14 %>
        <%
}
break;
case 18:
        gotMethod = true;
        String firstName_2id=  request.getParameter("firstName21");
            java.lang.String firstName_2idTemp = null;
        if(!firstName_2id.equals("")){
         firstName_2idTemp  = firstName_2id;
        }
        String lastName_3id=  request.getParameter("lastName23");
            java.lang.String lastName_3idTemp = null;
        if(!lastName_3id.equals("")){
         lastName_3idTemp  = lastName_3id;
        }
        String userName_4id=  request.getParameter("userName25");
            java.lang.String userName_4idTemp = null;
        if(!userName_4id.equals("")){
         userName_4idTemp  = userName_4id;
        }
        String password_5id=  request.getParameter("password27");
            java.lang.String password_5idTemp = null;
        if(!password_5id.equals("")){
         password_5idTemp  = password_5id;
        }
        boolean signUp18mtemp = sampleCallServiceProxyid.signUp(firstName_2idTemp,lastName_3idTemp,userName_4idTemp,password_5idTemp);
        String tempResultreturnp19 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(signUp18mtemp));
        %>
        <%= tempResultreturnp19 %>
        <%
break;
case 29:
        gotMethod = true;
        String country_6id=  request.getParameter("country32");
            java.lang.String country_6idTemp = null;
        if(!country_6id.equals("")){
         country_6idTemp  = country_6id;
        }
        java.lang.String[] ajaxCall29mtemp = sampleCallServiceProxyid.ajaxCall(country_6idTemp);
if(ajaxCall29mtemp == null){
%>
<%=ajaxCall29mtemp %>
<%
}else{
        String tempreturnp30 = null;
        if(ajaxCall29mtemp != null){
        java.util.List listreturnp30= java.util.Arrays.asList(ajaxCall29mtemp);
        tempreturnp30 = listreturnp30.toString();
        }
        %>
        <%=tempreturnp30%>
        <%
}
break;
case 34:
        gotMethod = true;
        java.lang.String[] fetchPickupDetails34mtemp = sampleCallServiceProxyid.fetchPickupDetails();
if(fetchPickupDetails34mtemp == null){
%>
<%=fetchPickupDetails34mtemp %>
<%
}else{
        String tempreturnp35 = null;
        if(fetchPickupDetails34mtemp != null){
        java.util.List listreturnp35= java.util.Arrays.asList(fetchPickupDetails34mtemp);
        tempreturnp35 = listreturnp35.toString();
        }
        %>
        <%=tempreturnp35%>
        <%
}
break;
case 37:
        gotMethod = true;
        String id1_7id=  request.getParameter("id140");
            java.lang.String id1_7idTemp = null;
        if(!id1_7id.equals("")){
         id1_7idTemp  = id1_7id;
        }
        String q1_8id=  request.getParameter("q142");
        int q1_8idTemp  = Integer.parseInt(q1_8id);
        String subTot1_9id=  request.getParameter("subTot144");
        float subTot1_9idTemp  = Float.parseFloat(subTot1_9id);
        String id2_10id=  request.getParameter("id246");
            java.lang.String id2_10idTemp = null;
        if(!id2_10id.equals("")){
         id2_10idTemp  = id2_10id;
        }
        String q2_11id=  request.getParameter("q248");
        int q2_11idTemp  = Integer.parseInt(q2_11id);
        String subTot2_12id=  request.getParameter("subTot250");
        float subTot2_12idTemp  = Float.parseFloat(subTot2_12id);
        String id3_13id=  request.getParameter("id352");
            java.lang.String id3_13idTemp = null;
        if(!id3_13id.equals("")){
         id3_13idTemp  = id3_13id;
        }
        String q3_14id=  request.getParameter("q354");
        int q3_14idTemp  = Integer.parseInt(q3_14id);
        String subTot3_15id=  request.getParameter("subTot356");
        float subTot3_15idTemp  = Float.parseFloat(subTot3_15id);
        String total_16id=  request.getParameter("total58");
        float total_16idTemp  = Float.parseFloat(total_16id);
        String firstName_17id=  request.getParameter("firstName60");
            java.lang.String firstName_17idTemp = null;
        if(!firstName_17id.equals("")){
         firstName_17idTemp  = firstName_17id;
        }
        String lastName_18id=  request.getParameter("lastName62");
            java.lang.String lastName_18idTemp = null;
        if(!lastName_18id.equals("")){
         lastName_18idTemp  = lastName_18id;
        }
        String country_19id=  request.getParameter("country64");
            java.lang.String country_19idTemp = null;
        if(!country_19id.equals("")){
         country_19idTemp  = country_19id;
        }
        String state_20id=  request.getParameter("state66");
            java.lang.String state_20idTemp = null;
        if(!state_20id.equals("")){
         state_20idTemp  = state_20id;
        }
        String city_21id=  request.getParameter("city68");
            java.lang.String city_21idTemp = null;
        if(!city_21id.equals("")){
         city_21idTemp  = city_21id;
        }
        String address1_22id=  request.getParameter("address170");
            java.lang.String address1_22idTemp = null;
        if(!address1_22id.equals("")){
         address1_22idTemp  = address1_22id;
        }
        String address2_23id=  request.getParameter("address272");
            java.lang.String address2_23idTemp = null;
        if(!address2_23id.equals("")){
         address2_23idTemp  = address2_23id;
        }
        String cardType_24id=  request.getParameter("cardType74");
            java.lang.String cardType_24idTemp = null;
        if(!cardType_24id.equals("")){
         cardType_24idTemp  = cardType_24id;
        }
        String cardNo_25id=  request.getParameter("cardNo76");
            java.lang.String cardNo_25idTemp = null;
        if(!cardNo_25id.equals("")){
         cardNo_25idTemp  = cardNo_25id;
        }
        String securityNo_26id=  request.getParameter("securityNo78");
        int securityNo_26idTemp  = Integer.parseInt(securityNo_26id);
        String expiryMonth_27id=  request.getParameter("expiryMonth80");
        int expiryMonth_27idTemp  = Integer.parseInt(expiryMonth_27id);
        String expiryYear_28id=  request.getParameter("expiryYear82");
        int expiryYear_28idTemp  = Integer.parseInt(expiryYear_28id);
        java.lang.String addCartDetails37mtemp = sampleCallServiceProxyid.addCartDetails(id1_7idTemp,q1_8idTemp,subTot1_9idTemp,id2_10idTemp,q2_11idTemp,subTot2_12idTemp,id3_13idTemp,q3_14idTemp,subTot3_15idTemp,total_16idTemp,firstName_17idTemp,lastName_18idTemp,country_19idTemp,state_20idTemp,city_21idTemp,address1_22idTemp,address2_23idTemp,cardType_24idTemp,cardNo_25idTemp,securityNo_26idTemp,expiryMonth_27idTemp,expiryYear_28idTemp);
if(addCartDetails37mtemp == null){
%>
<%=addCartDetails37mtemp %>
<%
}else{
        String tempResultreturnp38 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addCartDetails37mtemp));
        %>
        <%= tempResultreturnp38 %>
        <%
}
break;
case 84:
        gotMethod = true;
        String firstName_29id=  request.getParameter("firstName87");
            java.lang.String firstName_29idTemp = null;
        if(!firstName_29id.equals("")){
         firstName_29idTemp  = firstName_29id;
        }
        String lastName_30id=  request.getParameter("lastName89");
            java.lang.String lastName_30idTemp = null;
        if(!lastName_30id.equals("")){
         lastName_30idTemp  = lastName_30id;
        }
        String state_31id=  request.getParameter("state91");
            java.lang.String state_31idTemp = null;
        if(!state_31id.equals("")){
         state_31idTemp  = state_31id;
        }
        String city_32id=  request.getParameter("city93");
            java.lang.String city_32idTemp = null;
        if(!city_32id.equals("")){
         city_32idTemp  = city_32id;
        }
        String address1_33id=  request.getParameter("address195");
            java.lang.String address1_33idTemp = null;
        if(!address1_33id.equals("")){
         address1_33idTemp  = address1_33id;
        }
        String address2_34id=  request.getParameter("address297");
            java.lang.String address2_34idTemp = null;
        if(!address2_34id.equals("")){
         address2_34idTemp  = address2_34id;
        }
        String datetime_35id=  request.getParameter("datetime99");
            java.lang.String datetime_35idTemp = null;
        if(!datetime_35id.equals("")){
         datetime_35idTemp  = datetime_35id;
        }
        String contact_36id=  request.getParameter("contact101");
            java.lang.String contact_36idTemp = null;
        if(!contact_36id.equals("")){
         contact_36idTemp  = contact_36id;
        }
        String message_37id=  request.getParameter("message103");
            java.lang.String message_37idTemp = null;
        if(!message_37id.equals("")){
         message_37idTemp  = message_37id;
        }
        boolean insertPickupDetails84mtemp = sampleCallServiceProxyid.insertPickupDetails(firstName_29idTemp,lastName_30idTemp,state_31idTemp,city_32idTemp,address1_33idTemp,address2_34idTemp,datetime_35idTemp,contact_36idTemp,message_37idTemp);
        String tempResultreturnp85 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(insertPickupDetails84mtemp));
        %>
        <%= tempResultreturnp85 %>
        <%
break;
case 105:
        gotMethod = true;
        String userName_38id=  request.getParameter("userName108");
            java.lang.String userName_38idTemp = null;
        if(!userName_38id.equals("")){
         userName_38idTemp  = userName_38id;
        }
        String id1_39id=  request.getParameter("id1110");
            java.lang.String id1_39idTemp = null;
        if(!id1_39id.equals("")){
         id1_39idTemp  = id1_39id;
        }
        String q1_40id=  request.getParameter("q1112");
        int q1_40idTemp  = Integer.parseInt(q1_40id);
        String subTot1_41id=  request.getParameter("subTot1114");
        float subTot1_41idTemp  = Float.parseFloat(subTot1_41id);
        String id2_42id=  request.getParameter("id2116");
            java.lang.String id2_42idTemp = null;
        if(!id2_42id.equals("")){
         id2_42idTemp  = id2_42id;
        }
        String q2_43id=  request.getParameter("q2118");
        int q2_43idTemp  = Integer.parseInt(q2_43id);
        String subTot2_44id=  request.getParameter("subTot2120");
        float subTot2_44idTemp  = Float.parseFloat(subTot2_44id);
        String total_45id=  request.getParameter("total122");
        float total_45idTemp  = Float.parseFloat(total_45id);
        String firstName_46id=  request.getParameter("firstName124");
            java.lang.String firstName_46idTemp = null;
        if(!firstName_46id.equals("")){
         firstName_46idTemp  = firstName_46id;
        }
        String lastName_47id=  request.getParameter("lastName126");
            java.lang.String lastName_47idTemp = null;
        if(!lastName_47id.equals("")){
         lastName_47idTemp  = lastName_47id;
        }
        String country_48id=  request.getParameter("country128");
            java.lang.String country_48idTemp = null;
        if(!country_48id.equals("")){
         country_48idTemp  = country_48id;
        }
        String state_49id=  request.getParameter("state130");
            java.lang.String state_49idTemp = null;
        if(!state_49id.equals("")){
         state_49idTemp  = state_49id;
        }
        String city_50id=  request.getParameter("city132");
            java.lang.String city_50idTemp = null;
        if(!city_50id.equals("")){
         city_50idTemp  = city_50id;
        }
        String address1_51id=  request.getParameter("address1134");
            java.lang.String address1_51idTemp = null;
        if(!address1_51id.equals("")){
         address1_51idTemp  = address1_51id;
        }
        String address2_52id=  request.getParameter("address2136");
            java.lang.String address2_52idTemp = null;
        if(!address2_52id.equals("")){
         address2_52idTemp  = address2_52id;
        }
        String cardType_53id=  request.getParameter("cardType138");
            java.lang.String cardType_53idTemp = null;
        if(!cardType_53id.equals("")){
         cardType_53idTemp  = cardType_53id;
        }
        String cardNo_54id=  request.getParameter("cardNo140");
            java.lang.String cardNo_54idTemp = null;
        if(!cardNo_54id.equals("")){
         cardNo_54idTemp  = cardNo_54id;
        }
        String securityNo_55id=  request.getParameter("securityNo142");
        int securityNo_55idTemp  = Integer.parseInt(securityNo_55id);
        String expiryMonth_56id=  request.getParameter("expiryMonth144");
        int expiryMonth_56idTemp  = Integer.parseInt(expiryMonth_56id);
        String expiryYear_57id=  request.getParameter("expiryYear146");
        int expiryYear_57idTemp  = Integer.parseInt(expiryYear_57id);
        java.lang.String addSubscriptionDetails105mtemp = sampleCallServiceProxyid.addSubscriptionDetails(userName_38idTemp,id1_39idTemp,q1_40idTemp,subTot1_41idTemp,id2_42idTemp,q2_43idTemp,subTot2_44idTemp,total_45idTemp,firstName_46idTemp,lastName_47idTemp,country_48idTemp,state_49idTemp,city_50idTemp,address1_51idTemp,address2_52idTemp,cardType_53idTemp,cardNo_54idTemp,securityNo_55idTemp,expiryMonth_56idTemp,expiryYear_57idTemp);
if(addSubscriptionDetails105mtemp == null){
%>
<%=addSubscriptionDetails105mtemp %>
<%
}else{
        String tempResultreturnp106 = org.eclipse.jst.ws.util.JspUtils.markup(String.valueOf(addSubscriptionDetails105mtemp));
        %>
        <%= tempResultreturnp106 %>
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