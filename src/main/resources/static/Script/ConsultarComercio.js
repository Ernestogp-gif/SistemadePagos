window.onload=function() {
	GenerarReportePagos();
}

function GenerarReportePagos(){

    $.ajax({
        url: 'http://localhost:8080/Reportes/ConsultarPagos',
        type: 'GET',
        dataType:'json',
        contentType: "application/json; charset=utf-8",
        success: function(json){
			TblCuerpo = document.getElementById("TblCuerpo");
        	for(var i in json){	
    			TblCuerpo.innerHTML = TblCuerpo.innerHTML + "<th>" + json[i].fecha + "</th>" 
									    			+ "<th>" + json[i].cod + "</th>" 
									    			+ "<th>" + json[i].servicio + "</th>" 
									    			+ "<th>" + json[i].monto + "</th>" 
				
    		}
          },
                  error: function(xhr, statusText, errorThrown){
                console.log(xhr);
                console.log(statusText);
                console.log(errorThrown);
            }
        });
}

