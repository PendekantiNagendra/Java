/**
 * 
 */
function strDemo() {
	var res="";
	var str="Welcome to HTML Programming....";
	var len = str.length;
	res += "Length is " + len + "<br/>";
	res += "Lower-Case String is <b>" + str.toLowerCase() + "</b><br/><br/>";
	res += "Upper-Case String is <b>" + str.toUpperCase() + "</b><br/><br/>";
	res += "First Occurance of 'a' is <b>" + str.indexOf("a") + "</b><br/><br/>";
	res += "Char at 5th Position is <b>" + str.charAt(5) +  "</b><br/><br/>";
	res += "Replacing String is <b>" + str.replace("HTML", "HTML 5") +  "</b><br/><br/>";
	document.getElementById("res").innerHTML= res;
}