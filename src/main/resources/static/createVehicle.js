$(document).ready(
		function() {
		var feeId = 0;
            $.ajax({
            type:"GET",
            contentType:"application/json",
            url: "brands",
            dataType: 'json',
            success: function(response){
                          var s = '<option value=' + -1 + '>Select Brands</option>';

                    	var result = response.result;
                    	for (var i = 0; i < result.length; i++) {
                    	    console.log(result[i]);
                    		s += '<option value="' + result[i].id + '">'+ result[i].brandName+ '</option>';
                    	}
                    	$('#brands').html(s);

            },
            error: function(e){
             var loginError = e["responseJSON"];
              alert(loginError["message"]);
            }
            });
              $("#brands").change(function() {
                  var brandId = $(this).val();
                  if (brandId > 0) {
            $.ajax({
                        type:"GET",
                        contentType:"application/json",
                        url: "model/brandId",
                        dataType: 'json',
                        data : jQuery.param({brandId: brandId}),
                        success: function(response){
                         var s = '<option value=' + -1 + '>Select Models</option>';

                          var result = response.result;
                           for (var i = 0; i < result.length; i++) {
                           console.log(result[i]);
                           s += '<option value="' + result[i].id + '">'+ result[i].modelName+ '</option>';
                           }
                           $('#models').html(s);
                        },
                        error: function(e){
                         var loginError = e["responseJSON"];
                          alert(loginError["message"]);
                        }
                        });
                 }

               });


             $.ajax({
                      type:"GET",
                        contentType:"application/json",
                      url: "vehicleTypes",
                       dataType: 'json',
                       success: function(response){
                          var s = '<option value=' + -1 + '>Select Vehicle Types</option>';

                          var result = response.result;
                          for (var i = 0; i < result.length; i++) {
                          s += '<option value="' + result[i].id + '">'+ result[i].vehicleTypeName+ '</option>';
                          }
                          $('#vehicleTypes').html(s);
                     },
                      error: function(e){
                       var loginError = e["responseJSON"];
                       alert(loginError["message"]);
                        }
                         });



              $("#createVehicle").submit(function(event) {
              				// Prevent the form from submitting via the browser.
              				event.preventDefault();
              				createVehicle();
              			});
              			function createVehicle() {
              			//todo call crate vehicle
              				var brandId = $("#brands").val();
              				var modelId = $("#models").val();
              				var vehicleTypes = $("#vehicleTypes").val();
              				var modelYear = $("#modelYear").val();
              				var color = $("#color").val();
              				var capacity = $("#capacity").val();
              				var plateNumber = $("#plateNumber").val();
              				console.log(feeId);
              				//url - /v1/vehicle/vehicle
              				//todo create vehicle api call
              			}
              $("#addBrand").click(function(){
               console.log("Add Brand");
              });
               $("#addModel").click(function(){
                      console.log("Add Model");
                  });
               $("#addVehicleType").click(function(){
                  console.log("Add Vehicle Type");
               });
               $("#addRent").click(function(){
               console.log("Add Rent");

               });
                $("#addFee").click(function(){
                console.log("add fee")
                     createFee();
                });

                function createFee(){
                                var feePerHr = $("#fee_per_hr").val();
                                var feePerDay = $("#fee_per_day").val();
                                //create fee api
                                	$.ajax({
                                					type : "POST",
                                					contentType : "application/json",
                                					url : "/v1/rent/fee",
                                                    data : jQuery.param({ per_hr: feePerHr, per_day : feePerDay}),
                                                     contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
                                					dataType : 'json',
                                					success : function(response) {
                                					 var result = response.result;
                                					feeId = result.id;
                                   },
                                					error : function(e) {

                                                        var loginError = e["responseJSON"];
                                                        alert(loginError["message"]);

                                					}
                                				});

                                }
		})