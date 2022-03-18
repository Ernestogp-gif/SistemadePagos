function BtnRecargar(){
    console.log("recarga");
}

window.onload = TraerSaldo();


function TraerSaldo(){
	
	var data = "12876543928";//document.getElementById('').value;
	$.ajax({
	url: 'http://localhost:8080/api/Saldo',
	type: 'POST',
	dataType:'text',
	data: JSON.stringify(data),
	contentType: "application/json; charset=utf-8",
	success: function(json){
		document.getElementById('Saldo').innerText = json;
      },
      	    error: function(xhr, statusText, errorThrown){
			console.log(xhr);
			console.log(statusText);
			console.log(errorThrown);
			console.warn(xhr.responseText)
        }
	});
}
