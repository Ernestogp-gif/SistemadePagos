window.onload=function() {
	GenerarReporteRecargas()
}


function GenerarReporteRecargas(){

    $.ajax({
        url: 'http://localhost:8080/Reportes/ConsultarRecargas',
        type: 'GET',
        dataType:'json',
        contentType: "application/json; charset=utf-8",
        success: function(json){
	console.log(json);
			TblCuerpoRecarga = document.getElementById("TblCuerpoRecarga");
        	for(var i in json){	
    			TblCuerpoRecarga.innerHTML = TblCuerpoRecarga.innerHTML + "<th>" + json[i].fecha + "</th>" 
									    			+ "<th>" + json[i].codigo + "</th>" 
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