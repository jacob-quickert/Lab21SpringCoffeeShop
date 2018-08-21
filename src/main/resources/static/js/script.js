/**
 * 
 */
function validateForm() {
    var a = document.forms["regForm"]["firstName"].value;
    var b = document.forms["regForm"]["lastName"].value;
    var c = document.forms["regForm"]["eMail"].value;
    var d = document.forms["regForm"]["phoneNumber"].value;
    var e = document.forms["regForm"]["password"].value;
    var f = document.forms["regForm"]["confirm_password"].value;
    
    if (a == "") {
        alert("First name must be filled out");
        return false;
    } else if (b == "") {
        alert("Last name must be filled out");
        return false;
    }else if (c == "") {
        alert("E-mail must be filled out");
        return false;
    }else if (d != ^((([0-9]{3}))|([0-9]{3}))[-\s\.]?[0-9]{3}[-\s\.]?[0-9]{4}$) {
        alert("Phone number must be a valid length and format (10 digits long) ");
        return false;
    }else if (e != f) {
        alert("Passwords must match");
        return false;
    }
}

var check = function() {
	  if (document.getElementById('password').value ==
	    document.getElementById('confirm_password').value) {
	    document.getElementById('message').style.color = 'green';
	    document.getElementById('message').innerHTML = 'matching';
	  } else {
	    document.getElementById('message').style.color = 'red';
	    document.getElementById('message').innerHTML = 'not matching';
	  }
	}