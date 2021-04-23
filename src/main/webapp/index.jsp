<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring MVC 데이터베이스 연동</title>
<style type="text/css">
	a{text-decoration: none;}
</style>
<script type="text/javascript">
	$(document).ready(function () {
		var mode = "${mode}";
		
		if(mode == "insert"){
			$('#insertData').attr('disabled',false);
			$('#updateData').attr('disabled',true);
			$('#deleteData').attr('disabled',true);
		} else if(mode == "update"){
			$('#insertData').attr('disabled',true);
			$('#updateData').attr('disabled',false);
			$('#deleteData').attr('disabled',false);
		} 
		
		$("#insertData").click(function () {
			if(!validateForm()){
				return;
			} 
			if(confirm('등록을 진행할까요?')){
				$("#deptForm").attr.("action", "/department/insertDepartment.do");
				$("#deptForm").submit();
			}
		});
		
		$("#updateData").click(function () {
			if(!validateForm()) return;
			if(confirm('수정을 진행할까요?')){
				$("#deptForm").attr.("action", "/department/updateDepartment.do");
				$("#deptForm").submit();
			}
		});
		
		$("#deleteData").click(function () {
			if(confirm('삭제를 진행할까요?')){
				$("#deptForm").attr.("action", "/department/deleteDepartment.do");
				$("#deptForm").submit();
			}
		});
		
		$("#closeWindow").click(function () {
			window.close();
		});
		
	});
	
	
	
	function validateForm() {
		if ($("#deptid").val().replace(/\s/g, "") == ""){
			alert('학과코드를 입력해주세요.')
			return false;
		}
		
		if ($("#deptname").val().replace(/\s/g, "") == ""){
			alert('학과명를 입력해주세요.')
			return false;
		} 
		
		return true;
	}
	
</script>
</head>
<body>
	<a href="department/listDepartment.do">[학과 데이터]</a>
</body>
</html>