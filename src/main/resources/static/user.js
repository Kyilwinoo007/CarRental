$(document).ready(
		function() {
			// SUBMIT FORM
			$("#loginUser").submit(function(event) {
				// Prevent the form from submitting via the browser.
				event.preventDefault();
				ajaxLoginUser();
			});

			function ajaxLoginUser() {

				var email = $("#email").val();
				var password = $("#password").val();

				// DO POST
				$.ajax({
					type : "POST",
					contentType : "application/json",
					url : "login",
                    data : jQuery.param({ email: email, password : password}),
                     contentType: 'application/x-www-form-urlencoded; charset=UTF-8',
					dataType : 'json',
					success : function(result) {
					alert(result.message);
					window.location = '/v1/home';

//					 window.location.href = '/JspControllerHandler?employee='+ JSON.stringify(emp); // redirect     //this would be GET
					},
					error : function(e) {

                        var loginError = e["responseJSON"];
                        alert(loginError["message"]);

					}
				});

			}
			//Register User
			$("#registerUser").submit(function(event) {
            				// Prevent the form from submitting via the browser.
            				event.preventDefault();
            				ajaxRegisterUser();
            			});

            			function ajaxRegisterUser() {

            				// PREPARE FORM DATA
            				var formData = {
            				    firstName: $("#firstName").val(),
            				    lastName: $("#lastName").val(),
            					email : $("#email").val(),
            					phone : $("#phone").val(),
            					password : $("#password").val()
            				}


            				// DO POST
            				$.ajax({
            					type : "POST",
            					contentType : "application/json",
            					url : "register",
            					data : JSON.stringify(formData),
            					dataType : 'json',
            					success : function(result) {
            					alert(result.message);
            					window.location = '/v1/home';
            					},
            					error : function(e) {
            					   var loginError = e["responseJSON"];
                                   alert(loginError["message"]);

            					}
            				});

            			}

		})