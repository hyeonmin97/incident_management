<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <link rel="stylesheet" href="resources/css/header.css">
 
<div class ="menu">
     <ul>
          <li><a href="/home" class="active">Home</a></li>
          <li><a href="dataTable" onClick="changeContent('main');">center_List</a></li>
          <li><a href="#">defect_Type</a></li>
          <li><a href="#">engineer_List</a></li>
          <li><a href="#">periodic_Inspection</a></li>
          <li><a href="#">processing_Type</a></li>
          <li><a href="#">step_Progressive</a></li>
          <li><a href="#">store_List</a></li>
     </ul>
</div>

<script>
   function changeContent(name){
      $('#bodyContents').children().remove().load("/layout/"+name);
   }
</script>