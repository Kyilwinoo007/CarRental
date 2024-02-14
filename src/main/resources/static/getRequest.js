$(document).ready(
		function() {
            $.ajax({
            type:"GET",
            contentType:"application/json",
            url: "brands",
            dataType: 'json',
            success: function(result){
            console.log(result);
            },
            error: function(e){
             var loginError = e["responseJSON"];
              alert(loginError["message"]);
            }
            })


		})