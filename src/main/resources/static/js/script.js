/**
 * 
 */
function validateForm() {
    var a = document.forms["regForm"]["firstName"].value;
    var b = document.forms["regForm"]["lastName"].value;
    var c = document.forms["regForm"]["eMail"].value;
    var d = document.forms["regForm"]["phoneNumber"].value;
    var e = document.forms["regForm"]["password"].value;
    
    if (a == "") {
        alert("First name must be filled out");
        return false;
    } else if (b == "") {
        alert("Last name must be filled out");
        return false;
    }else if (c == "") {
        alert("E-mail must be filled out");
        return false;
    }else if (d == "") {
        alert("Phone number must be filled out");
        return false;
    }else if (e == "") {
        alert("Password must be filled out");
        return false;
    }
}