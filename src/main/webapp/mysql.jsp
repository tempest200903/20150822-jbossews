<HTML>
<HEAD>
	<TITLE>JBossEAP6.0 JSP snoop page</TITLE>
	<%@ page import="javax.servlet.http.HttpUtils,java.util.Enumeration" %>
	<%@ page import="java.lang.management.*" %>
	<%@ page import="java.util.*" %>
</HEAD>
<BODY>

<H1>MySQL hello</H1>

<%=ManagementFactory.getMemoryMXBean().getHeapMemoryUsage()%>
<%

    Class.forName("com.mysql.jdbc.Driver");

    String host = System.getenv("OPENSHIFT_MYSQL_DB_HOST");
    String port = System.getenv("OPENSHIFT_MYSQL_DB_PORT");
    String url = "jdbc:mysql://"+host+":"+port+"/jbossews?user=adminrKlFQGM&password=lCwKLvrhrhKi";
    java.sql.DriverManager.getConnection(url);

%>

</BODY>
</HTML>

