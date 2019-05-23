<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加图书</title>
</head>
  <body background="./imgs/11.jpg">
<form>
    <table align="center" width="200px" height="100px" border="1px" cellspacing="0" bordercolor="silver">
	 <caption align="top"><h1><font color="red">添加图书</font></h1><hr size="2px" color="red" width="600px"/></caption>
	 <tr align="center"><td>请选择分类:</td><td><select><option>计算机</option><option>哲学</option><option>管理</option><option>教辅</option></select></td></tr>
	 <tr align="center"><td>图&nbsp;书&nbsp;名&nbsp;称:</td><td><input type="text"/></td></tr>
	 <tr align="center"><td>图&nbsp;书&nbsp;价&nbsp;格:</td><td><input type="text"/></td></tr>
	 <tr align="center"><td>出&nbsp;&nbsp;&nbsp;版&nbsp;&nbsp;&nbsp;社:</td><td><input type="text"/></td></tr>
	 <tr align="center"><td>状&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;态:</td><td><input type="radio" name="zhuangtai" checked/>未借出&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="radio" name="zhuangtai"/>借出</td></tr>
	 <tr align="center"><td>借&nbsp;&nbsp;&nbsp;书&nbsp;&nbsp;&nbsp;人:</td><td><input type="text"/></td></tr>
	 <tr align="center"><td colspan="2"><input type="submit" value="添加"/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="reset" value="重填"/></td></tr>
	</table>
  </form>

</body>
</html>

