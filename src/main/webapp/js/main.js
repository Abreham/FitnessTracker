$(function(){
	$.getJSON('http://localhost:8080/FitnesstrackerGradle/activities.json',{
		ajax : 'true'	
	},function(results){
		var html = '<option value=""> --Please select one --</option>';
		  $.each(results,function(key,value) {
		        html += '<option value="' + value.desc + '">'
		        		   + value.desc + '</option>';
		    });	
		  
		  $('#activities').html(html);
	});	
});