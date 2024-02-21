$(document).ready(
//		function() {
//            $.ajax({
//            type:"GET",
//            contentType:"application/json",
//            url: "/v1/vehicle/vehicles",
//            dataType: 'json',
//            success: function(response){
//            console.log(response);
//                         var s = '';
//
//                    	var result = response.result;
//                    	for (var i = 0; i < result.length; i++) {
//                    	s += '<span th:text="brand" th:remove="tag">' + result[i].brand + " " + result[i].model  +'</span>';
//                    	}
//                    	$('#vehicleList').html(s);
//
//            },
//            error: function(e){
//             var loginError = e["responseJSON"];
//              alert(loginError["message"]);
//            }
//            });
		})